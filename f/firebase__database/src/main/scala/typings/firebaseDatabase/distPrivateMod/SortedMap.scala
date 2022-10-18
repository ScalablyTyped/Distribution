package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An immutable sorted map implementation, based on a Left-leaning Red-Black
  * tree.
  */
@js.native
trait SortedMap[K, V] extends StObject {
  
  /* private */ var comparator_ : Any = js.native
  
  /**
    * @returns The total number of nodes in the map.
    */
  def count(): Double = js.native
  
  /**
    * Returns the value of the node with the given key, or null.
    *
    * @param key - The key to look up.
    * @returns The value of the node with the given key, or null if the
    * key doesn't exist.
    */
  def get(key: K): V | Null = js.native
  
  /**
    * Returns an iterator over the SortedMap.
    * @returns The iterator.
    */
  def getIterator[T](): SortedMapIterator[K, V, T] = js.native
  def getIterator[T](resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  
  def getIteratorFrom[T](key: K): SortedMapIterator[K, V, T] = js.native
  def getIteratorFrom[T](key: K, resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  
  /**
    * Returns the key of the item *before* the specified key, or null if key is the first item.
    * @param key - The key to find the predecessor of
    * @returns The predecessor key.
    */
  def getPredecessorKey(key: K): K | Null = js.native
  
  def getReverseIterator[T](): SortedMapIterator[K, V, T] = js.native
  def getReverseIterator[T](resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  
  def getReverseIteratorFrom[T](key: K): SortedMapIterator[K, V, T] = js.native
  def getReverseIteratorFrom[T](key: K, resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  
  /**
    * Traverses the map in key order and calls the specified action function
    * for each key/value pair.
    *
    * @param action - Callback function to be called
    * for each key/value pair.  If action returns true, traversal is aborted.
    * @returns The first truthy value returned by action, or the last falsey
    *   value returned by action
    */
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Any]): Boolean = js.native
  
  /**
    * Returns a copy of the map, with the specified key/value added or replaced.
    * (TODO: We should perhaps rename this method to 'put')
    *
    * @param key - Key to be added.
    * @param value - Value to be added.
    * @returns New map, with item added.
    */
  def insert(key: K, value: V): SortedMap[K, V] = js.native
  
  /**
    * @returns True if the map is empty.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @returns The maximum key in the map.
    */
  def maxKey(): K | Null = js.native
  
  /**
    * @returns The minimum key in the map.
    */
  def minKey(): K | Null = js.native
  
  /**
    * Returns a copy of the map, with the specified key removed.
    *
    * @param key - The key to remove.
    * @returns New map, with item removed.
    */
  def remove(key: K): SortedMap[K, V] = js.native
  
  /**
    * Traverses the map in reverse key order and calls the specified action function
    * for each key/value pair.
    *
    * @param action - Callback function to be called
    * for each key/value pair.  If action returns true, traversal is aborted.
    * @returns True if the traversal was aborted.
    */
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
  
  /* private */ var root_ : Any = js.native
}
