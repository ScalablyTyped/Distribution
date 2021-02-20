package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEnvelope extends StObject {
  
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
  implicit class BulkEnvelopeMutableBuilder[Self <: BulkEnvelope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkRecipientRow(value: String): Self = StObject.set(x, "bulkRecipientRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkRecipientRowUndefined: Self = StObject.set(x, "bulkRecipientRow", js.undefined)
    
    @scala.inline
    def setBulkStatus(value: String): Self = StObject.set(x, "bulkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkStatusUndefined: Self = StObject.set(x, "bulkStatus", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = StObject.set(x, "envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeUriUndefined: Self = StObject.set(x, "envelopeUri", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubmittedDateTime(value: String): Self = StObject.set(x, "submittedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDateTimeUndefined: Self = StObject.set(x, "submittedDateTime", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
