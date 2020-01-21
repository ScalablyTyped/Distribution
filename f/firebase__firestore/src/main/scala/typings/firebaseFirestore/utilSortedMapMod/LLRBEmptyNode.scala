package typings.firebaseFirestore.utilSortedMapMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/sorted_map", "LLRBEmptyNode")
@js.native
class LLRBEmptyNode[K, V] () extends js.Object {
  var size: Double = js.native
  /* protected */ def check(): `0` = js.native
  def checkMaxDepth(): Boolean = js.native
  def color(): scala.Nothing = js.native
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
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
  def isEmpty(): Boolean = js.native
  def isRed(): Boolean = js.native
  def key(): scala.Nothing = js.native
  def left(): scala.Nothing = js.native
  def maxKey(): K | Null = js.native
  def minKey(): K | Null = js.native
  def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V] = js.native
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
  def right(): scala.Nothing = js.native
  def value(): scala.Nothing = js.native
}

