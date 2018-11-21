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
       * @since 1.0.0
       * @param {NonEmptyArray<(a: A) => B>} fab
       * @example
       * const x = new NonEmptyArray(1, [2])
       * const double = (n: number) => n * 2
       * assert.deepEqual(x.ap(new NonEmptyArray(double, [double])).toArray(), [2, 4, 2, 4])
       * @returns {NonEmptyArray<B>}
       */
  def ap[B](fab: NonEmptyArray[js.Function1[/* a */ A, B]]): NonEmptyArray[B] = js.native
  /**
       * Same as {@link ap} but works on {@link NonEmptyArray} of functions and accepts {@link NonEmptyArray} of values instead
       * @since 1.0.0
       * @this {NonEmptyArray<(b: B) => C>}
       * @param {NonEmptyArray<B>} fb
       * @example
       * const x = new NonEmptyArray(1, [2])
       * const double = (n: number) => n * 2
       * assert.deepEqual(new NonEmptyArray(double, [double]).ap_(x).toArray(), [2, 4, 2, 4])
       * @returns {NonEmptyArray<C>}
       */
  def `ap_`[B, C](`this`: NonEmptyArray[js.Function1[/* b */ B, C]], fb: NonEmptyArray[B]): NonEmptyArray[C] = js.native
  /**
       * Instance-bound implementation of {@link Chain}
       * @since 1.0.0
       * @param {(a: A) => NonEmptyArray<B>} f
       * @example
       * const x = new NonEmptyArray(1, [2])
       * const f = (a: number) => new NonEmptyArray(a, [4])
       * assert.deepEqual(x.chain(f).toArray(), [1, 4, 2, 4])
       * @returns {NonEmptyArray<B>}
       */
  def chain[B](f: js.Function1[/* a */ A, NonEmptyArray[B]]): NonEmptyArray[B] = js.native
  /**
       * Instance-bound implementation of {@link Semigroup}
       * @since 1.0.0
       * @param {NonEmptyArray<A>} y
       * @example
       * const x = new NonEmptyArray(1, [2])
       * const y = new NonEmptyArray(3, [4])
       * assert.deepEqual(x.concat(y).toArray(), [1, 2, 3, 4])
       * @returns {NonEmptyArray<A>}
       */
  def concat(y: NonEmptyArray[A]): NonEmptyArray[A] = js.native
  /**
       * Concatenates this {@link NonEmptyArray} and passed {@link Array}
       * @since 1.0.0
       * @param {Array<A>} as - {@link Array}
       * @example
       * assert.deepEqual(new NonEmptyArray(1, []).concatArray([2]), new NonEmptyArray(1, [2]))
       * @returns {NonEmptyArray<A>}
       */
  def concatArray(as: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A] = js.native
  /**
       * Instance-bound implementation of {@link Extend}
       * @since 1.0.0
       * @param {(fa: NonEmptyArray<A>) => B} f
       * @example
       * const sum = (as: NonEmptyArray<number>) => fold(monoidSum)(as.toArray())
       * assert.deepEqual(new NonEmptyArray(1, [2, 3, 4]).extend(sum), new NonEmptyArray(10, [9, 7, 4]))
       * @returns {NonEmptyArray<B>}
       */
  def extend[B](f: js.Function1[/* fa */ NonEmptyArray[A], B]): NonEmptyArray[B] = js.native
  /**
       * Instance-bound implementation of {@link Comonad}
       * @since 1.0.0
       * @example
       * assert.strictEqual(new NonEmptyArray(1, [2, 3]).extract(), 1)
       * @returns {A}
       */
  def extract(): A = js.native
  /**
       * Same as {@link toString}
       * @since 1.0.0
       * @returns {string}
       */
  def inspect(): java.lang.String = js.native
  /**
       * Gets last element of this {@link NonEmptyArray}
       * @since 1.6.0
       * @example
       * const last = new NonEmptyArray(1, [2, 3]).last(); // 3
       * const last = new NonEmptyArray(1, []).last(); // 1
       * @returns {A}
       */
  def last(): A = js.native
  /**
       * Instance-bound implementation of {@link Functor}
       * @since 1.0.0
       * @param {(a: A) => B} f
       * @example
       * const double = (n: number): number => n * 2
       * assert.deepEqual(new NonEmptyArray(1, [2]).map(double), new NonEmptyArray(2, [4]))
       * @returns {NonEmptyArray<B>}
       */
  def map[B](f: js.Function1[/* a */ A, B]): NonEmptyArray[B] = js.native
  /**
       * Gets maximum of this {@link NonEmptyArray} using specified {@link Ord} instance
       * @since 1.3.0
       * @param ord - {@link Ord} instance
       * @example
       * const maximum = new NonEmptyArray(1, [2, 3]).max(ordNumber) // 3
       * @returns {A}
       */
  def max(ord: fpDashTsLib.libOrdMod.Ord[A]): A = js.native
  /**
       * Gets minimum of this {@link NonEmptyArray} using specified {@link Ord} instance
       * @since 1.3.0
       * @param ord - {@link Ord} instance
       * @example
       * const minimum = new NonEmptyArray(1, [2, 3]).min(ordNumber) // 1
       * @returns {A}
       */
  def min(ord: fpDashTsLib.libOrdMod.Ord[A]): A = js.native
  /**
       * Instance-bound implementation of {@link Foldable}
       * @since 1.0.0
       * @param {B} b
       * @param {(b: B, a: A) => B} f
       * @example
       * const x = new NonEmptyArray('a', ['b'])
       * assert.strictEqual(x.reduce('', (b, a) => b + a), 'ab')
       * @returns {B}
       */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
       * Reverts this {@link NonEmptyArray}
       * @since 1.6.0
       * @example
       * const result = new NonEmptyArray(1, [2, 3]).reverse()
       * const expected = new NonEmptyArray(3, [2, 1])
       * assert.deepEqual(result, expected)
       * @returns {NonEmptyArray<A>}
       */
  def reverse(): NonEmptyArray[A] = js.native
  /**
       * Sorts this {@link NonEmptyArray} using specified {@link Ord} instance
       * @since 1.6.0
       * @param {Ord<A>} ord - {@link Ord} instance
       * @example
       * const result = new NonEmptyArray(3, [2, 1]).sort(ordNumber)
       * const expected = new NonEmptyArray(1, [2, 3])
       * assert.deepEqual(result, expected)
       * @returns {NonEmptyArray<A>}
       */
  def sort(ord: fpDashTsLib.libOrdMod.Ord[A]): NonEmptyArray[A] = js.native
  /**
       * Converts this {@link NonEmptyArray} to plain {@link Array}
       * @since 1.0.0
       * @example
       * assert.deepEqual(new NonEmptyArray(1, [2, 3]), [1, 2, 3])
       * @returns {Array<A>} foo
       */
  def toArray(): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
}

