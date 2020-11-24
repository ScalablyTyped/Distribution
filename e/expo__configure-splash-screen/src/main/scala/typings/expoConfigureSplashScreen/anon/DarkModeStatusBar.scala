package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DarkModeStatusBar extends js.Object {
  
  var darkMode: js.UndefOr[`5`] = js.native
  
  var statusBar: js.UndefOr[BackgroundColorHidden] = js.native
}
object DarkModeStatusBar {
  
  @scala.inline
  def apply(): DarkModeStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeStatusBar]
  }
  
  @scala.inline
  implicit class DarkModeStatusBarOps[Self <: DarkModeStatusBar] (val x: Self) extends AnyVal {
    
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
    def setDarkMode(value: `5`): Self = this.set("darkMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkMode: Self = this.set("darkMode", js.undefined)
    
    @scala.inline
    def setStatusBar(value: BackgroundColorHidden): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
  }
}
