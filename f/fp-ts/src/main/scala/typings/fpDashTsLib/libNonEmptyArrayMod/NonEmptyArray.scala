package typings
package fpDashTsLib.libNonEmptyArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/NonEmptyArray", "NonEmptyArray")
@js.native
class NonEmptyArray[A] protected () extends js.Object {
  def this(head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val head: A = js.native
  val tail: fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  /**
       * Instance-bound implementation of {@link Apply}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const x = new NonEmptyArray(1, [2])
       * const double = (n: number): number => n * 2
       * assert.deepEqual(x.ap(new NonEmptyArray(double, [double])).toArray(), [2, 4, 2, 4])
       */
  def ap[B](fab: NonEmptyArray[js.Function1[/* a */ A, B]]): NonEmptyArray[B] = js.native
  /**
       * Flipped version of {@link ap}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const x = new NonEmptyArray(1, [2])
       * const double = (n: number) => n * 2
       * assert.deepEqual(new NonEmptyArray(double, [double]).ap_(x).toArray(), [2, 4, 2, 4])
       */
  def `ap_`[B, C](`this`: NonEmptyArray[js.Function1[/* b */ B, C]], fb: NonEmptyArray[B]): NonEmptyArray[C] = js.native
  /**
       * Instance-bound implementation of {@link Chain}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const x = new NonEmptyArray(1, [2])
       * const f = (a: number) => new NonEmptyArray(a, [4])
       * assert.deepEqual(x.chain(f).toArray(), [1, 4, 2, 4])
       */
  def chain[B](f: js.Function1[/* a */ A, NonEmptyArray[B]]): NonEmptyArray[B] = js.native
  /**
       * Instance-bound implementation of {@link Semigroup}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const x = new NonEmptyArray(1, [2])
       * const y = new NonEmptyArray(3, [4])
       * assert.deepEqual(x.concat(y).toArray(), [1, 2, 3, 4])
       */
  def concat(y: NonEmptyArray[A]): NonEmptyArray[A] = js.native
  /**
       * Concatenates this {@link NonEmptyArray} and passed {@link Array}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * assert.deepEqual(new NonEmptyArray<number>(1, []).concatArray([2]), new NonEmptyArray(1, [2]))
       */
  def concatArray(as: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A] = js.native
  /**
       * Instance-bound implementation of {@link Extend}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       * import { fold, monoidSum } from 'fp-ts/lib/Monoid'
       *
       * const sum = (as: NonEmptyArray<number>) => fold(monoidSum)(as.toArray())
       * assert.deepEqual(new NonEmptyArray(1, [2, 3, 4]).extend(sum), new NonEmptyArray(10, [9, 7, 4]))
       */
  def extend[B](f: js.Function1[/* fa */ NonEmptyArray[A], B]): NonEmptyArray[B] = js.native
  /**
       * Instance-bound implementation of {@link Comonad}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * assert.strictEqual(new NonEmptyArray(1, [2, 3]).extract(), 1)
       */
  def extract(): A = js.native
  /**
       * Same as {@link toString}
       */
  def inspect(): java.lang.String = js.native
  /**
       * Gets last element of this {@link NonEmptyArray}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * assert.strictEqual(new NonEmptyArray(1, [2, 3]).last(), 3)
       * assert.strictEqual(new NonEmptyArray(1, []).last(), 1)
       *
       * @since 1.6.0
       */
  def last(): A = js.native
  /**
       * @since 1.10.0
       */
  def length(): scala.Double = js.native
  /**
       * Instance-bound implementation of {@link Functor}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const double = (n: number): number => n * 2
       * assert.deepEqual(new NonEmptyArray(1, [2]).map(double), new NonEmptyArray(2, [4]))
       */
  def map[B](f: js.Function1[/* a */ A, B]): NonEmptyArray[B] = js.native
  /**
       * Gets maximum of this {@link NonEmptyArray} using specified {@link Ord} instance
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       * import { ordNumber } from 'fp-ts/lib/Ord'
       *
       * assert.strictEqual(new NonEmptyArray(1, [2, 3]).max(ordNumber), 3)
       *
       * @since 1.3.0
       */
  def max(ord: fpDashTsLib.libOrdMod.Ord[A]): A = js.native
  /**
       * Gets minimum of this {@link NonEmptyArray} using specified {@link Ord} instance
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       * import { ordNumber } from 'fp-ts/lib/Ord'
       *
       * assert.strictEqual(new NonEmptyArray(1, [2, 3]).min(ordNumber), 1)
       *
       * @since 1.3.0
       */
  def min(ord: fpDashTsLib.libOrdMod.Ord[A]): A = js.native
  /**
       * Instance-bound implementation of {@link Foldable}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * const x = new NonEmptyArray('a', ['b'])
       * assert.strictEqual(x.reduce('', (b, a) => b + a), 'ab')
       */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
       * Reverts this {@link NonEmptyArray}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * assert.deepEqual(new NonEmptyArray(1, [2, 3]).reverse(), new NonEmptyArray(3, [2, 1]))
       *
       * @since 1.6.0
       */
  def reverse(): NonEmptyArray[A] = js.native
  /**
       * Sorts this {@link NonEmptyArray} using specified {@link Ord} instance
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       * import { ordNumber } from 'fp-ts/lib/Ord'
       *
       * assert.deepEqual(new NonEmptyArray(3, [2, 1]).sort(ordNumber), new NonEmptyArray(1, [2, 3]))
       *
       * @since 1.6.0
       */
  def sort(ord: fpDashTsLib.libOrdMod.Ord[A]): NonEmptyArray[A] = js.native
  /**
       * Converts this {@link NonEmptyArray} to plain {@link Array}
       *
       * @example
       * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
       *
       * assert.deepEqual(new NonEmptyArray(1, [2, 3]).toArray(), [1, 2, 3])
       */
  def toArray(): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
}

