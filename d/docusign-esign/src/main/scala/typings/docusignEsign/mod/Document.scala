package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
  /**
    * Reserved for DocuSign.
    */
  var applyAnchorTabs: js.UndefOr[String] = js.native
  
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
    * The document's bytes. This field can be used to include a base64 version of the document bytes within an envelope definition instead of sending the document
    * using a multi-part HTTP request. The maximum document size is smaller if this field is used due to the overhead of the base64 encoding.
    */
  var documentBase64: js.UndefOr[String] = js.native
  
  var documentFields: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
  
  /**
    * Specifies the document ID of this document. This value is used by tabs to determine which document they appear in.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the document is been already encrypted by the sender for use with the DocuSign Key Manager Security Appliance.
    *
    */
  var encryptedWithKeyManager: js.UndefOr[String] = js.native
  
  /**
    * The file extension type of the document. Non-PDF documents are converted to PDF.
    *
    * If the document is not a PDF, `fileExtension` is required.
    *
    * If you try to upload a non-PDF document without a `fileExtension`, you will receive an "unable to load document" error message.
    *
    */
  var fileExtension: js.UndefOr[String] = js.native
  
  var fileFormatHint: js.UndefOr[String] = js.native
  
  var htmlDefinition: js.UndefOr[
    /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
  ] = js.native
  
  /**
    * When set to **true**,
    * the document is included in the combined document download (`documentsCombinedUri`).
    * The default value is **true**.
    *
    */
  var includeInDownload: js.UndefOr[String] = js.native
  
  var isDynamicXfa: js.UndefOr[Boolean] = js.native
  
  var isStaticXfa: js.UndefOr[Boolean] = js.native
  
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
  var matchBoxes: js.UndefOr[js.Array[MatchBox]] = js.native
  
  /**
    * The name of the document.
    */
  var name: js.UndefOr[String] = js.native
  
  var ocrRequests: js.UndefOr[js.Array[OcrRequest]] = js.native
  
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
    * An integer value specifying the number of document pages in the template.
    */
  var pageCount: js.UndefOr[String] = js.native
  
  var pageSizes: js.UndefOr[js.Array[PageSize]] = js.native
  
  /**
    * An array of page objects.
    */
  var pages: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  var pdfFieldsData: js.UndefOr[String] = js.native
  
  var pdfFormFieldOption: js.UndefOr[String] = js.native
  
  var pdfWidgetsBase64: js.UndefOr[String] = js.native
  
  /**
    * The file id from the cloud storage service where the document is located. This information is returned using
    * [CloudStorage::listFolders](https://developers.docusign.com/esign-rest-api/reference/CloudStorage/CloudStorage/listFolders) or
    * [CloudStorage::list](https://developers.docusign.com/esign-rest-api/reference/CloudStorage/CloudStorage/list).
    *
    */
  var remoteUrl: js.UndefOr[String] = js.native
  
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
  
  var signerMustAcknowledgeUseAccountDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, PDF form field data is transformed into document tab values when the PDF form field name matches the DocuSign custom tab tabLabel.
    * The resulting PDF form data is also returned in the PDF meta data when requesting the document PDF.
    *
    */
  var transformPdfFields: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
}
object Document {
  
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
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
    def setApplyAnchorTabs(value: String): Self = this.set("applyAnchorTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyAnchorTabs: Self = this.set("applyAnchorTabs", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDocumentBase64(value: String): Self = this.set("documentBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentBase64: Self = this.set("documentBase64", js.undefined)
    
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
    def setEncryptedWithKeyManager(value: String): Self = this.set("encryptedWithKeyManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptedWithKeyManager: Self = this.set("encryptedWithKeyManager", js.undefined)
    
    @scala.inline
    def setFileExtension(value: String): Self = this.set("fileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileExtension: Self = this.set("fileExtension", js.undefined)
    
    @scala.inline
    def setFileFormatHint(value: String): Self = this.set("fileFormatHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileFormatHint: Self = this.set("fileFormatHint", js.undefined)
    
    @scala.inline
    def setHtmlDefinition(
      value: /* Holds the properties that define how to generate the responsive-formatted HTML for the document. */ DocumentHtmlDefinition
    ): Self = this.set("htmlDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlDefinition: Self = this.set("htmlDefinition", js.undefined)
    
    @scala.inline
    def setIncludeInDownload(value: String): Self = this.set("includeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInDownload: Self = this.set("includeInDownload", js.undefined)
    
    @scala.inline
    def setIsDynamicXfa(value: Boolean): Self = this.set("isDynamicXfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDynamicXfa: Self = this.set("isDynamicXfa", js.undefined)
    
    @scala.inline
    def setIsStaticXfa(value: Boolean): Self = this.set("isStaticXfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStaticXfa: Self = this.set("isStaticXfa", js.undefined)
    
    @scala.inline
    def setMatchBoxesVarargs(value: MatchBox*): Self = this.set("matchBoxes", js.Array(value :_*))
    
    @scala.inline
    def setMatchBoxes(value: js.Array[MatchBox]): Self = this.set("matchBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBoxes: Self = this.set("matchBoxes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOcrRequestsVarargs(value: OcrRequest*): Self = this.set("ocrRequests", js.Array(value :_*))
    
    @scala.inline
    def setOcrRequests(value: js.Array[OcrRequest]): Self = this.set("ocrRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcrRequests: Self = this.set("ocrRequests", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPageCount(value: String): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    
    @scala.inline
    def setPageSizesVarargs(value: PageSize*): Self = this.set("pageSizes", js.Array(value :_*))
    
    @scala.inline
    def setPageSizes(value: js.Array[PageSize]): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSizes: Self = this.set("pageSizes", js.undefined)
    
    @scala.inline
    def setPages(value: String): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPdfFieldsData(value: String): Self = this.set("pdfFieldsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfFieldsData: Self = this.set("pdfFieldsData", js.undefined)
    
    @scala.inline
    def setPdfFormFieldOption(value: String): Self = this.set("pdfFormFieldOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfFormFieldOption: Self = this.set("pdfFormFieldOption", js.undefined)
    
    @scala.inline
    def setPdfWidgetsBase64(value: String): Self = this.set("pdfWidgetsBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfWidgetsBase64: Self = this.set("pdfWidgetsBase64", js.undefined)
    
    @scala.inline
    def setRemoteUrl(value: String): Self = this.set("remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteUrl: Self = this.set("remoteUrl", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledge(value: String): Self = this.set("signerMustAcknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustAcknowledge: Self = this.set("signerMustAcknowledge", js.undefined)
    
    @scala.inline
    def setSignerMustAcknowledgeUseAccountDefault(value: Boolean): Self = this.set("signerMustAcknowledgeUseAccountDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustAcknowledgeUseAccountDefault: Self = this.set("signerMustAcknowledgeUseAccountDefault", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = this.set("templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLocked: Self = this.set("templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = this.set("templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequired: Self = this.set("templateRequired", js.undefined)
    
    @scala.inline
    def setTransformPdfFields(value: String): Self = this.set("transformPdfFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformPdfFields: Self = this.set("transformPdfFields", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
