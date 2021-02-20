package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceDocumentPage extends StObject {
  
  var docPageCountTotal: js.UndefOr[Double] = js.native
  
  var documentId: js.UndefOr[/*Integer that identifies the document in the envelope.*/ String] = js.native
  
  var documentName: js.UndefOr[String] = js.native
  
  var extension: js.UndefOr[String] = js.native
  
  var height72DPI: js.UndefOr[Double] = js.native
  
  var isAttachmentType: js.UndefOr[Boolean] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pageId: js.UndefOr[/*The unique id of the page.*/ String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var width72DPI: js.UndefOr[Double] = js.native
}
object DisplayApplianceDocumentPage {
  
  @scala.inline
  def apply(): DisplayApplianceDocumentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceDocumentPage]
  }
  
  @scala.inline
  implicit class DisplayApplianceDocumentPageMutableBuilder[Self <: DisplayApplianceDocumentPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocPageCountTotal(value: Double): Self = StObject.set(x, "docPageCountTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocPageCountTotalUndefined: Self = StObject.set(x, "docPageCountTotal", js.undefined)
    
    @scala.inline
    def setDocumentId(value: /*Integer that identifies the document in the envelope.*/ String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setHeight72DPI(value: Double): Self = StObject.set(x, "height72DPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight72DPIUndefined: Self = StObject.set(x, "height72DPI", js.undefined)
    
    @scala.inline
    def setIsAttachmentType(value: Boolean): Self = StObject.set(x, "isAttachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachmentTypeUndefined: Self = StObject.set(x, "isAttachmentType", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageId(value: /*The unique id of the page.*/ String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth72DPI(value: Double): Self = StObject.set(x, "width72DPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth72DPIUndefined: Self = StObject.set(x, "width72DPI", js.undefined)
  }
}
