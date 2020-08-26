package typings.expoConfigureSplashScreen.anon

import typings.colorString.mod.ColorDescriptor
import typings.expoConfigureSplashScreen.constantsMod.StatusBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @expo/configure-splash-screen.@expo/configure-splash-screen/build/constants.Arguments & std.Partial<@expo/configure-splash-screen.@expo/configure-splash-screen/build/constants.StatusBarOptions> & {  resizeMode :@expo/configure-splash-screen.@expo/configure-splash-screen/build/constants.ResizeMode} */
@js.native
trait ArgumentsPartialStatusBarBackgroundColor extends js.Object {
  var backgroundColor: ColorDescriptor = js.native
  var darkModeBackgroundColor: js.UndefOr[ColorDescriptor] = js.native
  /**
    * Absolute path
    */
  var darkModeImagePath: js.UndefOr[String] = js.native
  /**
    * Absolute path
    */
  var imagePath: js.UndefOr[String] = js.native
  var resizeMode: typings.expoConfigureSplashScreen.constantsMod.ResizeMode = js.native
  var statusBarHidden: js.UndefOr[Boolean] = js.native
  var statusBarStyle: js.UndefOr[StatusBarStyle] = js.native
}

object ArgumentsPartialStatusBarBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: ColorDescriptor,
    resizeMode: typings.expoConfigureSplashScreen.constantsMod.ResizeMode
  ): ArgumentsPartialStatusBarBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentsPartialStatusBarBackgroundColor]
  }
  @scala.inline
  implicit class ArgumentsPartialStatusBarBackgroundColorOps[Self <: ArgumentsPartialStatusBarBackgroundColor] (val x: Self) extends AnyVal {
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
    def setResizeMode(value: typings.expoConfigureSplashScreen.constantsMod.ResizeMode): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkModeBackgroundColor(value: ColorDescriptor): Self = this.set("darkModeBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeBackgroundColor: Self = this.set("darkModeBackgroundColor", js.undefined)
    @scala.inline
    def setDarkModeImagePath(value: String): Self = this.set("darkModeImagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeImagePath: Self = this.set("darkModeImagePath", js.undefined)
    @scala.inline
    def setImagePath(value: String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
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

