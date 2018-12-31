package typings
package atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/SortedMap", "LLRBNode")
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
  def this(key: K, value: V, color: scala.Boolean) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: scala.Null, right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Boolean, left: scala.Null, right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: scala.Null, right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: scala.Null, left: scala.Null, right: LLRBNode[K, V]) = this()
  var color: scala.Boolean = js.native
  var key: K = js.native
  var left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  var right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  var value: V = js.native
  /**
    * For testing.
    *
    * @private
    * @return {boolean} True if all is well.
    */
  /* private */ def `checkMaxDepth_`(): js.Any = js.native
  /**
    * @private
    * @return {number} Not sure what this returns exactly. :-).
    */
  def `check_`(): scala.Double = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree, after colorFlip.
    */
  /* private */ def `colorFlip_`(): js.Any = js.native
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
  def copy(key: K, value: V, color: scala.Boolean): LLRBNode[K, V] = js.native
  def copy(key: K, value: V, color: scala.Boolean, left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])): LLRBNode[K, V] = js.native
  def copy(
    key: K,
    value: V,
    color: scala.Boolean,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]),
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V])
  ): LLRBNode[K, V] = js.native
  /**
    * @return {number} The total number of nodes in the tree.
    */
  def count(): scala.Double = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree after performing any needed rotations.
    */
  /* private */ def `fixUp_`(): js.Any = js.native
  /**
    * Traverses the tree in key order and calls the specified action function
    * for each node.
    *
    * @param {function(!K, !V):*} action Callback function to be called for each
    *   node.  If it returns true, traversal is aborted.
    * @return {*} The first truthy value returned by action, or the last falsey
    *   value returned by action
    */
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, _]): scala.Boolean = js.native
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
  def isEmpty(): scala.Boolean = js.native
  /**
    * @private
    * @return {boolean} Whether this is a RED node.
    */
  def `isRed_`(): scala.Boolean = js.native
  /**
    * @return {!K} The maximum key in the tree.
    */
  def maxKey(): K = js.native
  /**
    * @return {!K} The maximum key in the tree.
    */
  def minKey(): K = js.native
  /**
    * @return {!Object} The minimum node in the tree.
    * @private
    */
  /* private */ def `min_`(): js.Any = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree, after moveRedLeft.
    */
  /* private */ def `moveRedLeft_`(): js.Any = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree, after moveRedRight.
    */
  /* private */ def `moveRedRight_`(): js.Any = js.native
  /**
    * @param {!Object} key The key of the item to remove.
    * @param {Comparator} comparator Comparator.
    * @return {!LLRBNode|LLRBEmptyNode} New tree, with the specified item removed.
    */
  def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  /**
    * @private
    * @return {!LLRBNode|LLRBEmptyNode} New tree, with the minimum key removed.
    */
  /* private */ def `removeMin_`(): js.Any = js.native
  /**
    * Traverses the tree in reverse key order and calls the specified action function
    * for each node.
    *
    * @param {function(!Object, !Object)} action Callback function to be called for each
    * node.  If it returns true, traversal is aborted.
    * @return {*} True if traversal was aborted.
    */
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, scala.Unit]): scala.Boolean = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree, after rotateLeft.
    */
  /* private */ def `rotateLeft_`(): js.Any = js.native
  /**
    * @private
    * @return {!LLRBNode} New tree, after rotateRight.
    */
  /* private */ def `rotateRight_`(): js.Any = js.native
}

@JSImport("@firebase/database/dist/src/core/util/SortedMap", "LLRBNode")
@js.native
object LLRBNode extends js.Object {
  var BLACK: scala.Boolean = js.native
  var RED: scala.Boolean = js.native
}

