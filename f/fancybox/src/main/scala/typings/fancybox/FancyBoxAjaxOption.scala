package typings.fancybox

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxAjaxOption extends js.Object {
  
  /**
    * Object containing settings for ajax request
    */
  var settings: JQueryAjaxSettings = js.native
}
object FancyBoxAjaxOption {
  
  @scala.inline
  def apply(settings: JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
  
  @scala.inline
  implicit class FancyBoxAjaxOptionOps[Self <: FancyBoxAjaxOption] (val x: Self) extends AnyVal {
    
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
    def setSettings(value: JQueryAjaxSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
