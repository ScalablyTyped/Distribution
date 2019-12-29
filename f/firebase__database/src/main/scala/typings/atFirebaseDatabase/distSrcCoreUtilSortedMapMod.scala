package typings.atFirebaseDatabase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/SortedMap", JSImport.Namespace)
@js.native
object distSrcCoreUtilSortedMapMod extends js.Object {
  @js.native
  class LLRBEmptyNode[K, V] () extends js.Object {
    var color: Boolean = js.native
    var key: K = js.native
    var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    var value: V = js.native
    /**
      * @private
      * @return {number} Not sure what this returns exactly. :-).
      */
    def check_(): Double = js.native
    /**
      * Returns a copy of the current node.
      *
      * @return {!LLRBEmptyNode} The node copy.
      */
    def copy(): LLRBEmptyNode[K, V] = js.native
    def copy(key: K): LLRBEmptyNode[K, V] = js.native
    def copy(key: K, value: V): LLRBEmptyNode[K, V] = js.native
    def copy(key: K, value: V, color: Boolean): LLRBEmptyNode[K, V] = js.native
    def copy(key: K, value: V, color: Boolean, left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): LLRBEmptyNode[K, V] = js.native
    def copy(
      key: K,
      value: V,
      color: Boolean,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
    ): LLRBEmptyNode[K, V] = js.native
    /**
      * @return {number} The total number of nodes in the tree.
      */
    def count(): Double = js.native
    /**
      * Traverses the tree in key order and calls the specified action function
      * for each node.
      *
      * @param {function(!K, !V):*} action Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @return {boolean} True if traversal was aborted.
      */
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, _]): Boolean = js.native
    /**
      * Returns a copy of the tree, with the specified key/value added.
      *
      * @param {!K} key Key to be added.
      * @param {!V} value Value to be added.
      * @param {Comparator} comparator Comparator.
      * @return {!LLRBNode} New tree, with item added.
      */
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    /**
      * @return {boolean} True if the tree is empty.
      */
    def isEmpty(): Boolean = js.native
    /**
      * @private
      * @return {boolean} Whether this node is red.
      */
    def isRed_(): Boolean = js.native
    /**
      * @return {null}
      */
    def maxKey(): Null = js.native
    /**
      * @return {null}
      */
    def minKey(): Null = js.native
    /**
      * Returns a copy of the tree, with the specified key removed.
      *
      * @param {!K} key The key to remove.
      * @param {Comparator} comparator Comparator.
      * @return {!LLRBEmptyNode} New tree, with item removed.
      */
    def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V] = js.native
    /**
      * Traverses the tree in reverse key order and calls the specified action function
      * for each node.
      *
      * @param {function(!K, !V)} action Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @return {boolean} True if traversal was aborted.
      */
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
  }
  
  @js.native
  class LLRBNode[K, V] protected () extends js.Object {
    def this(key: K, value: V) = this()
    /**
      * @template K, V
      * @param {!K} key Key associated with this node.
      * @param {!V} value Value associated with this node.
      * @param {?boolean} color Whether this node is red.
      * @param {?(LLRBNode|LLRBEmptyNode)=} left Left child.
      * @param {?(LLRBNode|LLRBEmptyNode)=} right Right child.
      */
    def this(key: K, value: V, color: Boolean) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Null, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Null, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Null, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Null, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    /**
      * For testing.
      *
      * @private
      * @return {boolean} True if all is well.
      */
    var checkMaxDepth_ : js.Any = js.native
    var color: Boolean = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree, after colorFlip.
      */
    var colorFlip_ : js.Any = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree after performing any needed rotations.
      */
    var fixUp_ : js.Any = js.native
    var key: K = js.native
    var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    /**
      * @return {!Object} The minimum node in the tree.
      * @private
      */
    var min_ : js.Any = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree, after moveRedLeft.
      */
    var moveRedLeft_ : js.Any = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree, after moveRedRight.
      */
    var moveRedRight_ : js.Any = js.native
    /**
      * @private
      * @return {!LLRBNode|LLRBEmptyNode} New tree, with the minimum key removed.
      */
    var removeMin_ : js.Any = js.native
    var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree, after rotateLeft.
      */
    var rotateLeft_ : js.Any = js.native
    /**
      * @private
      * @return {!LLRBNode} New tree, after rotateRight.
      */
    var rotateRight_ : js.Any = js.native
    var value: V = js.native
    /**
      * @private
      * @return {number} Not sure what this returns exactly. :-).
      */
    def check_(): Double = js.native
    /**
      * Returns a copy of the current node, optionally replacing pieces of it.
      *
      * @param {?K} key New key for the node, or null.
      * @param {?V} value New value for the node, or null.
      * @param {?boolean} color New color for the node, or null.
      * @param {?LLRBNode|LLRBEmptyNode} left New left child for the node, or null.
      * @param {?LLRBNode|LLRBEmptyNode} right New right child for the node, or null.
      * @return {!LLRBNode} The node copy.
      */
    def copy(): LLRBNode[K, V] = js.native
    def copy(key: K): LLRBNode[K, V] = js.native
    def copy(key: K, value: V): LLRBNode[K, V] = js.native
    def copy(key: K, value: V, color: Boolean): LLRBNode[K, V] = js.native
    def copy(key: K, value: V, color: Boolean, left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): LLRBNode[K, V] = js.native
    def copy(
      key: K,
      value: V,
      color: Boolean,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
    ): LLRBNode[K, V] = js.native
    /**
      * @return {number} The total number of nodes in the tree.
      */
    def count(): Double = js.native
    /**
      * Traverses the tree in key order and calls the specified action function
      * for each node.
      *
      * @param {function(!K, !V):*} action Callback function to be called for each
      *   node.  If it returns true, traversal is aborted.
      * @return {*} The first truthy value returned by action, or the last falsey
      *   value returned by action
      */
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, _]): Boolean = js.native
    /**
      *
      * @param {!Object} key Key to insert.
      * @param {!Object} value Value to insert.
      * @param {Comparator} comparator Comparator.
      * @return {!LLRBNode} New tree, with the key/value added.
      */
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    /**
      * @return {boolean} True if the tree is empty.
      */
    def isEmpty(): Boolean = js.native
    /**
      * @private
      * @return {boolean} Whether this is a RED node.
      */
    def isRed_(): Boolean = js.native
    /**
      * @return {!K} The maximum key in the tree.
      */
    def maxKey(): K = js.native
    /**
      * @return {!K} The maximum key in the tree.
      */
    def minKey(): K = js.native
    /**
      * @param {!Object} key The key of the item to remove.
      * @param {Comparator} comparator Comparator.
      * @return {!LLRBNode|LLRBEmptyNode} New tree, with the specified item removed.
      */
    def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    /**
      * Traverses the tree in reverse key order and calls the specified action function
      * for each node.
      *
      * @param {function(!Object, !Object)} action Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @return {*} True if traversal was aborted.
      */
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
  }
  
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
    def count(): Double = js.native
    /**
      * Returns the value of the node with the given key, or null.
      *
      * @param {!K} key The key to look up.
      * @return {?V} The value of the node with the given key, or null if the
      * key doesn't exist.
      */
    def get(key: K): V | Null = js.native
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
    def getPredecessorKey(key: K): K | Null = js.native
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
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, _]): Boolean = js.native
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
    def isEmpty(): Boolean = js.native
    /**
      * @return {?K} The maximum key in the map.
      */
    def maxKey(): K | Null = js.native
    /**
      * @return {?K} The minimum key in the map.
      */
    def minKey(): K | Null = js.native
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
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
  }
  
  @js.native
  class SortedMapIterator[K, V, T] protected () extends js.Object {
    def this(node: LLRBEmptyNode[K, V], startKey: K, comparator: Comparator[K], isReverse_ : Boolean) = this()
    def this(node: LLRBEmptyNode[K, V], startKey: Null, comparator: Comparator[K], isReverse_ : Boolean) = this()
    /**
      * @template K, V, T
      * @param {LLRBNode|LLRBEmptyNode} node Node to iterate.
      * @param {?K} startKey
      * @param {function(K, K): number} comparator
      * @param {boolean} isReverse_ Whether or not to iterate in reverse
      * @param {(function(K, V):T)=} resultGenerator_
      */
    def this(node: LLRBNode[K, V], startKey: K, comparator: Comparator[K], isReverse_ : Boolean) = this()
    def this(node: LLRBNode[K, V], startKey: Null, comparator: Comparator[K], isReverse_ : Boolean) = this()
    def this(
      node: LLRBEmptyNode[K, V],
      startKey: K,
      comparator: Comparator[K],
      isReverse_ : Boolean,
      resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
    ) = this()
    def this(
      node: LLRBEmptyNode[K, V],
      startKey: Null,
      comparator: Comparator[K],
      isReverse_ : Boolean,
      resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
    ) = this()
    def this(
      node: LLRBNode[K, V],
      startKey: K,
      comparator: Comparator[K],
      isReverse_ : Boolean,
      resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
    ) = this()
    def this(
      node: LLRBNode[K, V],
      startKey: Null,
      comparator: Comparator[K],
      isReverse_ : Boolean,
      resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
    ) = this()
    var isReverse_ : js.Any = js.native
    /** @private
      * @type {Array.<!LLRBNode>}
      */
    var nodeStack_ : js.Any = js.native
    var resultGenerator_ : js.Any = js.native
    def getNext(): T = js.native
    def hasNext(): Boolean = js.native
    def peek(): T = js.native
  }
  
  /* static members */
  @js.native
  object LLRBNode extends js.Object {
    var BLACK: Boolean = js.native
    var RED: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SortedMap extends js.Object {
    /**
      * Always use the same empty node, to reduce memory.
      * @const
      */
    var EMPTY_NODE: LLRBEmptyNode[_, _] = js.native
  }
  
  type Comparator[K] = js.Function2[/* key1 */ K, /* key2 */ K, Double]
}

