package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ordered iterable collection.
  * It optionally enforces the type of elements that may be added to the List.
  */
@JSImport("go", "List")
@js.native
/**
  * This creates a List that may check the types of the values.
  * @param {string=} type if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
  */
class List[T] () extends Iterable[T] {
  /**
    * This creates a List that checks the type of the values to be instances of a particular kind of Object.
    * @param {function(...)} type this must be a class function/constructor.
    */
  def this(`type`: Constructor) = this()
  def this(`type`: java.lang.String) = this()
  /**This read-only property returns the length of the List.*/
  var count: scala.Double = js.native
  /**Gets an object that you can use for iterating over the List in backwards order.*/
  var iteratorBackwards: Iterator[T] = js.native
  /**This read-only property returns the length of the List, a synonym for the .count property.*/
  var length: scala.Double = js.native
  /**This read-only property returns the length of the List. ES6-like synonym for count.*/
  var size: scala.Double = js.native
  /**
    * Adds a given value to the end of the List.
    * @param {*} val
    */
  def add(`val`: T): scala.Unit = js.native
  /**
    * Adds all of the values of a collection (either an Iterable or an Array) to the end of this List.
    * @param {Iterable<T>|Array<T>} coll
    */
  def addAll(coll: Iterable[T]): List[T] = js.native
  def addAll(coll: js.Array[T]): List[T] = js.native
  /**
    * This is true if all invocations of the given predicate on items in the collection are true.
    * @param {(x: T) => boolean} pred
    */
  def all(pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean = js.native
  /**
    * This is true if any invocation of the given predicate on items in the collection is true.
    * @param {(x: T) => boolean} pred
    */
  def any(pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean = js.native
  /**
    * Clears the List.
    */
  def clear(): scala.Unit = js.native
  /**
    * Produce a new List holding, in order, all of the items of this List and then all of the items presented by the given Iterable.
    * Unlike Iterator.concat, this returns a List, not an Iterator.
    * @param {Iterable.<T>} it An Iterable
    */
  def concat[S](it: Iterable[S]): List[S | T] = js.native
  /**
    * Returns whether the given value is in this List.
    * @param {*} val
    */
  def contains(`val`: T): scala.Boolean = js.native
  /**
    * Makes a shallow copy of this List.
    */
  def copy(): List[T] = js.native
  /**
    * Removes a given value (if found) from the List. ES6-like synonym for remove.
    * @param {*} val
    */
  def delete(`val`: T): scala.Boolean = js.native
  /**
    * Call the given function on each item in the collection.
    * @param {(x: T) => void} func
    */
  def each(func: js.Function1[/* x */ T, scala.Unit]): scala.Unit = js.native
  /**
    * Returns the element at the given index.
    * @param {number} i
    */
  def elt(i: scala.Double): T = js.native
  /**
    * Call the given predicate on each item in the collection and for each item that it returns true, collect the item in a new List.
    * Unlike Iterator.filter, this returns a List, not an Iterator.
    * @param {function(T):boolean} pred This function must not have any side-effects.
    */
  def filter(pred: js.Function1[/* x */ T, scala.Boolean]): List[T] = js.native
  /**
    * Returns the first item in the list, or null if there is none.
    */
  def first(): T = js.native
  /**
    * Returns the element at the given index. ES6-like synonym for elt.
    * @param {number} i
    */
  def get(i: scala.Double): T = js.native
  /**
    * Returns whether the given value is in this List. ES6-like synonym for contains.
    * @param {*} val
    */
  def has(`val`: T): scala.Boolean = js.native
  /**
    * Returns the index of the given value if it is in this List.
    * @param {*} val
    */
  def indexOf(`val`: T): scala.Double = js.native
  /**
    * Insert a value before the index i.
    * @param {number} i
    * @param {*} val
    */
  def insertAt(i: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Returns the last item in the list, or null if there is none.
    */
  def last(): T = js.native
  /**
    * Call the given function on each item in the collection and collect the results in a new List.
    * Unlike Iterator.map, this returns a List, not an Iterator.
    * @param {function(T)} func This function must not modify the collection.
    */
  def map[S](func: js.Function1[/* x */ T, S]): List[S] = js.native
  /**
    * Returns the last item in the list and removes it from the list, or just return null if there is none.
    */
  def pop(): T = js.native
  /**
    * Add an item at the end of the list -- a synonym for add.
    */
  def push(`val`: T): scala.Unit = js.native
  /**
    * Removes a given value (if found) from the List.
    * @param {*} val
    */
  def remove(`val`: T): scala.Boolean = js.native
  /**
    * Removes a value at a given index from the List.
    * @param {number} i
    */
  def removeAt(i: scala.Double): scala.Unit = js.native
  /**
    * Removes a range of values from the List.
    * @param {number} to
    * @param {number} from
    */
  def removeRange(to: scala.Double, from: scala.Double): scala.Unit = js.native
  /**
    * Reverse the order of items in this List.
    */
  def reverse(): List[T] = js.native
  /**
    * Set the element at the given index to a given value. ES6-like synonym for setElt.
    * @param {number} i
    * @param {*} val
    */
  def set(i: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Set the element at the given index to a given value.
    * @param {number} i
    * @param {*} val
    */
  def setElt(i: scala.Double, `val`: T): scala.Unit = js.native
  /**
    * Sort the List according to a comparison function.
    * @param {function(*,*):number} sortfunc the same kind of function as passed to Array.sort
    */
  def sort(sortfunc: js.Function2[/* a */ T, /* b */ T, scala.Double]): List[T] = js.native
  /**
    * Produces a JavaScript Array from the contents of this List.
    */
  def toArray(): js.Array[T] = js.native
  /**
    * Converts the List to a Set.
    */
  def toSet(): Set[T] = js.native
}

