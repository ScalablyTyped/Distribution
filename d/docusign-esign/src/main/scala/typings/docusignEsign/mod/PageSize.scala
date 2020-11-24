package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSize extends js.Object {
  
  var pageHeight: js.UndefOr[String] = js.native
  
  var pageWidth: js.UndefOr[String] = js.native
}
object PageSize {
  
  @scala.inline
  def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  @scala.inline
  implicit class PageSizeOps[Self <: PageSize] (val x: Self) extends AnyVal {
    
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
    def setPageHeight(value: String): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    
    @scala.inline
    def setPageWidth(value: String): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageWidth: Self = this.set("pageWidth", js.undefined)
  }
}
