package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "DocumentStore")
@js.native
class DocumentStore[T] () extends StObject {
  def this(save: Boolean) = this()
  
  def addDoc(docRef: DocumentReference, doc: T): Unit = js.native
  
  def addFieldLength(docRef: DocumentReference, fieldName: /* keyof T */ String, length: Double): Unit = js.native
  
  def getDoc(docRef: DocumentReference): T = js.native
  
  def getFieldLength(docRef: DocumentReference, fieldName: /* keyof T */ String): Double = js.native
  
  def hasDoc(docRef: DocumentReference): Boolean = js.native
  
  def isDocStored(): Boolean = js.native
  
  def removeDoc(docRef: DocumentReference): Unit = js.native
  
  def toJSON(): SerialisedDocumentStore[T] = js.native
  
  def updateFieldLength(docRef: DocumentReference, fieldName: /* keyof T */ String, length: Double): Unit = js.native
}
object DocumentStore {
  
  @JSImport("elasticlunr", "DocumentStore")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def load[T](serialisedData: SerialisedDocumentStore[T]): DocumentStore[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[DocumentStore[T]]
}
