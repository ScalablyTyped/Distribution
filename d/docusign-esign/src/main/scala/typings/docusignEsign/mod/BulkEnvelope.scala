package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEnvelope extends js.Object {
  
  /**
    * The row of the recipient in the CSV file used to create the bulk recipient list.
    */
  var bulkRecipientRow: js.UndefOr[String] = js.native
  
  /**
    * Indicates the status of the bulk send operation. Returned values can be:
    * - `queued`
    * - `processing`
    * - `sent`
    * - `failed`
    */
  var bulkStatus: js.UndefOr[String] = js.native
  
  /**
    * The email address of the recipient assigned to this envelope transaction.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * GUID of the bulk envelope.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the envelope or envelopes.
    */
  var envelopeUri: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The name of the recipient assigned to this envelope transaction.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The date and time on which the bulk envelope was created.
    */
  var submittedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Identifier for the envelope transaction. The ID is a sender-generated value and is valid in the DocuSign system for 7 days.
    * We recommend that you use a transaction ID for offline signing to ensure that an envelope is not sent multiple times.
    * You can use the transaction ID to determine an envelope's status (queued, processing, sent, or failed) in cases where the Internet
    * connection is lost before envelope status is returned.
    */
  var transactionId: js.UndefOr[String] = js.native
}
object BulkEnvelope {
  
  @scala.inline
  def apply(): BulkEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEnvelope]
  }
  
  @scala.inline
  implicit class BulkEnvelopeOps[Self <: BulkEnvelope] (val x: Self) extends AnyVal {
    
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
    def setBulkRecipientRow(value: String): Self = this.set("bulkRecipientRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkRecipientRow: Self = this.set("bulkRecipientRow", js.undefined)
    
    @scala.inline
    def setBulkStatus(value: String): Self = this.set("bulkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkStatus: Self = this.set("bulkStatus", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = this.set("envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeUri: Self = this.set("envelopeUri", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubmittedDateTime(value: String): Self = this.set("submittedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedDateTime: Self = this.set("submittedDateTime", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
