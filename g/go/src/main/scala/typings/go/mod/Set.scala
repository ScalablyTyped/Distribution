package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An unordered iterable collection that cannot contain two instances of the same kind of value.
  * It optionally enforces the type of elements that may be added to the Set.
  */
@JSImport("go", "Set")
@js.native
/**
  * This creates a Set that may check the types of the values.
  * @param {string=} type if supplied, this must be one of: 'number' or 'string' for the key type.
  */
class Set[T] () extends Iterable[T] {
  def this(`type`: String) = this()
  /**
    * This creates a Set that checks the type of the values.
    * @param {function(...)} type this must be a class function/constructor.
    */
  def this(`type`: Constructor) = this()
  /**This read-only property returns the number of elements in the Set.*/
  var count: Double = js.native
  /**This read-only property returns the number of elements in the Set. ES6-like synonym for count.*/
  var size: Double = js.native
  /**
    * Adds a given value to the Set, if not already present.
    * @param {*} val
    */
  def add(`val`: T): Boolean = js.native
  def addAll(coll: js.Array[T]): Set[T] = js.native
  /**
    * Adds all of the values of a collection (either an Iterable or an Array) to this Set.
    * @param {Iterable<T>|Array<T>} coll
    */
  def addAll(coll: Iterable[T]): Set[T] = js.native
  /**
    * This is true if all invocations of the given predicate on items in the collection are true.
    * @param {(x: T) => boolean} pred
    */
  def all(pred: js.Function1[/* x */ T, Boolean]): Boolean = js.native
  /**
    * This is true if any invocation of the given predicate on items in the collection is true.
    * @param {(x: T) => boolean} pred
    */
  def any(pred: js.Function1[/* x */ T, Boolean]): Boolean = js.native
  /**
    * Clears the Set.
    */
  def clear(): Unit = js.native
  /**
    * Produce a new Set that contains items of this Set and then iterates over the items of the given Iterator.
    * Unlike Iterator.concat, this returns a Set, not an Iterator.
    * @param {Iterable.<T>} it An Iterable
    */
  def concat[S](it: Iterable[S]): Set[S | T] = js.native
  /**
    * Returns whether the given value is in this Set.
    * @param {*} val
    */
  def contains(`val`: T): Boolean = js.native
  /**
    * Returns true if all of the values of a given collection are in this Set.
    * @param {Iterable<T>} coll
    */
  def containsAll(coll: Iterable[T]): Boolean = js.native
  /**
    * Returns true if any of the values of a given collection are in this Set.
    * @param {Iterable<T>} coll
    */
  def containsAny(coll: Iterable[T]): Boolean = js.native
  /**
    * Makes a shallow copy of this Set.
    */
  def copy(): Set[T] = js.native
  /**
    * Removes a value (if found) from the Set. ES6-like synonym for remove.
    * @param {*} val
    */
  def delete(`val`: T): Boolean = js.native
  /**
    * Call the given function on each item in the collection.
    * @param {(x: T) => void} func
    */
  def each(func: js.Function1[/* x */ T, Unit]): Unit = js.native
  /**
    * Call the given predicate on each item in the collection and for each item that it returns true, collect the item in a new Set.
    * Unlike Iterator.filter, this returns a Set, not an Iterator.
    * @param {function(T):boolean} pred This function must not have any side-effects.
    */
  def filter(pred: js.Function1[/* x */ T, Boolean]): Set[T] = js.native
  /**
    * Returns the first item in the collection, or null if there is none.
    */
  def first(): T = js.native
  /**
    * Returns whether the given value is in this Set. ES6-like synonym for contains.
    * @param {*} val
    */
  def has(`val`: T): Boolean = js.native
  /**
    * Call the given function on each item in the collection and collect the results in a new Set.
    * Unlike Iterator.map, this returns a Set, not an Iterator.
    * @param {function(T)} func This function must not modify the collection.
    */
  def map[S](func: js.Function1[/* x */ T, S]): Set[S] = js.native
  /**
    * Removes a value (if found) from the Set.
    * @param {*} val
    */
  def remove(`val`: T): Boolean = js.native
  /**
    * Removes all of the values of a collection from this Set.
    * @param {Array<T>} coll
    */
  def removeAll(coll: js.Array[T]): Set[T] = js.native
  /**
    * Removes all of the values of a collection from this Set.
    * @param {Iterable<T>} coll
    */
  def removeAll(coll: Iterable[T]): Set[T] = js.native
  /**
    * Removes from this Set all items that are not in the given collection.
    * @param {Iterable<T>} coll
    */
  def retainAll(coll: Iterable[T]): Set[T] = js.native
  /**
    * Produces a JavaScript Array from the contents of this Set.
    */
  def toArray(): js.Array[T] = js.native
  /**
    * Converts the Set to a List.
    */
  def toList(): List[T] = js.native
}

