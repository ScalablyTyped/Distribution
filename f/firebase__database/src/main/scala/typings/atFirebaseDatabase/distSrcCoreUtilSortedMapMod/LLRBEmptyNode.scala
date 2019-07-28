package typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/SortedMap", "LLRBEmptyNode")
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

