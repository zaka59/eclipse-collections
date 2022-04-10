/*
 * Copyright (c) 2022 Goldman Sachs and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package org.eclipse.collections.impl.list.util;


/**
 * Class used to handle odd and even numbers.
 * @Author:  Zakaria EL KHAYARI
 */
public final class NumberUtil
{

    /**
     * Private constructor to prevent instantiation.
     */
    private NumberUtil()
    {
        throw new AssertionError("Suppress default constructor for noninstantiability");
    }

    /**
     * Returns the next odd numbers.
     * @param from the start of the range.
     * @param to the end of the range.
     * @return the next odd numbers of from and to.
     */
    public static int[] setOdd(int from, int to)
    {
        if (from % 2 == 0)
        {
            if (from < to)
            {
                from++;
            }
            else
            {
                from--;
            }
        }
        if (to % 2 == 0)
        {
            if (to > from)
            {
                to--;
            }
            else
            {
                to++;
            }
        }
        return new int[] {from,to};

    }

    /**
     * Returns the next even numbers.
     * @param from the start of the range.
     * @param to the end of the range.
     * @return the next even numbers of from and to.
     */
    public static int[] setEven(int from, int to)
    {

        if (from % 2 != 0)
        {
            if (from < to)
            {
                from++;
            }
            else
            {
                from--;
            }
        }
        if (to % 2 != 0)
        {
            if (to > from)
            {
                to--;
            }
            else
            {
                to++;
            }
        }
        return new int[] {from,to};
    }
}
