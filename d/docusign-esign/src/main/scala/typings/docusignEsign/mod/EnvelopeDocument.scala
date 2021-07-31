package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeDocument extends StObject {
  
  /**
    * If recipients were added by converting form fields into tabs, their ids appear here. Read only.
    */
  var addedRecipientIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If this document is an attachment to another document in the envelope, this is the id of the attachment tab it is associated with on the other document.
    */
  var attachmentTabId: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, marks all of the documents in the envelope as authoritative copies.
    *
    * **Note**: You can override this value for a specific document. For example, you can set the `authoritativeCopy` property to **true** at the envelope level,
    * but turn it off for a single document by setting the `authoritativeCopy` property for the document to **false**.
    */
  var authoritativeCopy: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `authoritativeCopy` property. Not applicable for template documents.
    */
  var authoritativeCopyMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  var availableDocumentTypes: js.UndefOr[
    js.Array[
      /* This object contains information about the type of signature. */ SignatureType
    ]
  ] = js.undefined
  
  /**
    * When **true**, the document has editable form fields that are made available through a PDF format.
    */
  var containsPdfFormFields: js.UndefOr[String] = js.undefined
  
  /**
    * This string sets the display and behavior properties of
    * the document during signing. The possible values are:
    *
    * * `modal`<br>
    *   The document is shown as a supplement action strip
    *   and can be viewed, downloaded, or printed in a modal window.
    *   This is the recommended value for supplemental documents.
    *
    * * `download`<br>
    *   The document is shown as a supplement action strip
    *   and can be viewed, downloaded, or printed in a new browser window.
    *
    * * `inline`<br>
    *   The document is shown in the normal signing window.
    *   This value is not used with supplemental documents,
    *   but is the default value for all other documents.
    *
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `display` property. Not applicable for template documents.
    */
  var displayMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An object containing information about the custom fields on the document.
    */
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * The id of the document that the tab is placed on. This value must refer to the id of an existing document.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID of the document.
    */
  var documentIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * When set to **true**,
    * the document is included in the combined document download (`documentsCombinedUri`).
    * The default value is **true**.
    *
    */
  var includeInDownload: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `includeInDowload` property. Not applicable for template documents.
    */
  var includeInDownloadMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The document's file name.
    *
    * Example: `Q1-Report.docx`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `name` property. Not applicable for template documents.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * (Optional) The order in which to sort the results.
    *
    * Valid values are:
    *
    *
    * * `asc`: Ascending order.
    * * `desc`: Descending order.
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * An array of page objects that contain information about the pages in the document.
    */
  var pages: js.UndefOr[js.Array[/* Description of a page of a document. */ Page]] = js.undefined
  
  /**
    * Sets how the signer interacts with the supplemental document.
    * The possible values are:
    *
    * *	`no_interaction`<br>
    *   No recipient action is required.
    *
    * *	`view`<br>
    *   The recipient is required to view the document.
    *
    * *	`accept`<br>
    *   The recipient is required to accept the document by selecting accept during signing, but is not required to view the document.
    *
    * *	`view_accept`<br>
    *   The recipient is required to view and accept the document.
    *
    *
    */
  var signerMustAcknowledge: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the `signerMustAcknowledge` property. Not applicable for template documents.
    */
  var signerMustAcknowledgeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  var sizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the document.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object EnvelopeDocument {
  
  @scala.inline
  def apply(): EnvelopeDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocument]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentMutableBuilder[Self <: EnvelopeDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedRecipientIds(value: js.Array[String]): Self = StObject.set(x, "addedRecipientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedRecipientIdsUndefined: Self = StObject.set(x, "addedRecipientIds", js.undefined)
    
    @scala.inline
    def setAddedRecipientIdsVarargs(value: String*): Self = StObject.set(x, "addedRecipientIds", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentTabId(value: String): Self = StObject.set(x, "attachmentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTabIdUndefined: Self = StObject.set(x, "attachmentTabId", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopy(value: String): Self = StObject.set(x, "authoritativeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoritativeCopyMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "authoritativeCopyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoritativeCopyMetadataUndefined: Self = StObject.set(x, "authoritativeCopyMetadata", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopyUndefined: Self = StObject.set(x, "authoritativeCopy", js.undefined)
    
    @scala.inline
    def setAvailableDocumentTypes(
      value: js.Array[
          /* This object contains information about the type of signature. */ SignatureType
        ]
    ): Self = StObject.set(x, "availableDocumentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableDocumentTypesUndefined: Self = StObject.set(x, "availableDocumentTypes", js.undefined)
    
    @scala.inline
    def setAvailableDocumentTypesVarargs(value: (/* This object contains information about the type of signature. */ SignatureType)*): Self = StObject.set(x, "availableDocumentTypes", js.Array(value :_*))
    
    @scala.inline
    def setContainsPdfFormFields(value: String): Self = StObject.set(x, "containsPdfFormFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsPdfFormFieldsUndefined: Self = StObject.set(x, "containsPdfFormFields", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "displayMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMetadataUndefined: Self = StObject.set(x, "displayMetadata", js.undefined)
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDocumentFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "documentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFieldsUndefined: Self = StObject.set(x, "documentFields", js.undefined)
    
    @scala.inline
    def setDocumentFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "documentFields", js.Array(value :_*))
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdGuid(value: String): Self = StObject.set(x, "documentIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdGuidUndefined: Self = StObject.set(x, "documentIdGuid", js.undefined)
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setIncludeInDownload(value: String): Self = StObject.set(x, "includeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInDownloadMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "includeInDownloadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInDownloadMetadataUndefined: Self = StObject.set(x, "includeInDownloadMetadata", js.undefined)
    
    @scala.inline
    def setIncludeInDownloadUndefined: Self = StObject.set(x, "includeInDownload", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadataUndefined: Self = StObject.set(x, "nameMetadata", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPages(value: js.Array[/* Description of a page of a document. */ Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: (/* Description of a page of a document. */ Page)*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setSignerMustAcknowledge(value: String): Self = StObject.set(x, "signerMustAcknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerMustAcknowledgeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerMustAcknowledgeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerMustAcknowledgeMetadataUndefined: Self = StObject.set(x, "signerMustAcknowledgeMetadata", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledgeUndefined: Self = StObject.set(x, "signerMustAcknowledge", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
