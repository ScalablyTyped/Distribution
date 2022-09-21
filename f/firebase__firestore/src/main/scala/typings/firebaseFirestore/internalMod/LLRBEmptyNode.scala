package typings.firebaseFirestore.internalMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LLRBEmptyNode[K, V] extends StObject {
  
  /* protected */ def check(): `0` = js.native
  
  def checkMaxDepth(): Boolean = js.native
  
  def color: scala.Nothing = js.native
  
  def copy(
    key: K | Null,
    value: V | Null,
    color: Boolean | Null,
    left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
    right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
  ): LLRBEmptyNode[K, V] = js.native
  
  def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
  
  def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isRed(): Boolean = js.native
  
  def key: scala.Nothing = js.native
  
  def left: scala.Nothing = js.native
  
  def maxKey(): K | Null = js.native
  
  def minKey(): K | Null = js.native
  
  def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V] = js.native
  
  def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
  
  def right: scala.Nothing = js.native
  
  var size: Double = js.native
  
  def value: scala.Nothing = js.native
}
