package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDocument extends js.Object {
  
  /**
    * If recipients were added by converting form fields into tabs, their ids appear here. Read only.
    */
  var addedRecipientIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If this document is an attachment to another document in the envelope, this is the id of the attachment tab it is associated with on the other document.
    */
  var attachmentTabId: js.UndefOr[String] = js.native
  
  /**
    * When **true**, marks all of the documents in the envelope as authoritative copies.
    *
    * **Note**: You can override this value for a specific document. For example, you can set the `authoritativeCopy` property to **true** at the envelope level,
    * but turn it off for a single document by setting the `authoritativeCopy` property for the document to **false**.
    */
  var authoritativeCopy: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `authoritativeCopy` property. Not applicable for template documents.
    */
  var authoritativeCopyMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var availableDocumentTypes: js.UndefOr[
    js.Array[
      /* This object contains information about the type of signature. */ SignatureType
    ]
  ] = js.native
  
  /**
    * When **true**, the document has editable form fields that are made available through a PDF format.
    */
  var containsPdfFormFields: js.UndefOr[String] = js.native
  
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
  var display: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `display` property. Not applicable for template documents.
    */
  var displayMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An object containing information about the custom fields on the document.
    */
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * The id of the document that the tab is placed on. This value must refer to the id of an existing document.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the document.
    */
  var documentIdGuid: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * When set to **true**,
    * the document is included in the combined document download (`documentsCombinedUri`).
    * The default value is **true**.
    *
    */
  var includeInDownload: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `includeInDowload` property. Not applicable for template documents.
    */
  var includeInDownloadMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The document's file name.
    *
    * Example: `Q1-Report.docx`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `name` property. Not applicable for template documents.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * (Optional) The order in which to sort the results.
    *
    * Valid values are:
    *
    *
    * * `asc`: Ascending order.
    * * `desc`: Descending order.
    */
  var order: js.UndefOr[String] = js.native
  
  /**
    * An array of page objects that contain information about the pages in the document.
    */
  var pages: js.UndefOr[js.Array[/* Description of a page of a document. */ Page]] = js.native
  
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
  var signerMustAcknowledge: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the `signerMustAcknowledge` property. Not applicable for template documents.
    */
  var signerMustAcknowledgeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var sizeBytes: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the document.
    */
  var uri: js.UndefOr[String] = js.native
}
object EnvelopeDocument {
  
  @scala.inline
  def apply(): EnvelopeDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocument]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentOps[Self <: EnvelopeDocument] (val x: Self) extends AnyVal {
    
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
    def setAddedRecipientIdsVarargs(value: String*): Self = this.set("addedRecipientIds", js.Array(value :_*))
    
    @scala.inline
    def setAddedRecipientIds(value: js.Array[String]): Self = this.set("addedRecipientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedRecipientIds: Self = this.set("addedRecipientIds", js.undefined)
    
    @scala.inline
    def setAttachmentTabId(value: String): Self = this.set("attachmentTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentTabId: Self = this.set("attachmentTabId", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopy(value: String): Self = this.set("authoritativeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoritativeCopy: Self = this.set("authoritativeCopy", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopyMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("authoritativeCopyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoritativeCopyMetadata: Self = this.set("authoritativeCopyMetadata", js.undefined)
    
    @scala.inline
    def setAvailableDocumentTypesVarargs(value: (/* This object contains information about the type of signature. */ SignatureType)*): Self = this.set("availableDocumentTypes", js.Array(value :_*))
    
    @scala.inline
    def setAvailableDocumentTypes(
      value: js.Array[
          /* This object contains information about the type of signature. */ SignatureType
        ]
    ): Self = this.set("availableDocumentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableDocumentTypes: Self = this.set("availableDocumentTypes", js.undefined)
    
    @scala.inline
    def setContainsPdfFormFields(value: String): Self = this.set("containsPdfFormFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsPdfFormFields: Self = this.set("containsPdfFormFields", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDisplayMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("displayMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMetadata: Self = this.set("displayMetadata", js.undefined)
    
    @scala.inline
    def setDocumentFieldsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("documentFields", js.Array(value :_*))
    
    @scala.inline
    def setDocumentFields(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("documentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFields: Self = this.set("documentFields", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentIdGuid(value: String): Self = this.set("documentIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentIdGuid: Self = this.set("documentIdGuid", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setIncludeInDownload(value: String): Self = this.set("includeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInDownload: Self = this.set("includeInDownload", js.undefined)
    
    @scala.inline
    def setIncludeInDownloadMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("includeInDownloadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInDownloadMetadata: Self = this.set("includeInDownloadMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameMetadata: Self = this.set("nameMetadata", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: (/* Description of a page of a document. */ Page)*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[/* Description of a page of a document. */ Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledge(value: String): Self = this.set("signerMustAcknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustAcknowledge: Self = this.set("signerMustAcknowledge", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledgeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signerMustAcknowledgeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustAcknowledgeMetadata: Self = this.set("signerMustAcknowledgeMetadata", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = this.set("templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLocked: Self = this.set("templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = this.set("templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequired: Self = this.set("templateRequired", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
