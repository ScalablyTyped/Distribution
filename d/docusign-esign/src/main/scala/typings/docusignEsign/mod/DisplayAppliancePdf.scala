package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayAppliancePdf extends js.Object {
  
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
  implicit class DisplayAppliancePdfOps[Self <: DisplayAppliancePdf] (val x: Self) extends AnyVal {
    
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
    def setAttachmentInfo(value: DisplayApplianceSignerAttachment): Self = this.set("attachmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentInfo: Self = this.set("attachmentInfo", js.undefined)
    
    @scala.inline
    def setDocName(value: String): Self = this.set("docName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocName: Self = this.set("docName", js.undefined)
    
    @scala.inline
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setLatestPDFId(value: String): Self = this.set("latestPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestPDFId: Self = this.set("latestPDFId", js.undefined)
    
    @scala.inline
    def setLatestPdf(value: String): Self = this.set("latestPdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestPdf: Self = this.set("latestPdf", js.undefined)
    
    @scala.inline
    def setOriginalPDFId(value: String): Self = this.set("originalPDFId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPDFId: Self = this.set("originalPDFId", js.undefined)
    
    @scala.inline
    def setOriginalPdf(value: String): Self = this.set("originalPdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPdf: Self = this.set("originalPdf", js.undefined)
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    
    @scala.inline
    def setPdfType(value: String): Self = this.set("pdfType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfType: Self = this.set("pdfType", js.undefined)
  }
}
