package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendTestResponse extends StObject {
  
  /**
    * When **true**, the envelope or template is compatible with the bulk send list and can be sent by using the [BulkSend::createBulkSendRequest][BulkSendRequest] method.
    *
    * **Note**: This property is only returned in responses and ignored in requests.
    *
    * [BulkSendRequest]: ./createBulkSendRequest.html
    */
  var canBeSent: js.UndefOr[Boolean] = js.native
  
  /**
    * Human-readable details about any validation errors that occurred.
    */
  var validationErrorDetails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of validation errors that were encountered during the bulk send test.
    *
    * **Note**: This information is intended to be parsed by machine.
    */
  var validationErrors: js.UndefOr[js.Array[String]] = js.native
}
object BulkSendTestResponse {
  
  @scala.inline
  def apply(): BulkSendTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendTestResponse]
  }
  
  @scala.inline
  implicit class BulkSendTestResponseMutableBuilder[Self <: BulkSendTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanBeSent(value: Boolean): Self = StObject.set(x, "canBeSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanBeSentUndefined: Self = StObject.set(x, "canBeSent", js.undefined)
    
    @scala.inline
    def setValidationErrorDetails(value: js.Array[String]): Self = StObject.set(x, "validationErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorDetailsUndefined: Self = StObject.set(x, "validationErrorDetails", js.undefined)
    
    @scala.inline
    def setValidationErrorDetailsVarargs(value: String*): Self = StObject.set(x, "validationErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrors(value: js.Array[String]): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: String*): Self = StObject.set(x, "validationErrors", js.Array(value :_*))
  }
}
