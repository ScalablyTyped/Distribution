package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentChange[T] extends StObject {
  
  val doc: QueryDocumentSnapshot[T]
  
  val newIndex: Double
  
  val oldIndex: Double
  
  val `type`: DocumentChangeType
}
object DocumentChange {
  
  @scala.inline
  def apply[T](doc: QueryDocumentSnapshot[T], newIndex: Double, oldIndex: Double, `type`: DocumentChangeType): DocumentChange[T] = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange[T]]
  }
  
  @scala.inline
  implicit class DocumentChangeMutableBuilder[Self <: DocumentChange[?], T] (val x: Self & DocumentChange[T]) extends AnyVal {
    
    @scala.inline
    def setDoc(value: QueryDocumentSnapshot[T]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DocumentChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
