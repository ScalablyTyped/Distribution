package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface defines properties and methods for iterating over a collection;
  * it provides the .next predicate and the .value read-only property.
  * Some Iterators also provide key property values along with each value.
  */
@JSImport("go", "Iterator")
@js.native
class Iterator[T] () extends Iterable[T] {
  
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
  
  /*This is an interface and thus does not have a constructor.*/
  /**This read-only property returns the total number of items in the iterated collection.*/
  var count: Double = js.native
  
  /**
    * Call the given function on each item in the collection.
    * @param {(x: T) => void} func
    */
  def each(func: js.Function1[/* x */ T, Unit]): Unit = js.native
  
  /**
    * Call the given predicate on each item in the collection and for each item that it returns true, present the item in an iterator.
    * @param {function(T):boolean} pred This function must not have any side-effects.
    */
  def filter(pred: js.Function1[/* x */ T, Boolean]): Iterator[T] = js.native
  
  /**
    * Return the first item in the collection, or null if there is none.
    */
  def first(): T = js.native
  
  /**This read-only property returns the current index to the item in the collection, assuming .next has just returned true.*/
  var key: js.Any = js.native
  
  /**
    * Call this method to advance the iterator to the next item in the collection.
    */
  def next(): Boolean = js.native
  
  /**
    * Start this iterator all over again.
    */
  def reset(): Unit = js.native
  
  /**This read-only property returns the current item in the collection, assuming .next has just returned true.*/
  var value: T = js.native
}
