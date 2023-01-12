package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayAppliancePdf extends StObject {
  
  var attachmentInfo: js.UndefOr[DisplayApplianceSignerAttachment] = js.undefined
  
  var docName: js.UndefOr[String] = js.undefined
  
  var documentId: js.UndefOr[String] = js.undefined
  
  var latestPDFId: js.UndefOr[String] = js.undefined
  
  var latestPdf: js.UndefOr[String] = js.undefined
  
  var originalPDFId: js.UndefOr[String] = js.undefined
  
  var originalPdf: js.UndefOr[String] = js.undefined
  
  var pageCount: js.UndefOr[Double] = js.undefined
  
  var pdfType: js.UndefOr[String] = js.undefined
}
object DisplayAppliancePdf {
  
  inline def apply(): DisplayAppliancePdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayAppliancePdf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayAppliancePdf] (val x: Self) extends AnyVal {
    
    inline def setAttachmentInfo(value: DisplayApplianceSignerAttachment): Self = StObject.set(x, "attachmentInfo", value.asInstanceOf[js.Any])
    
    inline def setAttachmentInfoUndefined: Self = StObject.set(x, "attachmentInfo", js.undefined)
    
    inline def setDocName(value: String): Self = StObject.set(x, "docName", value.asInstanceOf[js.Any])
    
    inline def setDocNameUndefined: Self = StObject.set(x, "docName", js.undefined)
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setLatestPDFId(value: String): Self = StObject.set(x, "latestPDFId", value.asInstanceOf[js.Any])
    
    inline def setLatestPDFIdUndefined: Self = StObject.set(x, "latestPDFId", js.undefined)
    
    inline def setLatestPdf(value: String): Self = StObject.set(x, "latestPdf", value.asInstanceOf[js.Any])
    
    inline def setLatestPdfUndefined: Self = StObject.set(x, "latestPdf", js.undefined)
    
    inline def setOriginalPDFId(value: String): Self = StObject.set(x, "originalPDFId", value.asInstanceOf[js.Any])
    
    inline def setOriginalPDFIdUndefined: Self = StObject.set(x, "originalPDFId", js.undefined)
    
    inline def setOriginalPdf(value: String): Self = StObject.set(x, "originalPdf", value.asInstanceOf[js.Any])
    
    inline def setOriginalPdfUndefined: Self = StObject.set(x, "originalPdf", js.undefined)
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPdfType(value: String): Self = StObject.set(x, "pdfType", value.asInstanceOf[js.Any])
    
    inline def setPdfTypeUndefined: Self = StObject.set(x, "pdfType", js.undefined)
  }
}
