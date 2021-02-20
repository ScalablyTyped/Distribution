package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateUpdateSummary extends StObject {
  
  /**
    * An object that describes the status of the bulk send envelopes.
    */
  var bulkEnvelopeStatus: js.UndefOr[BulkEnvelopeStatus] = js.native
  
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
  
  var listCustomFieldUpdateResults: js.UndefOr[
    js.Array[
      /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
    ]
  ] = js.native
  
  /**
    * Provides lock information about an envelope that a user has locked.
    */
  var lockInformation: js.UndefOr[/* This section provides information about envelope locks. */ EnvelopeLocks] = js.native
  
  /**
    * Shows the current purge state for the envelope. The possible values are:
    *
    * * `unpurged`: There has been no successful request to purge documents.
    * * `documents_queued`: The envelope documents have been added to the purge queue, but have not been purged.
    * * `documents_dequeued`: The envelope documents have been taken out of the purge queue.
    * * `documents_and_metadata_queued`: The envelope documents and metadata have been added to the purge queue, but have not yet been purged.
    * * `documents_purged`: The envelope documents have been successfully purged.
    * * `documents_and_metadata_purged`: The envelope documents and metadata have been successfully purged.
    */
  var purgeState: js.UndefOr[String] = js.native
  
  /**
    * An array of `recipientUpdateResults` objects that contain details about the recipients.
    */
  var recipientUpdateResults: js.UndefOr[
    js.Array[
      /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
    ]
  ] = js.native
  
  var tabUpdateResults: js.UndefOr[EnvelopeRecipientTabs] = js.native
  
  var textCustomFieldUpdateResults: js.UndefOr[
    js.Array[
      /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
    ]
  ] = js.native
}
object TemplateUpdateSummary {
  
  @scala.inline
  def apply(): TemplateUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateUpdateSummary]
  }
  
  @scala.inline
  implicit class TemplateUpdateSummaryMutableBuilder[Self <: TemplateUpdateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkEnvelopeStatus(value: BulkEnvelopeStatus): Self = StObject.set(x, "bulkEnvelopeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkEnvelopeStatusUndefined: Self = StObject.set(x, "bulkEnvelopeStatus", js.undefined)
    
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
    def setListCustomFieldUpdateResults(
      value: js.Array[
          /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
        ]
    ): Self = StObject.set(x, "listCustomFieldUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListCustomFieldUpdateResultsUndefined: Self = StObject.set(x, "listCustomFieldUpdateResults", js.undefined)
    
    @scala.inline
    def setListCustomFieldUpdateResultsVarargs(
      value: (/* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField)*
    ): Self = StObject.set(x, "listCustomFieldUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setLockInformation(value: /* This section provides information about envelope locks. */ EnvelopeLocks): Self = StObject.set(x, "lockInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockInformationUndefined: Self = StObject.set(x, "lockInformation", js.undefined)
    
    @scala.inline
    def setPurgeState(value: String): Self = StObject.set(x, "purgeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeStateUndefined: Self = StObject.set(x, "purgeState", js.undefined)
    
    @scala.inline
    def setRecipientUpdateResults(
      value: js.Array[
          /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
        ]
    ): Self = StObject.set(x, "recipientUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUpdateResultsUndefined: Self = StObject.set(x, "recipientUpdateResults", js.undefined)
    
    @scala.inline
    def setRecipientUpdateResultsVarargs(
      value: (/* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse)*
    ): Self = StObject.set(x, "recipientUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setTabUpdateResults(value: EnvelopeRecipientTabs): Self = StObject.set(x, "tabUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabUpdateResultsUndefined: Self = StObject.set(x, "tabUpdateResults", js.undefined)
    
    @scala.inline
    def setTextCustomFieldUpdateResults(
      value: js.Array[
          /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
        ]
    ): Self = StObject.set(x, "textCustomFieldUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextCustomFieldUpdateResultsUndefined: Self = StObject.set(x, "textCustomFieldUpdateResults", js.undefined)
    
    @scala.inline
    def setTextCustomFieldUpdateResultsVarargs(
      value: (/* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField)*
    ): Self = StObject.set(x, "textCustomFieldUpdateResults", js.Array(value :_*))
  }
}
