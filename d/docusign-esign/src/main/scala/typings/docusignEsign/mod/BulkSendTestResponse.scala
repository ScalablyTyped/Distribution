package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendTestResponse extends js.Object {
  
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
  implicit class BulkSendTestResponseOps[Self <: BulkSendTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanBeSent(value: Boolean): Self = this.set("canBeSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanBeSent: Self = this.set("canBeSent", js.undefined)
    
    @scala.inline
    def setValidationErrorDetailsVarargs(value: String*): Self = this.set("validationErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrorDetails(value: js.Array[String]): Self = this.set("validationErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationErrorDetails: Self = this.set("validationErrorDetails", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: String*): Self = this.set("validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrors(value: js.Array[String]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
  }
}
