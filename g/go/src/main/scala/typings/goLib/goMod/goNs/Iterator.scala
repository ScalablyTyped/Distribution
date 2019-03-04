package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface defines properties and methods for iterating over a collection;
  * it provides the .next predicate and the .value read-only property.
  * Some Iterators also provide key property values along with each value.
  */
trait Iterator[T] extends Iterable[T] {
  /*This is an interface and thus does not have a constructor.*/
  /**This read-only property returns the total number of items in the iterated collection.*/
  var count: scala.Double
  /**This read-only property returns the current index to the item in the collection, assuming .next has just returned true.*/
  var key: js.Any
  /**This read-only property returns the current item in the collection, assuming .next has just returned true.*/
  var value: T
  /**
    * This is true if all invocations of the given predicate on items in the collection are true.
    * @param {(x: T) => boolean} pred
    */
  def all(pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean
  /**
    * This is true if any invocation of the given predicate on items in the collection is true.
    * @param {(x: T) => boolean} pred
    */
  def any(pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean
  /**
    * Call the given function on each item in the collection.
    * @param {(x: T) => void} func
    */
  def each(func: js.Function1[/* x */ T, scala.Unit]): scala.Unit
  /**
    * Call the given predicate on each item in the collection and for each item that it returns true, present the item in an iterator.
    * @param {function(T):boolean} pred This function must not have any side-effects.
    */
  def filter(pred: js.Function1[/* x */ T, scala.Boolean]): Iterator[T]
  /**
    * Return the first item in the collection, or null if there is none.
    */
  def first(): T
  /**
    * Call this method to advance the iterator to the next item in the collection.
    */
  def next(): scala.Boolean
  /**
    * Start this iterator all over again.
    */
  def reset(): scala.Unit
}

object Iterator {
  @scala.inline
  def apply[T](
    all: js.Function1[js.Function1[/* x */ T, scala.Boolean], scala.Boolean],
    any: js.Function1[js.Function1[/* x */ T, scala.Boolean], scala.Boolean],
    count: scala.Double,
    each: js.Function1[js.Function1[/* x */ T, scala.Unit], scala.Unit],
    filter: js.Function1[js.Function1[/* x */ T, scala.Boolean], Iterator[T]],
    first: js.Function0[T],
    iterator: Iterator[T],
    key: js.Any,
    next: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    value: T
  ): Iterator[T] = {
    val __obj = js.Dynamic.literal(all = all, any = any, count = count, each = each, filter = filter, first = first, iterator = iterator, key = key, next = next, reset = reset, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Iterator[T]]
  }
}

