package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSendTestResponse extends StObject {
  
  /**
    * When **true**, the envelope or template is compatible with the bulk send list and can be sent by using the [BulkSend::createBulkSendRequest][BulkSendRequest] method.
    *
    * **Note**: This property is only returned in responses and ignored in requests.
    *
    * [BulkSendRequest]: ./createBulkSendRequest.html
    */
  var canBeSent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Human-readable details about any validation errors that occurred.
    */
  var validationErrorDetails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of validation errors that were encountered during the bulk send test.
    *
    * **Note**: This information is intended to be parsed by machine.
    */
  var validationErrors: js.UndefOr[js.Array[String]] = js.undefined
}
object BulkSendTestResponse {
  
  inline def apply(): BulkSendTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendTestResponse]
  }
  
  extension [Self <: BulkSendTestResponse](x: Self) {
    
    inline def setCanBeSent(value: Boolean): Self = StObject.set(x, "canBeSent", value.asInstanceOf[js.Any])
    
    inline def setCanBeSentUndefined: Self = StObject.set(x, "canBeSent", js.undefined)
    
    inline def setValidationErrorDetails(value: js.Array[String]): Self = StObject.set(x, "validationErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorDetailsUndefined: Self = StObject.set(x, "validationErrorDetails", js.undefined)
    
    inline def setValidationErrorDetailsVarargs(value: String*): Self = StObject.set(x, "validationErrorDetails", js.Array(value :_*))
    
    inline def setValidationErrors(value: js.Array[String]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: String*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
