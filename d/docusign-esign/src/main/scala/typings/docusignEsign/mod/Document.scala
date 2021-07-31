package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var applyAnchorTabs: js.UndefOr[String] = js.undefined
  
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
    * The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document
    * using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.
    */
  var documentBase64: js.UndefOr[String] = js.undefined
  
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.undefined
  
  /**
    * Specifies the document ID of this document. This value is used by tabs to determine which document they appear in.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.
    *
    */
  var encryptedWithKeyManager: js.UndefOr[String] = js.undefined
  
  /**
    * The file extension type of the document. Non-PDF documents are converted to PDF.
    *
    * If the document is not a PDF, `fileExtension` is required.
    *
    * If you try to upload a non-PDF document without a `fileExtension`, you will receive an "unable to load document" error message.
    *
    */
  var fileExtension: js.UndefOr[String] = js.undefined
  
  var fileFormatHint: js.UndefOr[String] = js.undefined
  
  var htmlDefinition: js.UndefOr[
    /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
  ] = js.undefined
  
  /**
    * When set to **true**,
    * the document is included in the combined document download (`documentsCombinedUri`).
    * The default value is **true**.
    *
    */
  var includeInDownload: js.UndefOr[String] = js.undefined
  
  var isDynamicXfa: js.UndefOr[Boolean] = js.undefined
  
  var isStaticXfa: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Matchboxes define areas in a document for document matching when you are creating envelopes. They are only used when you upload and edit a template.
    *
    * A matchbox consists of 5 elements:
    *
    * * pageNumber - The document page number  on which the matchbox will appear.
    * * xPosition - The x position of the matchbox on a page.
    * * yPosition - The y position of the matchbox on a page.
    * * width - The width of the matchbox.
    * * height - The height of the matchbox.
    *
    */
  var matchBoxes: js.UndefOr[js.Array[MatchBox]] = js.undefined
  
  /**
    * The name of the document.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var ocrRequests: js.UndefOr[js.Array[OcrRequest]] = js.undefined
  
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
    * An integer value specifying the number of document pages in the template.
    */
  var pageCount: js.UndefOr[String] = js.undefined
  
  var pageSizes: js.UndefOr[js.Array[PageSize]] = js.undefined
  
  /**
    * An array of page objects.
    */
  var pages: js.UndefOr[String] = js.undefined
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.undefined
  
  var pdfFieldsData: js.UndefOr[String] = js.undefined
  
  var pdfFormFieldOption: js.UndefOr[String] = js.undefined
  
  var pdfWidgetsBase64: js.UndefOr[String] = js.undefined
  
  /**
    * The file id from the cloud storage service where the document is located. This information is returned using
    * [CloudStorage::listFolders](https://developers.docusign.com/esign-rest-api/reference/CloudStorage/CloudStorage/listFolders) or
    * [CloudStorage::list](https://developers.docusign.com/esign-rest-api/reference/CloudStorage/CloudStorage/list).
    *
    */
  var remoteUrl: js.UndefOr[String] = js.undefined
  
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
  
  var signerMustAcknowledgeUseAccountDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.undefined
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel.
    * The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF.
    *
    */
  var transformPdfFields: js.UndefOr[String] = js.undefined
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object Document {
  
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyAnchorTabs(value: String): Self = StObject.set(x, "applyAnchorTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyAnchorTabsUndefined: Self = StObject.set(x, "applyAnchorTabs", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDocumentBase64(value: String): Self = StObject.set(x, "documentBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentBase64Undefined: Self = StObject.set(x, "documentBase64", js.undefined)
    
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
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setEncryptedWithKeyManager(value: String): Self = StObject.set(x, "encryptedWithKeyManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedWithKeyManagerUndefined: Self = StObject.set(x, "encryptedWithKeyManager", js.undefined)
    
    @scala.inline
    def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    @scala.inline
    def setFileFormatHint(value: String): Self = StObject.set(x, "fileFormatHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatHintUndefined: Self = StObject.set(x, "fileFormatHint", js.undefined)
    
    @scala.inline
    def setHtmlDefinition(
      value: /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
    ): Self = StObject.set(x, "htmlDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlDefinitionUndefined: Self = StObject.set(x, "htmlDefinition", js.undefined)
    
    @scala.inline
    def setIncludeInDownload(value: String): Self = StObject.set(x, "includeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInDownloadUndefined: Self = StObject.set(x, "includeInDownload", js.undefined)
    
    @scala.inline
    def setIsDynamicXfa(value: Boolean): Self = StObject.set(x, "isDynamicXfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamicXfaUndefined: Self = StObject.set(x, "isDynamicXfa", js.undefined)
    
    @scala.inline
    def setIsStaticXfa(value: Boolean): Self = StObject.set(x, "isStaticXfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStaticXfaUndefined: Self = StObject.set(x, "isStaticXfa", js.undefined)
    
    @scala.inline
    def setMatchBoxes(value: js.Array[MatchBox]): Self = StObject.set(x, "matchBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchBoxesUndefined: Self = StObject.set(x, "matchBoxes", js.undefined)
    
    @scala.inline
    def setMatchBoxesVarargs(value: MatchBox*): Self = StObject.set(x, "matchBoxes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOcrRequests(value: js.Array[OcrRequest]): Self = StObject.set(x, "ocrRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrRequestsUndefined: Self = StObject.set(x, "ocrRequests", js.undefined)
    
    @scala.inline
    def setOcrRequestsVarargs(value: OcrRequest*): Self = StObject.set(x, "ocrRequests", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPageCount(value: String): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setPageSizes(value: js.Array[PageSize]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    @scala.inline
    def setPageSizesVarargs(value: PageSize*): Self = StObject.set(x, "pageSizes", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPdfFieldsData(value: String): Self = StObject.set(x, "pdfFieldsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfFieldsDataUndefined: Self = StObject.set(x, "pdfFieldsData", js.undefined)
    
    @scala.inline
    def setPdfFormFieldOption(value: String): Self = StObject.set(x, "pdfFormFieldOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfFormFieldOptionUndefined: Self = StObject.set(x, "pdfFormFieldOption", js.undefined)
    
    @scala.inline
    def setPdfWidgetsBase64(value: String): Self = StObject.set(x, "pdfWidgetsBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfWidgetsBase64Undefined: Self = StObject.set(x, "pdfWidgetsBase64", js.undefined)
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrlUndefined: Self = StObject.set(x, "remoteUrl", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledge(value: String): Self = StObject.set(x, "signerMustAcknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerMustAcknowledgeUndefined: Self = StObject.set(x, "signerMustAcknowledge", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledgeUseAccountDefault(value: Boolean): Self = StObject.set(x, "signerMustAcknowledgeUseAccountDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerMustAcknowledgeUseAccountDefaultUndefined: Self = StObject.set(x, "signerMustAcknowledgeUseAccountDefault", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setTransformPdfFields(value: String): Self = StObject.set(x, "transformPdfFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformPdfFieldsUndefined: Self = StObject.set(x, "transformPdfFields", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
