package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateDocumentRequest. */
@js.native
trait ICreateDocumentRequest extends StObject {
  
  /** CreateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.native
  
  /** CreateDocumentRequest parent */
  var parent: js.UndefOr[String | Null] = js.native
}
object ICreateDocumentRequest {
  
  @scala.inline
  def apply(): ICreateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateDocumentRequest]
  }
  
  @scala.inline
  implicit class ICreateDocumentRequestMutableBuilder[Self <: ICreateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNull: Self = StObject.set(x, "document", null)
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
