package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayApplianceDocumentPage extends js.Object {
  
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
  implicit class DisplayApplianceDocumentPageOps[Self <: DisplayApplianceDocumentPage] (val x: Self) extends AnyVal {
    
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
    def setDocPageCountTotal(value: Double): Self = this.set("docPageCountTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocPageCountTotal: Self = this.set("docPageCountTotal", js.undefined)
    
    @scala.inline
    def setDocumentId(value: /*Integer that identifies the document in the envelope.*/ String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("documentName", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setHeight72DPI(value: Double): Self = this.set("height72DPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight72DPI: Self = this.set("height72DPI", js.undefined)
    
    @scala.inline
    def setIsAttachmentType(value: Boolean): Self = this.set("isAttachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAttachmentType: Self = this.set("isAttachmentType", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageId(value: /*The unique id of the page.*/ String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageId: Self = this.set("pageId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth72DPI(value: Double): Self = this.set("width72DPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth72DPI: Self = this.set("width72DPI", js.undefined)
  }
}
