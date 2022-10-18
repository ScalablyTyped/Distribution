package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a node in a Left-leaning Red-Black tree.
  */
trait LLRBNode[K, V] extends StObject {
  
  /**
    * For testing.
    *
    * @returns True if all is well.
    */
  /* private */ var checkMaxDepth_ : Any
  
  def check_(): Double
  
  var color: Boolean
  
  /**
    * @returns Newt ree, after colorFlip.
    */
  /* private */ var colorFlip_ : Any
  
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
  ): LLRBNode[K, V]
  
  /**
    * @returns The total number of nodes in the tree.
    */
  def count(): Double
  
  /**
    * @returns New tree after performing any needed rotations.
    */
  /* private */ var fixUp_ : Any
  
  /**
    * Traverses the tree in key order and calls the specified action function
    * for each node.
    *
    * @param action - Callback function to be called for each
    *   node.  If it returns true, traversal is aborted.
    * @returns The first truthy value returned by action, or the last falsey
    *   value returned by action
    */
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Any]): Boolean
  
  /**
    * @param key - Key to insert.
    * @param value - Value to insert.
    * @param comparator - Comparator.
    * @returns New tree, with the key/value added.
    */
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V]
  
  /**
    * @returns True if the tree is empty.
    */
  def isEmpty(): Boolean
  
  /**
    * @returns Whether this is a RED node.
    */
  def isRed_(): Boolean
  
  var key: K
  
  var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  /**
    * @returns The maximum key in the tree.
    */
  def maxKey(): K
  
  /**
    * @returns The maximum key in the tree.
    */
  def minKey(): K
  
  /**
    * @returns The minimum node in the tree.
    */
  /* private */ var min_ : Any
  
  /**
    * @returns New tree, after moveRedLeft.
    */
  /* private */ var moveRedLeft_ : Any
  
  /**
    * @returns New tree, after moveRedRight.
    */
  /* private */ var moveRedRight_ : Any
  
  /**
    * @param key - The key of the item to remove.
    * @param comparator - Comparator.
    * @returns New tree, with the specified item removed.
    */
  def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  /**
    * @returns New tree, with the minimum key removed.
    */
  /* private */ var removeMin_ : Any
  
  /**
    * Traverses the tree in reverse key order and calls the specified action function
    * for each node.
    *
    * @param action - Callback function to be called for each
    * node.  If it returns true, traversal is aborted.
    * @returns True if traversal was aborted.
    */
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Unit]): Boolean
  
  var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  
  /**
    * @returns New tree, after rotateLeft.
    */
  /* private */ var rotateLeft_ : Any
  
  /**
    * @returns New tree, after rotateRight.
    */
  /* private */ var rotateRight_ : Any
  
  var value: V
}
object LLRBNode {
  
  inline def apply[K, V](
    checkMaxDepth_ : Any,
    check_ : () => Double,
    color: Boolean,
    colorFlip_ : Any,
    copy: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBNode[K, V],
    count: () => Double,
    fixUp_ : Any,
    inorderTraversal: js.Function2[/* k */ K, /* v */ V, Any] => Boolean,
    insert: (K, V, Comparator[K]) => LLRBNode[K, V],
    isEmpty: () => Boolean,
    isRed_ : () => Boolean,
    key: K,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    maxKey: () => K,
    minKey: () => K,
    min_ : Any,
    moveRedLeft_ : Any,
    moveRedRight_ : Any,
    remove: (K, Comparator[K]) => (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    removeMin_ : Any,
    reverseTraversal: js.Function2[/* k */ K, /* v */ V, Unit] => Boolean,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    rotateLeft_ : Any,
    rotateRight_ : Any,
    value: V
  ): LLRBNode[K, V] = {
    val __obj = js.Dynamic.literal(checkMaxDepth_ = checkMaxDepth_.asInstanceOf[js.Any], check_ = js.Any.fromFunction0(check_), color = color.asInstanceOf[js.Any], colorFlip_ = colorFlip_.asInstanceOf[js.Any], copy = js.Any.fromFunction5(copy), count = js.Any.fromFunction0(count), fixUp_ = fixUp_.asInstanceOf[js.Any], inorderTraversal = js.Any.fromFunction1(inorderTraversal), insert = js.Any.fromFunction3(insert), isEmpty = js.Any.fromFunction0(isEmpty), isRed_ = js.Any.fromFunction0(isRed_), key = key.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxKey = js.Any.fromFunction0(maxKey), minKey = js.Any.fromFunction0(minKey), min_ = min_.asInstanceOf[js.Any], moveRedLeft_ = moveRedLeft_.asInstanceOf[js.Any], moveRedRight_ = moveRedRight_.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), removeMin_ = removeMin_.asInstanceOf[js.Any], reverseTraversal = js.Any.fromFunction1(reverseTraversal), right = right.asInstanceOf[js.Any], rotateLeft_ = rotateLeft_.asInstanceOf[js.Any], rotateRight_ = rotateRight_.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LLRBNode[K, V]]
  }
  
  extension [Self <: LLRBNode[?, ?], K, V](x: Self & (LLRBNode[K, V])) {
    
    inline def setCheckMaxDepth_(value: Any): Self = StObject.set(x, "checkMaxDepth_", value.asInstanceOf[js.Any])
    
    inline def setCheck_(value: () => Double): Self = StObject.set(x, "check_", js.Any.fromFunction0(value))
    
    inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFlip_(value: Any): Self = StObject.set(x, "colorFlip_", value.asInstanceOf[js.Any])
    
    inline def setCopy(
      value: (K | Null, V | Null, Boolean | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null, (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null) => LLRBNode[K, V]
    ): Self = StObject.set(x, "copy", js.Any.fromFunction5(value))
    
    inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setFixUp_(value: Any): Self = StObject.set(x, "fixUp_", value.asInstanceOf[js.Any])
    
    inline def setInorderTraversal(value: js.Function2[/* k */ K, /* v */ V, Any] => Boolean): Self = StObject.set(x, "inorderTraversal", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (K, V, Comparator[K]) => LLRBNode[K, V]): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setIsRed_(value: () => Boolean): Self = StObject.set(x, "isRed_", js.Any.fromFunction0(value))
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMaxKey(value: () => K): Self = StObject.set(x, "maxKey", js.Any.fromFunction0(value))
    
    inline def setMinKey(value: () => K): Self = StObject.set(x, "minKey", js.Any.fromFunction0(value))
    
    inline def setMin_(value: Any): Self = StObject.set(x, "min_", value.asInstanceOf[js.Any])
    
    inline def setMoveRedLeft_(value: Any): Self = StObject.set(x, "moveRedLeft_", value.asInstanceOf[js.Any])
    
    inline def setMoveRedRight_(value: Any): Self = StObject.set(x, "moveRedRight_", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: (K, Comparator[K]) => (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveMin_(value: Any): Self = StObject.set(x, "removeMin_", value.asInstanceOf[js.Any])
    
    inline def setReverseTraversal(value: js.Function2[/* k */ K, /* v */ V, Unit] => Boolean): Self = StObject.set(x, "reverseTraversal", js.Any.fromFunction1(value))
    
    inline def setRight(value: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRotateLeft_(value: Any): Self = StObject.set(x, "rotateLeft_", value.asInstanceOf[js.Any])
    
    inline def setRotateRight_(value: Any): Self = StObject.set(x, "rotateRight_", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
