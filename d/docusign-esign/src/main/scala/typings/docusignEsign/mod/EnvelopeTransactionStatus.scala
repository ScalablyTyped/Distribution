package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeTransactionStatus extends StObject {
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * Indicates the envelope status. Valid values are:
    *
    * * sent - The envelope is sent to the recipients.
    * * created - The envelope is saved as a draft and can be modified and sent later.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for
    * offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status
    * (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
    */
  var transactionId: js.UndefOr[String] = js.undefined
}
object EnvelopeTransactionStatus {
  
  @scala.inline
  def apply(): EnvelopeTransactionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTransactionStatus]
  }
  
  @scala.inline
  implicit class EnvelopeTransactionStatusMutableBuilder[Self <: EnvelopeTransactionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
