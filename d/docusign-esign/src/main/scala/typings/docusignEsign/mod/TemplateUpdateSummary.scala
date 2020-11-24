package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateUpdateSummary extends js.Object {
  
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
  implicit class TemplateUpdateSummaryOps[Self <: TemplateUpdateSummary] (val x: Self) extends AnyVal {
    
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
    def setBulkEnvelopeStatus(value: BulkEnvelopeStatus): Self = this.set("bulkEnvelopeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkEnvelopeStatus: Self = this.set("bulkEnvelopeStatus", js.undefined)
    
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
    def setListCustomFieldUpdateResultsVarargs(
      value: (/* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField)*
    ): Self = this.set("listCustomFieldUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setListCustomFieldUpdateResults(
      value: js.Array[
          /* This object represents a list custom field from which envelope creators and senders can select custom data. */ ListCustomField
        ]
    ): Self = this.set("listCustomFieldUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListCustomFieldUpdateResults: Self = this.set("listCustomFieldUpdateResults", js.undefined)
    
    @scala.inline
    def setLockInformation(value: /* This section provides information about envelope locks. */ EnvelopeLocks): Self = this.set("lockInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockInformation: Self = this.set("lockInformation", js.undefined)
    
    @scala.inline
    def setPurgeState(value: String): Self = this.set("purgeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeState: Self = this.set("purgeState", js.undefined)
    
    @scala.inline
    def setRecipientUpdateResultsVarargs(
      value: (/* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse)*
    ): Self = this.set("recipientUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setRecipientUpdateResults(
      value: js.Array[
          /* The recipient details that are returned after you update the recipient. */ RecipientUpdateResponse
        ]
    ): Self = this.set("recipientUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientUpdateResults: Self = this.set("recipientUpdateResults", js.undefined)
    
    @scala.inline
    def setTabUpdateResults(value: EnvelopeRecipientTabs): Self = this.set("tabUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabUpdateResults: Self = this.set("tabUpdateResults", js.undefined)
    
    @scala.inline
    def setTextCustomFieldUpdateResultsVarargs(
      value: (/* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField)*
    ): Self = this.set("textCustomFieldUpdateResults", js.Array(value :_*))
    
    @scala.inline
    def setTextCustomFieldUpdateResults(
      value: js.Array[
          /* This object represents a free text custom field where envelope creators and senders can enter custom data. */ TextCustomField
        ]
    ): Self = this.set("textCustomFieldUpdateResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextCustomFieldUpdateResults: Self = this.set("textCustomFieldUpdateResults", js.undefined)
  }
}
