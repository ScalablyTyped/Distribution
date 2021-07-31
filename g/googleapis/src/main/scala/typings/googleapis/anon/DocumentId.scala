package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentId extends StObject {
  
  var documentId: js.UndefOr[String] = js.undefined
}
object DocumentId {
  
  @scala.inline
  def apply(): DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentId]
  }
  
  @scala.inline
  implicit class DocumentIdMutableBuilder[Self <: DocumentId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
  }
}
