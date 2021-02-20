package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayAppliancePdf extends StObject {
  
  var attachmentInfo: js.UndefOr[DisplayApplianceSignerAttachment] = js.native
  
  var docName: js.UndefOr[String] = js.native
  
  var documentId: js.UndefOr[String] = js.native
  
  var latestPDFId: js.UndefOr[String] = js.native
  
  var latestPdf: js.UndefOr[String] = js.native
  
  var originalPDFId: js.UndefOr[String] = js.native
  
  var originalPdf: js.UndefOr[String] = js.native
  
  var pageCount: js.UndefOr[Double] = js.native
  
  var pdfType: js.UndefOr[String] = js.native
}
object DisplayAppliancePdf {
  
  @scala.inline
  def apply(): DisplayAppliancePdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayAppliancePdf]
  }
  
  @scala.inline
  implicit class DisplayAppliancePdfMutableBuilder[Self <: DisplayAppliancePdf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentInfo(value: DisplayApplianceSignerAttachment): Self = StObject.set(x, "attachmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentInfoUndefined: Self = StObject.set(x, "attachmentInfo", js.undefined)
    
    @scala.inline
    def setDocName(value: String): Self = StObject.set(x, "docName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocNameUndefined: Self = StObject.set(x, "docName", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setLatestPDFId(value: String): Self = StObject.set(x, "latestPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestPDFIdUndefined: Self = StObject.set(x, "latestPDFId", js.undefined)
    
    @scala.inline
    def setLatestPdf(value: String): Self = StObject.set(x, "latestPdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestPdfUndefined: Self = StObject.set(x, "latestPdf", js.undefined)
    
    @scala.inline
    def setOriginalPDFId(value: String): Self = StObject.set(x, "originalPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPDFIdUndefined: Self = StObject.set(x, "originalPDFId", js.undefined)
    
    @scala.inline
    def setOriginalPdf(value: String): Self = StObject.set(x, "originalPdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPdfUndefined: Self = StObject.set(x, "originalPdf", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    @scala.inline
    def setPdfType(value: String): Self = StObject.set(x, "pdfType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfTypeUndefined: Self = StObject.set(x, "pdfType", js.undefined)
  }
}
