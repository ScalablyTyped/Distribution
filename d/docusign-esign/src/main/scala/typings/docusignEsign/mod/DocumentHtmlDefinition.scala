package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHtmlDefinition extends js.Object {
  
  /**
    * Contains text that all display anchors must start with. Using at least 4 characters will improve anchor processing performance.
    */
  var displayAnchorPrefix: js.UndefOr[String] = js.native
  
  /**
    * An object that defines how to handle a section of the HTML in signing. This property enables an incoming request to make a
    * section of the HTML collapsible and expandable or hidden from view. A start anchor, end anchor, or both are required.
    * If the anchors are not found, the display anchor will be ignored. For a list of the available types, see the `display` enum.
    */
  var displayAnchors: js.UndefOr[js.Array[DocumentHtmlDisplayAnchor]] = js.native
  
  /**
    * The position on the page where the display section appears.
    */
  var displayOrder: js.UndefOr[String] = js.native
  
  /**
    * The number of the page on which the display section appears.
    */
  var displayPageNumber: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the document.
    */
  var documentGuid: js.UndefOr[String] = js.native
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.native
  
  /**
    * Header text or an HTML tag to place above the responsive HTML block.
    */
  var headerLabel: js.UndefOr[String] = js.native
  
  /**
    * If set, the responsive HTML version of the signing document will only display on screens with the specified pixel width or less.
    * If the screen is larger than the value that you specify, the default PDF version of the content displays instead.
    */
  var maxScreenWidth: js.UndefOr[String] = js.native
  
  /**
    * Holds a comma-separated list of HTML tags to remove if they have no text within their node (including child nodes).
    */
  var removeEmptyTags: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the **Mobile-Friendly** toggle displays at the top of the screen on the user's mobile device.
    * This toggle enables the user to switch between the mobile-friendly and PDF versions of a document. For example, the recipient can use this toggle to
    * review the document using the PDF view before they finish signing.
    */
  var showMobileOptimizedToggle: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of responsive signing that will be used with the document. Valid strings are:
    *
    * - `document`: The HTML signing page will be generated from the provided document. For details, see
    * [Converting a PDF to a signable HTML document](https://developers.docusign.com/esign-rest-api/guides/responsive-signing/converting-pdf).
    * - `html`: The HTML signing page will be passed directly. For details, see [Converting a PDF to a signable HTML
    * document](https://developers.docusign.com/esign-rest-api/guides/responsive-signing/converting-pdf).
    */
  var source: js.UndefOr[String] = js.native
}
object DocumentHtmlDefinition {
  
  @scala.inline
  def apply(): DocumentHtmlDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDefinition]
  }
  
  @scala.inline
  implicit class DocumentHtmlDefinitionOps[Self <: DocumentHtmlDefinition] (val x: Self) extends AnyVal {
    
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
    def setDisplayAnchorPrefix(value: String): Self = this.set("displayAnchorPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAnchorPrefix: Self = this.set("displayAnchorPrefix", js.undefined)
    
    @scala.inline
    def setDisplayAnchorsVarargs(value: DocumentHtmlDisplayAnchor*): Self = this.set("displayAnchors", js.Array(value :_*))
    
    @scala.inline
    def setDisplayAnchors(value: js.Array[DocumentHtmlDisplayAnchor]): Self = this.set("displayAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAnchors: Self = this.set("displayAnchors", js.undefined)
    
    @scala.inline
    def setDisplayOrder(value: String): Self = this.set("displayOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOrder: Self = this.set("displayOrder", js.undefined)
    
    @scala.inline
    def setDisplayPageNumber(value: String): Self = this.set("displayPageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPageNumber: Self = this.set("displayPageNumber", js.undefined)
    
    @scala.inline
    def setDocumentGuid(value: String): Self = this.set("documentGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentGuid: Self = this.set("documentGuid", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setHeaderLabel(value: String): Self = this.set("headerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLabel: Self = this.set("headerLabel", js.undefined)
    
    @scala.inline
    def setMaxScreenWidth(value: String): Self = this.set("maxScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScreenWidth: Self = this.set("maxScreenWidth", js.undefined)
    
    @scala.inline
    def setRemoveEmptyTags(value: String): Self = this.set("removeEmptyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEmptyTags: Self = this.set("removeEmptyTags", js.undefined)
    
    @scala.inline
    def setShowMobileOptimizedToggle(value: String): Self = this.set("showMobileOptimizedToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMobileOptimizedToggle: Self = this.set("showMobileOptimizedToggle", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
