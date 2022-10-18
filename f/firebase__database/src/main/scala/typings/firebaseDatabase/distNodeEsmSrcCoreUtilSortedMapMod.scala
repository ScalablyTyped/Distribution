package typings.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilSortedMapMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "LLRBEmptyNode")
  @js.native
  open class LLRBEmptyNode[K, V] () extends StObject {
    
    def check_(): Double = js.native
    
    var color: Boolean = js.native
    
    /**
      * Returns a copy of the current node.
      *
      * @returns The node copy.
      */
    def copy(
      key: K | Null,
      value: V | Null,
      color: Boolean | Null,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
    ): LLRBEmptyNode[K, V] = js.native
    
    /**
      * @returns The total number of nodes in the tree.
      */
    def count(): Double = js.native
    
    /**
      * Traverses the tree in key order and calls the specified action function
      * for each node.
      *
      * @param action - Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @returns True if traversal was aborted.
      */
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Any]): Boolean = js.native
    
    /**
      * Returns a copy of the tree, with the specified key/value added.
      *
      * @param key - Key to be added.
      * @param value - Value to be added.
      * @param comparator - Comparator.
      * @returns New tree, with item added.
      */
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    
    /**
      * @returns True if the tree is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @returns Whether this node is red.
      */
    def isRed_(): Boolean = js.native
    
    var key: K = js.native
    
    var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    def maxKey(): Null = js.native
    
    def minKey(): Null = js.native
    
    /**
      * Returns a copy of the tree, with the specified key removed.
      *
      * @param key - The key to remove.
      * @param comparator - Comparator.
      * @returns New tree, with item removed.
      */
    def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V] = js.native
    
    /**
      * Traverses the tree in reverse key order and calls the specified action function
      * for each node.
      *
      * @param action - Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @returns True if traversal was aborted.
      */
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
    
    var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    var value: V = js.native
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "LLRBNode")
  @js.native
  open class LLRBNode[K, V] protected () extends StObject {
    /**
      * @param key - Key associated with this node.
      * @param value - Value associated with this node.
      * @param color - Whether this node is red.
      * @param left - Left child.
      * @param right - Right child.
      */
    def this(key: K, value: V) = this()
    def this(key: K, value: V, color: Boolean) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Null, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Null, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Unit, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Unit, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Null, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Null, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Unit, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: Unit, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Null, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    
    /**
      * For testing.
      *
      * @returns True if all is well.
      */
    /* private */ var checkMaxDepth_ : Any = js.native
    
    def check_(): Double = js.native
    
    var color: Boolean = js.native
    
    /**
      * @returns Newt ree, after colorFlip.
      */
    /* private */ var colorFlip_ : Any = js.native
    
    /**
      * Returns a copy of the current node, optionally replacing pieces of it.
      *
      * @param key - New key for the node, or null.
      * @param value - New value for the node, or null.
      * @param color - New color for the node, or null.
      * @param left - New left child for the node, or null.
      * @param right - New right child for the node, or null.
      * @returns The node copy.
      */
    def copy(
      key: K | Null,
      value: V | Null,
      color: Boolean | Null,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
    ): LLRBNode[K, V] = js.native
    
    /**
      * @returns The total number of nodes in the tree.
      */
    def count(): Double = js.native
    
    /**
      * @returns New tree after performing any needed rotations.
      */
    /* private */ var fixUp_ : Any = js.native
    
    /**
      * Traverses the tree in key order and calls the specified action function
      * for each node.
      *
      * @param action - Callback function to be called for each
      *   node.  If it returns true, traversal is aborted.
      * @returns The first truthy value returned by action, or the last falsey
      *   value returned by action
      */
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Any]): Boolean = js.native
    
    /**
      * @param key - Key to insert.
      * @param value - Value to insert.
      * @param comparator - Comparator.
      * @returns New tree, with the key/value added.
      */
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    
    /**
      * @returns True if the tree is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @returns Whether this is a RED node.
      */
    def isRed_(): Boolean = js.native
    
    var key: K = js.native
    
    var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    /**
      * @returns The maximum key in the tree.
      */
    def maxKey(): K = js.native
    
    /**
      * @returns The maximum key in the tree.
      */
    def minKey(): K = js.native
    
    /**
      * @returns The minimum node in the tree.
      */
    /* private */ var min_ : Any = js.native
    
    /**
      * @returns New tree, after moveRedLeft.
      */
    /* private */ var moveRedLeft_ : Any = js.native
    
    /**
      * @returns New tree, after moveRedRight.
      */
    /* private */ var moveRedRight_ : Any = js.native
    
    /**
      * @param key - The key of the item to remove.
      * @param comparator - Comparator.
      * @returns New tree, with the specified item removed.
      */
    def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    /**
      * @returns New tree, with the minimum key removed.
      */
    /* private */ var removeMin_ : Any = js.native
    
    /**
      * Traverses the tree in reverse key order and calls the specified action function
      * for each node.
      *
      * @param action - Callback function to be called for each
      * node.  If it returns true, traversal is aborted.
      * @returns True if traversal was aborted.
      */
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean = js.native
    
    var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    /**
      * @returns New tree, after rotateLeft.
      */
    /* private */ var rotateLeft_ : Any = js.native
    
    /**
      * @returns New tree, after rotateRight.
      */
    /* private */ var rotateRight_ : Any = js.native
    
    var value: V = js.native
  }
  /* static members */
  object LLRBNode {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "LLRBNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "LLRBNode.BLACK")
    @js.native
    def BLACK: Boolean = js.native
    inline def BLACK_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "LLRBNode.RED")
    @js.native
    def RED: Boolean = js.native
    inline def RED_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "SortedMap")
  @js.native
  open class SortedMap[K, V] protected () extends StObject {
    /**
      * @param comparator_ - Key comparator.
      * @param root_ - Optional root node for the map.
      */
    def this(comparator_ : Comparator[K]) = this()
    def this(comparator_ : Comparator[K], root_ : LLRBEmptyNode[K, V]) = this()
    def this(comparator_ : Comparator[K], root_ : LLRBNode[K, V]) = this()
    
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
  /* static members */
  object SortedMap {
    
    @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "SortedMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Always use the same empty node, to reduce memory.
      */
    @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "SortedMap.EMPTY_NODE")
    @js.native
    def EMPTY_NODE: LLRBEmptyNode[Any, Any] = js.native
    inline def EMPTY_NODE_=(x: LLRBEmptyNode[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_NODE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/SortedMap", "SortedMapIterator")
  @js.native
  open class SortedMapIterator[K, V, T] protected () extends StObject {
    def this(node: LLRBEmptyNode[K, V], startKey: K, comparator: Comparator[K], isReverse_ : Boolean) = this()
    def this(node: LLRBEmptyNode[K, V], startKey: Null, comparator: Comparator[K], isReverse_ : Boolean) = this()
    /**
      * @param node - Node to iterate.
      * @param isReverse_ - Whether or not to iterate in reverse
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
    
    def getNext(): T = js.native
    
    def hasNext(): Boolean = js.native
    
    /* private */ var isReverse_ : Any = js.native
    
    /* private */ var nodeStack_ : Any = js.native
    
    def peek(): T = js.native
    
    /* private */ var resultGenerator_ : Any = js.native
  }
  
  type Comparator[K] = js.Function2[/* key1 */ K, /* key2 */ K, Double]
}
