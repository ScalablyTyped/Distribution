package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomButton extends js.Object {
  
  var bootstrapFontAwesome: js.UndefOr[js.Any] = js.native
  
  var click: js.UndefOr[js.Function0[_]] = js.native
  
  var icon: js.UndefOr[js.Any] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object CustomButton {
  
  @scala.inline
  def apply(): CustomButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomButton]
  }
  
  @scala.inline
  implicit class CustomButtonOps[Self <: CustomButton] (val x: Self) extends AnyVal {
    
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
    def setBootstrapFontAwesome(value: js.Any): Self = this.set("bootstrapFontAwesome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapFontAwesome: Self = this.set("bootstrapFontAwesome", js.undefined)
    
    @scala.inline
    def setClick(value: () => _): Self = this.set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
