package typings.firebaseFirestore.sortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/sorted_map", "SortedMapIterator")
@js.native
class SortedMapIterator[K, V] protected () extends js.Object {
  def this(node: LLRBEmptyNode[K, V], startKey: K, comparator: Comparator[K], isReverse: Boolean) = this()
  def this(node: LLRBEmptyNode[K, V], startKey: Null, comparator: Comparator[K], isReverse: Boolean) = this()
  def this(node: LLRBNode[K, V], startKey: K, comparator: Comparator[K], isReverse: Boolean) = this()
  def this(node: LLRBNode[K, V], startKey: Null, comparator: Comparator[K], isReverse: Boolean) = this()
  var isReverse: js.Any = js.native
  var nodeStack: js.Any = js.native
  def getNext(): Entry[K, V] = js.native
  def hasNext(): Boolean = js.native
  def peek(): (Entry[K, V]) | Null = js.native
}

