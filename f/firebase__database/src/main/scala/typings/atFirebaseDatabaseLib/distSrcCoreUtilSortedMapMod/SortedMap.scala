package typings
package atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/SortedMap", "SortedMap")
@js.native
class SortedMap[K, V] protected () extends js.Object {
  /**
    * @template K, V
    * @param {function(K, K):number} comparator_ Key comparator.
    * @param {LLRBNode=} root_ (Optional) Root node for the map.
    */
  def this(comparator_ : Comparator[K]) = this()
  def this(comparator_ : Comparator[K], root_ : LLRBEmptyNode[K, V]) = this()
  def this(comparator_ : Comparator[K], root_ : LLRBNode[K, V]) = this()
  var comparator_ : js.Any = js.native
  var root_ : js.Any = js.native
  /**
    * @return {number} The total number of nodes in the map.
    */
  def count(): scala.Double = js.native
  /**
    * Returns the value of the node with the given key, or null.
    *
    * @param {!K} key The key to look up.
    * @return {?V} The value of the node with the given key, or null if the
    * key doesn't exist.
    */
  def get(key: K): V | scala.Null = js.native
  /**
    * Returns an iterator over the SortedMap.
    * @template T
    * @param {(function(K, V):T)=} resultGenerator
    * @return {SortedMapIterator.<K, V, T>} The iterator.
    */
  def getIterator[T](): SortedMapIterator[K, V, T] = js.native
  def getIterator[T](resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  def getIteratorFrom[T](key: K): SortedMapIterator[K, V, T] = js.native
  def getIteratorFrom[T](key: K, resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  /**
    * Returns the key of the item *before* the specified key, or null if key is the first item.
    * @param {K} key The key to find the predecessor of
    * @return {?K} The predecessor key.
    */
  def getPredecessorKey(key: K): K | scala.Null = js.native
  def getReverseIterator[T](): SortedMapIterator[K, V, T] = js.native
  def getReverseIterator[T](resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  def getReverseIteratorFrom[T](key: K): SortedMapIterator[K, V, T] = js.native
  def getReverseIteratorFrom[T](key: K, resultGenerator: js.Function2[/* k */ K, /* v */ V, T]): SortedMapIterator[K, V, T] = js.native
  /**
    * Traverses the map in key order and calls the specified action function
    * for each key/value pair.
    *
    * @param {function(!K, !V):*} action Callback function to be called
    * for each key/value pair.  If action returns true, traversal is aborted.
    * @return {*} The first truthy value returned by action, or the last falsey
    *   value returned by action
    */
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, _]): scala.Boolean = js.native
  /**
    * Returns a copy of the map, with the specified key/value added or replaced.
    * (TODO: We should perhaps rename this method to 'put')
    *
    * @param {!K} key Key to be added.
    * @param {!V} value Value to be added.
    * @return {!SortedMap.<K, V>} New map, with item added.
    */
  def insert(key: K, value: V): SortedMap[K, V] = js.native
  /**
    * @return {boolean} True if the map is empty.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * @return {?K} The maximum key in the map.
    */
  def maxKey(): K | scala.Null = js.native
  /**
    * @return {?K} The minimum key in the map.
    */
  def minKey(): K | scala.Null = js.native
  /**
    * Returns a copy of the map, with the specified key removed.
    *
    * @param {!K} key The key to remove.
    * @return {!SortedMap.<K, V>} New map, with item removed.
    */
  def remove(key: K): SortedMap[K, V] = js.native
  /**
    * Traverses the map in reverse key order and calls the specified action function
    * for each key/value pair.
    *
    * @param {function(!Object, !Object)} action Callback function to be called
    * for each key/value pair.  If action returns true, traversal is aborted.
    * @return {*} True if the traversal was aborted.
    */
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, scala.Unit]): scala.Boolean = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/util/SortedMap", "SortedMap")
@js.native
object SortedMap extends js.Object {
  /**
    * Always use the same empty node, to reduce memory.
    * @const
    */
  var EMPTY_NODE: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.LLRBEmptyNode[_, _] = js.native
}

