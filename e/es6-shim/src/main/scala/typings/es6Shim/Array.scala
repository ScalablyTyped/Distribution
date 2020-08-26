package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  /**
    * Shim for an ES6 iterable. Not intended for direct use by user code.
    */
  def `_es6-shim iterator_`(): IterableIteratorShim[T] = js.native
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: Double, start: Double): Array[T] = js.native
  def copyWithin(target: Double, start: Double, end: Double): Array[T] = js.native
  /**
    * Returns an array of key, value pairs for every entry in the array
    */
  def entries(): IterableIteratorShim[js.Tuple2[Double, T]] = js.native
  /**
    * Returns the this object after filling the section identified by start and end with value
    * @param value value to fill array section with
    * @param start index to start filling the array at. If start is negative, it is treated as
    * length+start where length is the length of the array.
    * @param end index to stop filling the array at. If end is negative, it is treated as
    * length+end.
    */
  def fill(value: T): Array[T] = js.native
  def fill(value: T, start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
  def fill(value: T, start: Double): Array[T] = js.native
  def fill(value: T, start: Double, end: Double): Array[T] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean]): js.UndefOr[T] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean],
    thisArg: js.Any
  ): js.UndefOr[T] = js.native
  /**
    * Returns the index of the first element in the array where predicate is true, and -1 otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
  def findIndex(predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
  /**
    * Returns an list of keys in the array
    */
  def keys(): IterableIteratorShim[Double] = js.native
  /**
    * Returns an list of values in the array
    */
  def values(): IterableIteratorShim[T] = js.native
}

