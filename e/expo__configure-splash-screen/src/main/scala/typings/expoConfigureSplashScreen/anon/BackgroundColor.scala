package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.ColorDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: ColorDescriptor = js.native
  var darkModeBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  var darkModeStatusBarBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  var statusBarBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(backgroundColor: ColorDescriptor): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: ColorDescriptor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkModeBackgroundColor(value: ColorDescriptor): Self = this.set("darkModeBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeBackgroundColor: Self = this.set("darkModeBackgroundColor", js.undefined)
    @scala.inline
    def setDarkModeStatusBarBackgroundColor(value: ColorDescriptor): Self = this.set("darkModeStatusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeStatusBarBackgroundColor: Self = this.set("darkModeStatusBarBackgroundColor", js.undefined)
    @scala.inline
    def setStatusBarBackgroundColor(value: ColorDescriptor): Self = this.set("statusBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarBackgroundColor: Self = this.set("statusBarBackgroundColor", js.undefined)
  }
  
}

