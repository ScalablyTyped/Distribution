package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An unordered iterable collection of key/value pairs that cannot contain two instances of the
    * same key.
    * It optionally enforces the type of the key and the type of the associated value.
    */
@js.native
trait Map[K, V] extends Iterator[KeyValuePair[K, V]] {
  /**Gets an object that you can use for iterating over the keys in the Map.*/
  var iteratorKeys: Iterator[K] = js.native
  /**Gets an object that you can use for iterating over the values of the Map.*/
  var iteratorValues: Iterator[V] = js.native
  /**This read-only property returns the number of associations in the Map. ES6-like synonym for count.*/
  var size: scala.Double = js.native
  /**
          * Adds a key-value association to the Map, or replaces the value associated with the key if the key was already present in the map.
          * @param {*} key
          * @param {*} val
          */
  def add(key: K, `val`: V): scala.Boolean = js.native
  /**
          * Adds all of the key-value pairs of another Map to this Map.
          * @param {Iterable.<KeyValuePair.<K,V>>|Array} coll
          */
  def addAll(coll: Iterable[KeyValuePair[K, V]]): Map[K, V] = js.native
  /**
          * Adds all of the key-value pairs of another Map to this Map.
          * @param {Iterable.<KeyValuePair.<K,V>>|Array} coll
          */
  def addAll(coll: js.Array[KeyValuePair[K, V]]): Map[K, V] = js.native
  /**
          * Clears the Map, removing all key-value associations.
          */
  def clear(): scala.Unit = js.native
  /**
          * Produce a new Map that includes the key-value pairs of this Map and then adds the pairs of the given Iterator.
          * Unlike Iterator.concat, this returns a Map, not an Iterator.
          * @param {Iterable.<KeyValuePair<K,V>>} it An Iterable
          */
  def concat[W](it: Iterable[KeyValuePair[K, W]]): Map[K, V | W] = js.native
  /**
          * Returns whether the given key is in this Map.
          * @param {*} key
          */
  def contains(key: K): scala.Boolean = js.native
  /**
          * Makes a shallow copy of this Map.
          */
  def copy(): Map[K, V] = js.native
  /**
          * Removes a key (if found) from the Map. ES6-like synonym for remove.
          * @param {*} key
          */
  def delete(key: K): scala.Boolean = js.native
  /**
          * Returns the value associated with a key. ES6-like synonym for getValue.
          * @param {*} key
          */
  def get(key: K): V = js.native
  /**
          * Returns the value associated with a key.
          * @param {*} key
          */
  def getValue(key: K): V = js.native
  /**
          * Returns whether the given key is in this Map. ES6-like synonym for contains.
          * @param {*} key
          */
  def has(key: K): scala.Boolean = js.native
  /**
          * Call the given function on each key-value pair in the collection and associate the key with the result of the function in a new Map.
          * Unlike Iterator.map, this returns a Map, not an Iterator.
          * @param {function(KeyValuePair<K,V>)} func This function must not modify the collection.
          */
  def map[S](func: js.Function1[/* x */ KeyValuePair[K, V], S]): Map[K, S] = js.native
  /**
          * Removes a key (if found) from the Map.
          * @param {*} key
          */
  def remove(key: K): scala.Boolean = js.native
  /**
          * Adds a key-value association to the Map, or replaces the value associated with the key if the key was already present in the map. ES6-like synonym for add.
          * @param {*} key
          * @param {*} val
          */
  def set(key: K, `val`: V): scala.Boolean = js.native
  /**
          * Produces a JavaScript Array of key/value pair objects from the contents of this Map.
          */
  def toArray(): js.Array[KeyValuePair[K, V]] = js.native
  /**
          * Produces a Set that provides a read-only view onto the keys of this Map.
          */
  def toKeySet(): Set[K] = js.native
}

