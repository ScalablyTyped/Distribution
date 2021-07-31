package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientWebDocumentViewerDocumentOperationResponse extends StObject {
  
  var customData: String
  
  var documentId: String
  
  var message: String
  
  var succeeded: Boolean
}
object ASPxClientWebDocumentViewerDocumentOperationResponse {
  
  @scala.inline
  def apply(customData: String, documentId: String, message: String, succeeded: Boolean): ASPxClientWebDocumentViewerDocumentOperationResponse = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], documentId = documentId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentOperationResponse]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerDocumentOperationResponseMutableBuilder[Self <: ASPxClientWebDocumentViewerDocumentOperationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
