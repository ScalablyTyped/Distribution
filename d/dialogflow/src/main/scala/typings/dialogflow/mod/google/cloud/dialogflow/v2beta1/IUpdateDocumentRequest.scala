package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an UpdateDocumentRequest. */
@js.native
trait IUpdateDocumentRequest extends StObject {
  
  /** UpdateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.native
  
  /** UpdateDocumentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.native
}
object IUpdateDocumentRequest {
  
  @scala.inline
  def apply(): IUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUpdateDocumentRequest]
  }
  
  @scala.inline
  implicit class IUpdateDocumentRequestMutableBuilder[Self <: IUpdateDocumentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: IDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNull: Self = StObject.set(x, "document", null)
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: IFieldMask): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
