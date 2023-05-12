package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortedMap[K, V] extends StObject {
  
  def comparator(key1: K, key2: K): Double = js.native
  @JSName("comparator")
  var comparator_Original: Comparator[K] = js.native
  
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
  
  var root: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
  
  def size: Double = js.native
}
