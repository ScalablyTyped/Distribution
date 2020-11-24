package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColorStatusBar extends js.Object {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var statusBar: js.UndefOr[`1`] = js.native
}
object BackgroundColorStatusBar {
  
  @scala.inline
  def apply(): BackgroundColorStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorStatusBar]
  }
  
  @scala.inline
  implicit class BackgroundColorStatusBarOps[Self <: BackgroundColorStatusBar] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setStatusBar(value: `1`): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
  }
}
