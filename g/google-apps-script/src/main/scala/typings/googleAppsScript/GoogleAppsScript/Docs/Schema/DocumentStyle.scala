package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentStyle extends js.Object {
  
  var background: js.UndefOr[Background] = js.native
  
  var defaultFooterId: js.UndefOr[String] = js.native
  
  var defaultHeaderId: js.UndefOr[String] = js.native
  
  var evenPageFooterId: js.UndefOr[String] = js.native
  
  var evenPageHeaderId: js.UndefOr[String] = js.native
  
  var firstPageFooterId: js.UndefOr[String] = js.native
  
  var firstPageHeaderId: js.UndefOr[String] = js.native
  
  var marginBottom: js.UndefOr[Dimension] = js.native
  
  var marginLeft: js.UndefOr[Dimension] = js.native
  
  var marginRight: js.UndefOr[Dimension] = js.native
  
  var marginTop: js.UndefOr[Dimension] = js.native
  
  var pageNumberStart: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Size] = js.native
  
  var useEvenPageHeaderFooter: js.UndefOr[Boolean] = js.native
  
  var useFirstPageHeaderFooter: js.UndefOr[Boolean] = js.native
}
object DocumentStyle {
  
  @scala.inline
  def apply(): DocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStyle]
  }
  
  @scala.inline
  implicit class DocumentStyleOps[Self <: DocumentStyle] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Background): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDefaultFooterId(value: String): Self = this.set("defaultFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFooterId: Self = this.set("defaultFooterId", js.undefined)
    
    @scala.inline
    def setDefaultHeaderId(value: String): Self = this.set("defaultHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeaderId: Self = this.set("defaultHeaderId", js.undefined)
    
    @scala.inline
    def setEvenPageFooterId(value: String): Self = this.set("evenPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageFooterId: Self = this.set("evenPageFooterId", js.undefined)
    
    @scala.inline
    def setEvenPageHeaderId(value: String): Self = this.set("evenPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenPageHeaderId: Self = this.set("evenPageHeaderId", js.undefined)
    
    @scala.inline
    def setFirstPageFooterId(value: String): Self = this.set("firstPageFooterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageFooterId: Self = this.set("firstPageFooterId", js.undefined)
    
    @scala.inline
    def setFirstPageHeaderId(value: String): Self = this.set("firstPageHeaderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPageHeaderId: Self = this.set("firstPageHeaderId", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Dimension): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Dimension): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Dimension): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Dimension): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setPageNumberStart(value: Double): Self = this.set("pageNumberStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumberStart: Self = this.set("pageNumberStart", js.undefined)
    
    @scala.inline
    def setPageSize(value: Size): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setUseEvenPageHeaderFooter(value: Boolean): Self = this.set("useEvenPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEvenPageHeaderFooter: Self = this.set("useEvenPageHeaderFooter", js.undefined)
    
    @scala.inline
    def setUseFirstPageHeaderFooter(value: Boolean): Self = this.set("useFirstPageHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFirstPageHeaderFooter: Self = this.set("useFirstPageHeaderFooter", js.undefined)
  }
}
