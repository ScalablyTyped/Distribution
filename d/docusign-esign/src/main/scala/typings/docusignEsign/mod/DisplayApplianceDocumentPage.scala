package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayApplianceDocumentPage extends StObject {
  
  var docPageCountTotal: js.UndefOr[Double] = js.undefined
  
  var documentId: js.UndefOr[/*Integer that identifies the document in the envelope.*/ String] = js.undefined
  
  var documentName: js.UndefOr[String] = js.undefined
  
  var `extension`: js.UndefOr[String] = js.undefined
  
  var height72DPI: js.UndefOr[Double] = js.undefined
  
  var isAttachmentType: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageId: js.UndefOr[/*The unique id of the page.*/ String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var width72DPI: js.UndefOr[Double] = js.undefined
}
object DisplayApplianceDocumentPage {
  
  inline def apply(): DisplayApplianceDocumentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceDocumentPage]
  }
  
  extension [Self <: DisplayApplianceDocumentPage](x: Self) {
    
    inline def setDocPageCountTotal(value: Double): Self = StObject.set(x, "docPageCountTotal", value.asInstanceOf[js.Any])
    
    inline def setDocPageCountTotalUndefined: Self = StObject.set(x, "docPageCountTotal", js.undefined)
    
    inline def setDocumentId(value: /*Integer that identifies the document in the envelope.*/ String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setHeight72DPI(value: Double): Self = StObject.set(x, "height72DPI", value.asInstanceOf[js.Any])
    
    inline def setHeight72DPIUndefined: Self = StObject.set(x, "height72DPI", js.undefined)
    
    inline def setIsAttachmentType(value: Boolean): Self = StObject.set(x, "isAttachmentType", value.asInstanceOf[js.Any])
    
    inline def setIsAttachmentTypeUndefined: Self = StObject.set(x, "isAttachmentType", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageId(value: /*The unique id of the page.*/ String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
    
    inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth72DPI(value: Double): Self = StObject.set(x, "width72DPI", value.asInstanceOf[js.Any])
    
    inline def setWidth72DPIUndefined: Self = StObject.set(x, "width72DPI", js.undefined)
  }
}
