package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * This interface defines properties and methods for iterating over a collection;
    * it provides the .next predicate and the .value read-only property.
    * Some Iterators also provide key property values along with each value.
    */
@JSImport("go", "Iterator")
@js.native
class Iterator[T] ()
  extends goLib.goMod.goNs.Iterator[T] {
  /*This is an interface and thus does not have a constructor.*/
  
  /**This read-only property returns the total number of items in the iterated collection.*/
  /* CompleteClass */
  override var count: scala.Double = js.native
  /*This is an interface and thus does not have a constructor.*/
  
  /**Gets an Iterator that can iterate over the items in the collection.*/
  /* CompleteClass */
  override var iterator: goLib.goMod.goNs.Iterator[T] = js.native
  /**This read-only property returns the current index to the item in the collection, assuming .next has just returned true.*/
  /* CompleteClass */
  override var key: js.Any = js.native
  /**This read-only property returns the current item in the collection, assuming .next has just returned true.*/
  /* CompleteClass */
  override var value: T = js.native
  /**
          * This is true if all invocations of the given predicate on items in the collection are true.
          * @param {(x: T) => boolean} pred
          */
  /* CompleteClass */
  override def all(pred: js.Function1[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * This is true if any invocation of the given predicate on items in the collection is true.
          * @param {(x: T) => boolean} pred
          */
  /* CompleteClass */
  override def any(pred: js.Function1[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * Call the given function on each item in the collection.
          * @param {(x: T) => void} func
          */
  /* CompleteClass */
  override def each(func: js.Function1[T, scala.Unit]): scala.Unit = js.native
  /**
          * Call the given predicate on each item in the collection and for each item that it returns true, present the item in an iterator.
          * @param {function(T):boolean} pred This function must not have any side-effects.
          */
  /* CompleteClass */
  override def filter(pred: js.Function1[T, scala.Boolean]): goLib.goMod.goNs.Iterator[T] = js.native
  /**
          * Return the first item in the collection, or null if there is none.
          */
  /* CompleteClass */
  override def first(): T = js.native
  /**
          * Call this method to advance the iterator to the next item in the collection.
          */
  /* CompleteClass */
  override def next(): scala.Boolean = js.native
  /**
          * Start this iterator all over again.
          */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}

