package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHtmlDefinition extends StObject {
  
  /**
    * Contains text that all display anchors must start with. Using at least 4 characters will improve anchor processing performance.
    */
  var displayAnchorPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * An object that defines how to handle a section of the HTML in signing. This property enables an incoming request to make a
    * section of the HTML collapsible and expandable or hidden from view. A start anchor, end anchor, or both are required.
    * If the anchors are not found, the display anchor will be ignored. For a list of the available types, see the `display` enum.
    */
  var displayAnchors: js.UndefOr[js.Array[DocumentHtmlDisplayAnchor]] = js.undefined
  
  /**
    * The position on the page where the display section appears.
    */
  var displayOrder: js.UndefOr[String] = js.undefined
  
  /**
    * The number of the page on which the display section appears.
    */
  var displayPageNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID of the document.
    */
  var documentGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId`
    * property that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * Header text or an HTML tag to place above the responsive HTML block.
    */
  var headerLabel: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the responsive HTML version of the signing document will only display on screens with the specified pixel width or less.
    * If the screen is larger than the value that you specify, the default PDF version of the content displays instead.
    */
  var maxScreenWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Holds a comma-separated list of HTML tags to remove if they have no text within their node (including child nodes).
    */
  var removeEmptyTags: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the **Mobile-Friendly** toggle displays at the top of the screen on the user's mobile device.
    * This toggle enables the user to switch between the mobile-friendly and PDF versions of a document. For example, the recipient can use this toggle to
    * review the document using the PDF view before they finish signing.
    */
  var showMobileOptimizedToggle: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of responsive signing that will be used with the document. Valid strings are:
    *
    * - `document`: The HTML signing page will be generated from the provided document. For details, see
    * [Converting a PDF to a signable HTML document](https://developers.docusign.com/esign-rest-api/guides/responsive-signing/converting-pdf).
    * - `html`: The HTML signing page will be passed directly. For details, see [Converting a PDF to a signable HTML
    * document](https://developers.docusign.com/esign-rest-api/guides/responsive-signing/converting-pdf).
    */
  var source: js.UndefOr[String] = js.undefined
}
object DocumentHtmlDefinition {
  
  inline def apply(): DocumentHtmlDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDefinition]
  }
  
  extension [Self <: DocumentHtmlDefinition](x: Self) {
    
    inline def setDisplayAnchorPrefix(value: String): Self = StObject.set(x, "displayAnchorPrefix", value.asInstanceOf[js.Any])
    
    inline def setDisplayAnchorPrefixUndefined: Self = StObject.set(x, "displayAnchorPrefix", js.undefined)
    
    inline def setDisplayAnchors(value: js.Array[DocumentHtmlDisplayAnchor]): Self = StObject.set(x, "displayAnchors", value.asInstanceOf[js.Any])
    
    inline def setDisplayAnchorsUndefined: Self = StObject.set(x, "displayAnchors", js.undefined)
    
    inline def setDisplayAnchorsVarargs(value: DocumentHtmlDisplayAnchor*): Self = StObject.set(x, "displayAnchors", js.Array(value :_*))
    
    inline def setDisplayOrder(value: String): Self = StObject.set(x, "displayOrder", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrderUndefined: Self = StObject.set(x, "displayOrder", js.undefined)
    
    inline def setDisplayPageNumber(value: String): Self = StObject.set(x, "displayPageNumber", value.asInstanceOf[js.Any])
    
    inline def setDisplayPageNumberUndefined: Self = StObject.set(x, "displayPageNumber", js.undefined)
    
    inline def setDocumentGuid(value: String): Self = StObject.set(x, "documentGuid", value.asInstanceOf[js.Any])
    
    inline def setDocumentGuidUndefined: Self = StObject.set(x, "documentGuid", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setHeaderLabel(value: String): Self = StObject.set(x, "headerLabel", value.asInstanceOf[js.Any])
    
    inline def setHeaderLabelUndefined: Self = StObject.set(x, "headerLabel", js.undefined)
    
    inline def setMaxScreenWidth(value: String): Self = StObject.set(x, "maxScreenWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxScreenWidthUndefined: Self = StObject.set(x, "maxScreenWidth", js.undefined)
    
    inline def setRemoveEmptyTags(value: String): Self = StObject.set(x, "removeEmptyTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyTagsUndefined: Self = StObject.set(x, "removeEmptyTags", js.undefined)
    
    inline def setShowMobileOptimizedToggle(value: String): Self = StObject.set(x, "showMobileOptimizedToggle", value.asInstanceOf[js.Any])
    
    inline def setShowMobileOptimizedToggleUndefined: Self = StObject.set(x, "showMobileOptimizedToggle", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
