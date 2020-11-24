package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTransactionStatus extends js.Object {
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Indicates the envelope status. Valid values are:
    *
    * * sent - The envelope is sent to the recipients.
    * * created - The envelope is saved as a draft and can be modified and sent later.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for
    * offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status
    * (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
    */
  var transactionId: js.UndefOr[String] = js.native
}
object EnvelopeTransactionStatus {
  
  @scala.inline
  def apply(): EnvelopeTransactionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTransactionStatus]
  }
  
  @scala.inline
  implicit class EnvelopeTransactionStatusOps[Self <: EnvelopeTransactionStatus] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
