package typings.expoConfigureSplashScreen.anon

import typings.expoConfigureSplashScreen.constantsMod.StatusBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddStatusBarBackgroundColor extends js.Object {
  var addStatusBarBackgroundColor: js.UndefOr[Boolean] = js.native
  var darkModeStatusBarStyle: js.UndefOr[StatusBarStyle] = js.native
  var statusBarHidden: js.UndefOr[Boolean] = js.native
  var statusBarStyle: js.UndefOr[StatusBarStyle] = js.native
}

object AddStatusBarBackgroundColor {
  @scala.inline
  def apply(): AddStatusBarBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddStatusBarBackgroundColor]
  }
  @scala.inline
  implicit class AddStatusBarBackgroundColorOps[Self <: AddStatusBarBackgroundColor] (val x: Self) extends AnyVal {
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
    def setAddStatusBarBackgroundColor(value: Boolean): Self = this.set("addStatusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddStatusBarBackgroundColor: Self = this.set("addStatusBarBackgroundColor", js.undefined)
    @scala.inline
    def setDarkModeStatusBarStyle(value: StatusBarStyle): Self = this.set("darkModeStatusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeStatusBarStyle: Self = this.set("darkModeStatusBarStyle", js.undefined)
    @scala.inline
    def setStatusBarHidden(value: Boolean): Self = this.set("statusBarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarHidden: Self = this.set("statusBarHidden", js.undefined)
    @scala.inline
    def setStatusBarStyle(value: StatusBarStyle): Self = this.set("statusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarStyle: Self = this.set("statusBarStyle", js.undefined)
  }
  
}

