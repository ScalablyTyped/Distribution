package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends js.Object {
  
  var additional_inheritable_classes: js.UndefOr[js.Array[String]] = js.native
  
  var append_to: js.UndefOr[String] = js.native
  
  var disable_for_touch: js.UndefOr[Boolean] = js.native
  
  var hover_delay: js.UndefOr[Double] = js.native
  
  var show_on: js.UndefOr[String] = js.native
  
  var tip_template: js.UndefOr[js.Function2[/* selector */ String, /* content */ String, String]] = js.native
  
  var tooltip_class: js.UndefOr[String] = js.native
  
  var touch_close_text: js.UndefOr[String] = js.native
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
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
    def setAdditional_inheritable_classesVarargs(value: String*): Self = this.set("additional_inheritable_classes", js.Array(value :_*))
    
    @scala.inline
    def setAdditional_inheritable_classes(value: js.Array[String]): Self = this.set("additional_inheritable_classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_inheritable_classes: Self = this.set("additional_inheritable_classes", js.undefined)
    
    @scala.inline
    def setAppend_to(value: String): Self = this.set("append_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend_to: Self = this.set("append_to", js.undefined)
    
    @scala.inline
    def setDisable_for_touch(value: Boolean): Self = this.set("disable_for_touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_for_touch: Self = this.set("disable_for_touch", js.undefined)
    
    @scala.inline
    def setHover_delay(value: Double): Self = this.set("hover_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover_delay: Self = this.set("hover_delay", js.undefined)
    
    @scala.inline
    def setShow_on(value: String): Self = this.set("show_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_on: Self = this.set("show_on", js.undefined)
    
    @scala.inline
    def setTip_template(value: (/* selector */ String, /* content */ String) => String): Self = this.set("tip_template", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTip_template: Self = this.set("tip_template", js.undefined)
    
    @scala.inline
    def setTooltip_class(value: String): Self = this.set("tooltip_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip_class: Self = this.set("tooltip_class", js.undefined)
    
    @scala.inline
    def setTouch_close_text(value: String): Self = this.set("touch_close_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch_close_text: Self = this.set("touch_close_text", js.undefined)
  }
}
