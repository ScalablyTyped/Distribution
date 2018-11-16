package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An unordered iterable collection of key/value pairs that cannot contain two instances of the
    * same key.
    * It optionally enforces the type of the key and the type of the associated value.
    */
@JSImport("go", "Map")
@js.native
class Map[K, V] ()
  extends goLib.goMod.goNs.Map[K, V] {
  /**
          * This creates a Map that may check the types of the keys and/or values.
          * @param {string=} keytype if supplied, this must be one of: 'number' or 'string' for the key type.
          * @param {string=} valtype if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
          */
  def this(keytype: java.lang.String) = this()
  /**
          * This creates a Map that may check the types of the keys and/or values.
          * @param {function(...)} keytype if supplied, this must be a class function/constructor.
          * @param {function(...)} valtype if supplied, this must be a class function/constructor.
          */
  def this(keytype: goLib.goMod.goNs.Constructor, valtype: goLib.goMod.goNs.Constructor) = this()
  /**
          * This creates a Map that may check the types of the keys and/or values.
          * @param {function(...)} keytype if supplied, this must be a class function/constructor.
          * @param {string} valtype if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
          */
  def this(keytype: goLib.goMod.goNs.Constructor, valtype: java.lang.String) = this()
  /**
          * This creates a Map that may check the types of the keys and/or values.
          * @param {string=} keytype if supplied, this must be one of: 'number' or 'string' for the key type.
          * @param {function(...)} valtype if supplied, this must be a class function/constructor.
          */
  def this(keytype: java.lang.String, valtype: goLib.goMod.goNs.Constructor) = this()
  /**
          * This creates a Map that may check the types of the keys and/or values.
          * @param {string=} keytype if supplied, this must be one of: 'number' or 'string' for the key type.
          * @param {string=} valtype if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
          */
  def this(keytype: java.lang.String, valtype: java.lang.String) = this()
  /*This is an interface and thus does not have a constructor.*/
  
  /**This read-only property returns the total number of items in the iterated collection.*/
  /* CompleteClass */
  override var count: scala.Double = js.native
  /*This is an interface and thus does not have a constructor.*/
  
  /**Gets an Iterator that can iterate over the items in the collection.*/
  /* CompleteClass */
  override var iterator: goLib.goMod.goNs.Iterator[goLib.goMod.goNs.KeyValuePair[K, V]] = js.native
  /**This read-only property returns the current index to the item in the collection, assuming .next has just returned true.*/
  /* CompleteClass */
  override var key: js.Any = js.native
  /**This read-only property returns the current item in the collection, assuming .next has just returned true.*/
  /* CompleteClass */
  override var value: goLib.goMod.goNs.KeyValuePair[K, V] = js.native
  /**
          * This is true if all invocations of the given predicate on items in the collection are true.
          * @param {(x: T) => boolean} pred
          */
  /* CompleteClass */
  override def all(pred: js.Function1[goLib.goMod.goNs.KeyValuePair[K, V], scala.Boolean]): scala.Boolean = js.native
  /**
          * This is true if any invocation of the given predicate on items in the collection is true.
          * @param {(x: T) => boolean} pred
          */
  /* CompleteClass */
  override def any(pred: js.Function1[goLib.goMod.goNs.KeyValuePair[K, V], scala.Boolean]): scala.Boolean = js.native
  /**
          * Call the given function on each item in the collection.
          * @param {(x: T) => void} func
          */
  /* CompleteClass */
  override def each(func: js.Function1[goLib.goMod.goNs.KeyValuePair[K, V], scala.Unit]): scala.Unit = js.native
  /**
          * Call the given predicate on each item in the collection and for each item that it returns true, present the item in an iterator.
          * @param {function(T):boolean} pred This function must not have any side-effects.
          */
  /* CompleteClass */
  override def filter(pred: js.Function1[goLib.goMod.goNs.KeyValuePair[K, V], scala.Boolean]): goLib.goMod.goNs.Iterator[goLib.goMod.goNs.KeyValuePair[K, V]] = js.native
  /**
          * Return the first item in the collection, or null if there is none.
          */
  /* CompleteClass */
  override def first(): goLib.goMod.goNs.KeyValuePair[K, V] = js.native
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

