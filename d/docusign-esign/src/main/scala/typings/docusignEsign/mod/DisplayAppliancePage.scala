package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayAppliancePage extends js.Object {
  
  var documentId: js.UndefOr[String] = js.native
  
  var documentName: js.UndefOr[String] = js.native
  
  var externalDocumentId: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var isFirstPage: js.UndefOr[Boolean] = js.native
  
  var pageId: js.UndefOr[String] = js.native
  
  var pageNo: js.UndefOr[Double] = js.native
  
  var pageStatus: js.UndefOr[String] = js.native
  
  var pageType: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DisplayAppliancePage {
  
  @scala.inline
  def apply(): DisplayAppliancePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayAppliancePage]
  }
  
  @scala.inline
  implicit class DisplayAppliancePageOps[Self <: DisplayAppliancePage] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: String): Self = this.set("documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("documentId", js.undefined)
    
    @scala.inline
    def setDocumentName(value: String): Self = this.set("documentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("documentName", js.undefined)
    
    @scala.inline
    def setExternalDocumentId(value: String): Self = this.set("externalDocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocumentId: Self = this.set("externalDocumentId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsFirstPage(value: Boolean): Self = this.set("isFirstPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFirstPage: Self = this.set("isFirstPage", js.undefined)
    
    @scala.inline
    def setPageId(value: String): Self = this.set("pageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageId: Self = this.set("pageId", js.undefined)
    
    @scala.inline
    def setPageNo(value: Double): Self = this.set("pageNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNo: Self = this.set("pageNo", js.undefined)
    
    @scala.inline
    def setPageStatus(value: String): Self = this.set("pageStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageStatus: Self = this.set("pageStatus", js.undefined)
    
    @scala.inline
    def setPageType(value: String): Self = this.set("pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageType: Self = this.set("pageType", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
