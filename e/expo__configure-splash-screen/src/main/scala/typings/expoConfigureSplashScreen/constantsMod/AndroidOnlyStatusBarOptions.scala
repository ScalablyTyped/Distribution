package typings.expoConfigureSplashScreen.constantsMod

import typings.colorString.mod.ColorDescriptor
import typings.expoConfigureSplashScreen.expoConfigureSplashScreenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidOnlyStatusBarOptions extends js.Object {
  var darkModeStatusBarBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  var darkModeStatusBarStyle: js.UndefOr[StatusBarStyle] = js.native
  var statusBarBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  var statusBarTranslucent: js.UndefOr[`true`] = js.native
}

object AndroidOnlyStatusBarOptions {
  @scala.inline
  def apply(): AndroidOnlyStatusBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidOnlyStatusBarOptions]
  }
  @scala.inline
  implicit class AndroidOnlyStatusBarOptionsOps[Self <: AndroidOnlyStatusBarOptions] (val x: Self) extends AnyVal {
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
    def setDarkModeStatusBarBackgroundColor(value: ColorDescriptor): Self = this.set("darkModeStatusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeStatusBarBackgroundColor: Self = this.set("darkModeStatusBarBackgroundColor", js.undefined)
    @scala.inline
    def setDarkModeStatusBarStyle(value: StatusBarStyle): Self = this.set("darkModeStatusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeStatusBarStyle: Self = this.set("darkModeStatusBarStyle", js.undefined)
    @scala.inline
    def setStatusBarBackgroundColor(value: ColorDescriptor): Self = this.set("statusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarBackgroundColor: Self = this.set("statusBarBackgroundColor", js.undefined)
    @scala.inline
    def setStatusBarTranslucent(value: `true`): Self = this.set("statusBarTranslucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarTranslucent: Self = this.set("statusBarTranslucent", js.undefined)
  }
  
}

