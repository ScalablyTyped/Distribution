package typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/sorted_map", "LLRBNode")
@js.native
class LLRBNode[K, V] protected () extends js.Object {
  def this(key: K, value: V) = this()
  def this(key: K, value: V, color: Boolean) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
  def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
  val color: Boolean = js.native
  var colorFlip: js.Any = js.native
  var fixUp: js.Any = js.native
  var key: K = js.native
  val left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  var min: js.Any = js.native
  var moveRedLeft: js.Any = js.native
  var moveRedRight: js.Any = js.native
  var removeMin: js.Any = js.native
  val right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  var rotateLeft: js.Any = js.native
  var rotateRight: js.Any = js.native
  val size: Double = js.native
  var value: V = js.native
  /* protected */ def check(): Double = js.native
  def checkMaxDepth(): Boolean = js.native
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
  def inorderTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
  def isEmpty(): Boolean = js.native
  def isRed(): Boolean = js.native
  def maxKey(): K | Null = js.native
  def minKey(): K | Null = js.native
  def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  def reverseTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/util/sorted_map", "LLRBNode")
@js.native
object LLRBNode extends js.Object {
  var BLACK: Boolean = js.native
  var EMPTY: LLRBEmptyNode[_, _] = js.native
  var RED: Boolean = js.native
}

