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
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const x = new NonEmptyArray(1, [2])
    * const double = (n: number): number => n * 2
    * assert.deepStrictEqual(x.ap(new NonEmptyArray(double, [double])).toArray(), [2, 4, 2, 4])
    */
  def ap[B](fab: NonEmptyArray[js.Function1[/* a */ A, B]]): NonEmptyArray[B] = js.native
  /**
    * Flipped version of `ap`
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const x = new NonEmptyArray(1, [2])
    * const double = (n: number) => n * 2
    * assert.deepStrictEqual(new NonEmptyArray(double, [double]).ap_(x).toArray(), [2, 4, 2, 4])
    */
  def ap_[B, C](`this`: NonEmptyArray[js.Function1[/* b */ B, C]], fb: NonEmptyArray[B]): NonEmptyArray[C] = js.native
  /**
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const x = new NonEmptyArray(1, [2])
    * const f = (a: number) => new NonEmptyArray(a, [4])
    * assert.deepStrictEqual(x.chain(f).toArray(), [1, 4, 2, 4])
    */
  def chain[B](f: js.Function1[/* a */ A, NonEmptyArray[B]]): NonEmptyArray[B] = js.native
  /**
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const x = new NonEmptyArray(1, [2])
    * const y = new NonEmptyArray(3, [4])
    * assert.deepStrictEqual(x.concat(y).toArray(), [1, 2, 3, 4])
    */
  def concat(y: NonEmptyArray[A]): NonEmptyArray[A] = js.native
  /**
    * Concatenates this `NonEmptyArray` and passed `Array`
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * assert.deepStrictEqual(new NonEmptyArray<number>(1, []).concatArray([2]), new NonEmptyArray(1, [2]))
    */
  def concatArray(as: fpDashTsLib.libArrayMod.Global.Array[A]): NonEmptyArray[A] = js.native
  /**
    * @since 1.14.0
    */
  def every(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): scala.Boolean = js.native
  /**
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { fold, monoidSum } from 'fp-ts/lib/Monoid'
    *
    * const sum = (as: NonEmptyArray<number>) => fold(monoidSum)(as.toArray())
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3, 4]).extend(sum), new NonEmptyArray(10, [9, 7, 4]))
    */
  def extend[B](f: js.Function1[/* fa */ NonEmptyArray[A], B]): NonEmptyArray[B] = js.native
  /**
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * assert.strictEqual(new NonEmptyArray(1, [2, 3]).extract(), 1)
    */
  def extract(): A = js.native
  def filter(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  /**
    * @since 1.12.0
    */
  def filterWithIndex(predicate: js.Function2[/* i */ scala.Double, /* a */ A, scala.Boolean]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  /**
    * Filter an NonEmptyArray, keeping the elements which satisfy a predicate function, creating a new NonEmptyArray or returning `None` in case the resulting NonEmptyArray would have no remaining elements.
    *
    * @since 1.11.0
    */
  @JSName("filter")
  def filter_BA[B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[B]] = js.native
  def findFirst(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  /**
    * Find the first element which satisfies a predicate (or a refinement) function
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray({ a: 1, b: 1 }, [{ a: 1, b: 2 }]).findFirst(x => x.a === 1), some({ a: 1, b: 1 }))
    *
    * @since 1.11.0
    */
  @JSName("findFirst")
  def findFirst_BA[B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[B] = js.native
  /**
    * Find the first index for which a predicate holds
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some, none } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).findIndex(x => x === 2), some(1))
    * assert.deepStrictEqual(new NonEmptyArray<number>(1, []).findIndex(x => x === 2), none)
    *
    * @since 1.11.0
    */
  def findIndex(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  def findLast(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  /**
    * Returns the index of the last element of the list which matches the predicate
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some, none } from 'fp-ts/lib/Option'
    *
    * interface X {
    *   a: number
    *   b: number
    * }
    * const xs: NonEmptyArray<X> = new NonEmptyArray({ a: 1, b: 0 }, [{ a: 1, b: 1 }])
    * assert.deepStrictEqual(xs.findLastIndex(x => x.a === 1), some(1))
    * assert.deepStrictEqual(xs.findLastIndex(x => x.a === 4), none)
    *
    * @since 1.11.0
    */
  def findLastIndex(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libOptionMod.Option[scala.Double] = js.native
  /**
    * Find the last element which satisfies a predicate function
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray({ a: 1, b: 1 }, [{ a: 1, b: 2 }]).findLast(x => x.a === 1), some({ a: 1, b: 2 }))
    *
    * @since 1.11.0
    */
  @JSName("findLast")
  def findLast_BA[B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): fpDashTsLib.libOptionMod.Option[B] = js.native
  /**
    * @since 1.12.0
    */
  def foldr[B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B = js.native
  /**
    * @since 1.12.0
    */
  def foldrWithIndex[B](b: B, f: js.Function3[/* i */ scala.Double, /* a */ A, /* b */ B, B]): B = js.native
  /**
    * @since 1.11.0
    * @deprecated
    */
  def index(i: scala.Double): fpDashTsLib.libOptionMod.Option[A] = js.native
  /**
    * Insert an element at the specified index, creating a new NonEmptyArray, or returning `None` if the index is out of bounds
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3, 4]).insertAt(2, 5), some(new NonEmptyArray(1, [2, 5, 3, 4])))
    *
    * @since 1.11.0
    */
  def insertAt(i: scala.Double, a: A): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  /**
    * Same as `toString`
    */
  def inspect(): java.lang.String = js.native
  /**
    * Gets last element of this `NonEmptyArray`
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
    * This function provides a safe way to read a value at a particular index from an NonEmptyArray
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some, none } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).lookup(1), some(2))
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).lookup(3), none)
    *
    * @since 1.14.0
    */
  def lookup(i: scala.Double): fpDashTsLib.libOptionMod.Option[A] = js.native
  /**
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const double = (n: number): number => n * 2
    * assert.deepStrictEqual(new NonEmptyArray(1, [2]).map(double), new NonEmptyArray(2, [4]))
    */
  def map[B](f: js.Function1[/* a */ A, B]): NonEmptyArray[B] = js.native
  def mapWithIndex[B](f: js.Function2[/* i */ scala.Double, /* a */ A, B]): NonEmptyArray[B] = js.native
  /**
    * Gets maximum of this `NonEmptyArray` using specified `Ord` instance
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
    * Gets minimum of this `NonEmptyArray` using specified `Ord` instance
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
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * const x = new NonEmptyArray('a', ['b'])
    * assert.strictEqual(x.reduce('', (b, a) => b + a), 'ab')
    */
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
    * @since 1.12.0
    */
  def reduceWithIndex[B](b: B, f: js.Function3[/* i */ scala.Double, /* b */ B, /* a */ A, B]): B = js.native
  /**
    * Reverts this `NonEmptyArray`
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).reverse(), new NonEmptyArray(3, [2, 1]))
    *
    * @since 1.6.0
    */
  def reverse(): NonEmptyArray[A] = js.native
  /**
    * @since 1.14.0
    */
  def some(predicate: fpDashTsLib.libFunctionMod.Predicate[A]): scala.Boolean = js.native
  /**
    * Sorts this `NonEmptyArray` using specified `Ord` instance
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { ordNumber } from 'fp-ts/lib/Ord'
    *
    * assert.deepStrictEqual(new NonEmptyArray(3, [2, 1]).sort(ordNumber), new NonEmptyArray(1, [2, 3]))
    *
    * @since 1.6.0
    */
  def sort(ord: fpDashTsLib.libOrdMod.Ord[A]): NonEmptyArray[A] = js.native
  /**
    * Converts this `NonEmptyArray` to a plain `Array`
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).toArray(), [1, 2, 3])
    */
  def toArray(): fpDashTsLib.libArrayMod.Global.Array[A] = js.native
  /**
    * Converts this `NonEmptyArray` to a plain `Array` using the given map function
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    *
    * assert.deepStrictEqual(new NonEmptyArray('a', ['bb', 'ccc']).toArrayMap(s => s.length), [1, 2, 3])
    *
    * @since 1.14.0
    */
  def toArrayMap[B](f: js.Function1[/* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  /**
    * Change the element at the specified index, creating a new NonEmptyArray, or returning `None` if the index is out of bounds
    *
    * @example
    * import { NonEmptyArray } from 'fp-ts/lib/NonEmptyArray'
    * import { some, none } from 'fp-ts/lib/Option'
    *
    * assert.deepStrictEqual(new NonEmptyArray(1, [2, 3]).updateAt(1, 1), some(new NonEmptyArray(1, [1, 3])))
    * assert.deepStrictEqual(new NonEmptyArray(1, []).updateAt(1, 1), none)
    *
    * @since 1.11.0
    */
  def updateAt(i: scala.Double, a: A): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
}

