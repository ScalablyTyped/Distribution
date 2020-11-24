package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxButtonTemplateOptions extends js.Object {
  
  var arrowLeft: js.UndefOr[String] = js.native
  
  var arrowRight: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[String] = js.native
  
  var download: js.UndefOr[String] = js.native
  
  /**
    * This small close button will be appended to your html/inline/ajax content by default,
    * if "smallBtn" option is not set to false
    */
  var smallBtn: js.UndefOr[String] = js.native
  
  var zoom: js.UndefOr[String] = js.native
}
object FancyBoxButtonTemplateOptions {
  
  @scala.inline
  def apply(): FancyBoxButtonTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxButtonTemplateOptions]
  }
  
  @scala.inline
  implicit class FancyBoxButtonTemplateOptionsOps[Self <: FancyBoxButtonTemplateOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowLeft(value: String): Self = this.set("arrowLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowLeft: Self = this.set("arrowLeft", js.undefined)
    
    @scala.inline
    def setArrowRight(value: String): Self = this.set("arrowRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowRight: Self = this.set("arrowRight", js.undefined)
    
    @scala.inline
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setSmallBtn(value: String): Self = this.set("smallBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallBtn: Self = this.set("smallBtn", js.undefined)
    
    @scala.inline
    def setZoom(value: String): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
