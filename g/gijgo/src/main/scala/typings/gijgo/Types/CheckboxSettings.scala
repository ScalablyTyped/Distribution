package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Checkbox
@js.native
trait CheckboxSettings extends js.Object {
  
  //Events
  var change: js.UndefOr[js.Function2[/* e */ js.Any, /* state */ String, _]] = js.native
  
  var iconsLibrary: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
}
object CheckboxSettings {
  
  @scala.inline
  def apply(): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxSettings]
  }
  
  @scala.inline
  implicit class CheckboxSettingsOps[Self <: CheckboxSettings] (val x: Self) extends AnyVal {
    
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
    def setChange(value: (/* e */ js.Any, /* state */ String) => _): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
  }
}
