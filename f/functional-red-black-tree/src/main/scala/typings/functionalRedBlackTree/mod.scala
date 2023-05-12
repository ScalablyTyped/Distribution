package typings.functionalRedBlackTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an empty red-black tree.
    *
    * @param compare Optional comparison function, same semantics as array.sort().
    * @returns An empty tree ordered by `compare`.
    */
  // eslint-disable-next-line no-unnecessary-generics
  inline def apply[K, V](): Tree[K, V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Tree[K, V]]
  inline def apply[K, V](compare: js.Function2[/* key1 */ K, /* key2 */ K, Double]): Tree[K, V] = ^.asInstanceOf[js.Dynamic].apply(compare.asInstanceOf[js.Any]).asInstanceOf[Tree[K, V]]
  
  @JSImport("functional-red-black-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Iterates through the nodes in a red-black tree. */
  trait Iterator[K, V] extends StObject {
    
    /** If true, then the iterator is not at the end of the sequence. */
    val hasNext: Boolean
    
    /** If true, then the iterator is not at the beginning of the sequence. */
    val hasPrev: Boolean
    
    /** Returns the position of the iterator in the sequence. */
    val index: Double
    
    /** The key of the iterator's current item. */
    val key: js.UndefOr[K] = js.undefined
    
    /** Advances the iterator to the next position. */
    def next(): Unit
    
    /**
      * The value of the node at the iterator's current position, or null if the
      * iterator is invalid.
      */
    val node: (Node[K, V]) | Null
    
    /** Moves the iterator backward one element. */
    def prev(): Unit
    
    /**
      * Removes the iterator's current item form the tree.
      *
      * @returns A new binary search tree with the item removed.
      */
    def remove(): Tree[K, V]
    
    /** The tree associated with the iterator. */
    var tree: Tree[K, V]
    
    /**
      * Updates the value of the iterator's current item.
      *
      * @returns A new binary search tree with the corresponding node updated.
      */
    def update(value: V): Tree[K, V]
    
    /** Checks if the iterator is valid. */
    val valid: Boolean
    
    /** The value of the iterator's current item. */
    val value: js.UndefOr[V] = js.undefined
  }
  object Iterator {
    
    inline def apply[K, V](
      hasNext: Boolean,
      hasPrev: Boolean,
      index: Double,
      next: () => Unit,
      prev: () => Unit,
      remove: () => Tree[K, V],
      tree: Tree[K, V],
      update: V => Tree[K, V],
      valid: Boolean
    ): Iterator[K, V] = {
      val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrev = hasPrev.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), remove = js.Any.fromFunction0(remove), tree = tree.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), valid = valid.asInstanceOf[js.Any], node = null)
      __obj.asInstanceOf[Iterator[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Iterator[?, ?], K, V] (val x: Self & (Iterator[K, V])) extends AnyVal {
      
      inline def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
      
      inline def setHasPrev(value: Boolean): Self = StObject.set(x, "hasPrev", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setNode(value: Node[K, V]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Tree[K, V]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setTree(value: Tree[K, V]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: V => Tree[K, V]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** Represents a node in a red-black tree. */
  trait Node[K, V] extends StObject {
    
    /** The key associated with the node. */
    var key: K
    
    /** The left subtree of the node. */
    var left: Tree[K, V]
    
    /** The right subtree of the node. */
    var right: Tree[K, V]
    
    /** The value associated with the node. */
    var value: V
  }
  object Node {
    
    inline def apply[K, V](key: K, left: Tree[K, V], right: Tree[K, V], value: V): Node[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?, ?], K, V] (val x: Self & (Node[K, V])) extends AnyVal {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Tree[K, V]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Tree[K, V]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a functional red-black tree. */
  @js.native
  trait Tree[K, V] extends StObject {
    
    /**
      * Finds an iterator starting at the given element.
      *
      * @param position The index at which the iterator gets created.
      * @returns An iterator starting at `position`.
      */
    def at(idx: Double): Iterator[K, V] = js.native
    
    /** An iterator pointing to the first element in the tree. */
    val begin: Iterator[K, V] = js.native
    
    /** An iterator pointing to the last element in the tree. */
    val end: Iterator[K, V] = js.native
    
    /**
      * @returns An iterator pointing to the first item in the tree with `key`, otherwise null.
      */
    def find(key: K): Iterator[K, V] = js.native
    
    /**
      * Walks a visitor function over the nodes of the tree in order.
      *
      * @param visitor The callback to be executed on each node. If a truthy
      * value is returned from the visitor, then iteration is stopped.
      * @param lo An optional start of the range to visit (inclusive).
      * @param hi An optional end of the range to visit (non-inclusive).
      * @returns The last value returned by the callback.
      */
    def forEach[T](visitor: js.Function2[/* key */ K, /* value */ V, T]): T = js.native
    /**
      * Walks a visitor function over the nodes of the tree in order.
      *
      * @param visitor The callback to be executed on each node. If a truthy
      * value is returned from the visitor, then iteration is stopped.
      * @param lo An optional start of the range to visit (inclusive).
      * @param hi An optional end of the range to visit (non-inclusive).
      * @returns The last value returned by the callback.
      */
    def forEach[T](visitor: js.Function2[/* key */ K, /* value */ V, T], lo: K): T = js.native
    def forEach[T](visitor: js.Function2[/* key */ K, /* value */ V, T], lo: K, hi: K): T = js.native
    
    /**
      * Finds the first item in the tree whose key is >= `key`.
      *
      * @param key The key to search for.
      * @returns An iterator at the given element.
      */
    def ge(key: K): Iterator[K, V] = js.native
    
    /**
      * Retrieves the value associated with `key`.
      *
      * @param key The key of the item to look up.
      * @returns The value of the first node associated with `key`.
      */
    def get(key: K): V | Unit = js.native
    
    /**
      * Finds the first item in the tree whose key is > `key`.
      *
      * @param key The key to search for.
      * @returns An iterator at the given element.
      */
    def gt(key: K): Iterator[K, V] = js.native
    
    /**
      * Creates a new tree with the new `key/value` pair inserted.
      *
      * @param key The key of the item to insert.
      * @param value The value of the item to insert.
      * @returns A new tree with `key` and `value` inserted.
      */
    def insert(key: K, value: V): Tree[K, V] = js.native
    
    /** A sorted array of all keys in the tree. */
    val keys: js.Array[K] = js.native
    
    /**
      * Finds the last item in the tree whose key is <= `key`.
      *
      * @param key The key to search for.
      * @returns An iterator at the given element.
      */
    def le(key: K): Iterator[K, V] = js.native
    
    /** The number of items in the tree. */
    val length: Double = js.native
    
    /**
      * Finds the last item in the tree whose key is < `key`.
      *
      * @param key The key to search for.
      * @returns An iterator at the given element.
      */
    def lt(key: K): Iterator[K, V] = js.native
    
    /**
      * Removes the first item with `key` in the tree.
      *
      * @param key The key of the item to remove.
      * @returns A new tree with the given item removed, if it exists.
      */
    def remove(key: K): Tree[K, V] = js.native
    
    /** Returns the root node of the tree. */
    var root: Node[K, V] = js.native
    
    /** An array of all values in the tree, sorted by key. */
    val values: js.Array[V] = js.native
  }
}
