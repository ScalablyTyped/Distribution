package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEnvelope extends StObject {
  
  /**
    * The row of the recipient in the CSV file used to create the bulk recipient list.
    */
  var bulkRecipientRow: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the status of the bulk send operation. Returned values can be:
    * - `queued`
    * - `processing`
    * - `sent`
    * - `failed`
    */
  var bulkStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the recipient assigned to this envelope transaction.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * GUID of the bulk envelope.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the envelope or envelopes.
    */
  var envelopeUri: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The name of the recipient assigned to this envelope transaction.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time on which the bulk envelope was created.
    */
  var submittedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the envelope transaction. The ID is a sender-generated value and is valid in the DocuSign system for 7 days.
    * We recommend that you use a transaction ID for offline signing to ensure that an envelope is not sent multiple times.
    * You can use the transaction ID to determine an envelope's status (queued, processing, sent, or failed) in cases where the Internet
    * connection is lost before envelope status is returned.
    */
  var transactionId: js.UndefOr[String] = js.undefined
}
object BulkEnvelope {
  
  inline def apply(): BulkEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEnvelope]
  }
  
  extension [Self <: BulkEnvelope](x: Self) {
    
    inline def setBulkRecipientRow(value: String): Self = StObject.set(x, "bulkRecipientRow", value.asInstanceOf[js.Any])
    
    inline def setBulkRecipientRowUndefined: Self = StObject.set(x, "bulkRecipientRow", js.undefined)
    
    inline def setBulkStatus(value: String): Self = StObject.set(x, "bulkStatus", value.asInstanceOf[js.Any])
    
    inline def setBulkStatusUndefined: Self = StObject.set(x, "bulkStatus", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setEnvelopeUri(value: String): Self = StObject.set(x, "envelopeUri", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUriUndefined: Self = StObject.set(x, "envelopeUri", js.undefined)
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubmittedDateTime(value: String): Self = StObject.set(x, "submittedDateTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedDateTimeUndefined: Self = StObject.set(x, "submittedDateTime", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
