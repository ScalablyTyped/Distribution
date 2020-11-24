package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopbarOptions extends js.Object {
  
  var back_text: js.UndefOr[String] = js.native
  
  var custom_back_text: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var is_hover: js.UndefOr[Boolean] = js.native
  
  var mobile_show_parent_link: js.UndefOr[Boolean] = js.native
  
  var scrolltop: js.UndefOr[Boolean] = js.native
  
  var sticky_class: js.UndefOr[String] = js.native
  
  var sticky_on: js.UndefOr[String] = js.native
}
object TopbarOptions {
  
  @scala.inline
  def apply(): TopbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopbarOptions]
  }
  
  @scala.inline
  implicit class TopbarOptionsOps[Self <: TopbarOptions] (val x: Self) extends AnyVal {
    
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
    def setBack_text(value: String): Self = this.set("back_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBack_text: Self = this.set("back_text", js.undefined)
    
    @scala.inline
    def setCustom_back_text(value: Boolean): Self = this.set("custom_back_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_back_text: Self = this.set("custom_back_text", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIs_hover(value: Boolean): Self = this.set("is_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_hover: Self = this.set("is_hover", js.undefined)
    
    @scala.inline
    def setMobile_show_parent_link(value: Boolean): Self = this.set("mobile_show_parent_link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile_show_parent_link: Self = this.set("mobile_show_parent_link", js.undefined)
    
    @scala.inline
    def setScrolltop(value: Boolean): Self = this.set("scrolltop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolltop: Self = this.set("scrolltop", js.undefined)
    
    @scala.inline
    def setSticky_class(value: String): Self = this.set("sticky_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky_class: Self = this.set("sticky_class", js.undefined)
    
    @scala.inline
    def setSticky_on(value: String): Self = this.set("sticky_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky_on: Self = this.set("sticky_on", js.undefined)
  }
}
