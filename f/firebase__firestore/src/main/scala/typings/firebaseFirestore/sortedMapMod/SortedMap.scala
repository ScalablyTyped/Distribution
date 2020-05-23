package typings.firebaseFirestore.sortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/util/sorted_map", "SortedMap")
@js.native
class SortedMap[K, V] protected () extends js.Object {
  def this(comparator: Comparator[K]) = this()
  def this(comparator: Comparator[K], root: LLRBEmptyNode[K, V]) = this()
  def this(comparator: Comparator[K], root: LLRBNode[K, V]) = this()
  @JSName("comparator")
  var comparator_Original: Comparator[K] = js.native
  var root: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  def comparator(key1: K, key2: K): Double = js.native
  def forEach(fn: js.Function2[/* k */ K, /* v */ V, Unit]): Unit = js.native
  def get(key: K): V | Null = js.native
  def getIterator(): SortedMapIterator[K, V] = js.native
  def getIteratorFrom(key: K): SortedMapIterator[K, V] = js.native
  def getReverseIterator(): SortedMapIterator[K, V] = js.native
  def getReverseIteratorFrom(key: K): SortedMapIterator[K, V] = js.native
  def indexOf(key: K): Double = js.native
  def inorderTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
  def insert(key: K, value: V): SortedMap[K, V] = js.native
  def isEmpty(): Boolean = js.native
  def maxKey(): K | Null = js.native
  def minKey(): K | Null = js.native
  def remove(key: K): SortedMap[K, V] = js.native
  def reverseTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
  def size: Double = js.native
}

