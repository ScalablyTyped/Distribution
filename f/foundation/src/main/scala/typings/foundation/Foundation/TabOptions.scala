package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/tabs.html
@js.native
trait TabOptions extends js.Object {
  
  var active_class: js.UndefOr[String] = js.native
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var deep_linking: js.UndefOr[Boolean] = js.native
  
  var is_hover: js.UndefOr[Boolean] = js.native
  
  var scroll_to_content: js.UndefOr[Boolean] = js.native
}
object TabOptions {
  
  @scala.inline
  def apply(): TabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabOptions]
  }
  
  @scala.inline
  implicit class TabOptionsOps[Self <: TabOptions] (val x: Self) extends AnyVal {
    
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
    def setActive_class(value: String): Self = this.set("active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive_class: Self = this.set("active_class", js.undefined)
    
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDeep_linking(value: Boolean): Self = this.set("deep_linking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep_linking: Self = this.set("deep_linking", js.undefined)
    
    @scala.inline
    def setIs_hover(value: Boolean): Self = this.set("is_hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_hover: Self = this.set("is_hover", js.undefined)
    
    @scala.inline
    def setScroll_to_content(value: Boolean): Self = this.set("scroll_to_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll_to_content: Self = this.set("scroll_to_content", js.undefined)
  }
}
