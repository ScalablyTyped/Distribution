package typings.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeMode extends js.Object {
  var resizeMode: typings.expoConfigureSplashScreen.constantsMod.ResizeMode = js.native
  var splashScreenImagePresent: Boolean = js.native
}

object ResizeMode {
  @scala.inline
  def apply(
    resizeMode: typings.expoConfigureSplashScreen.constantsMod.ResizeMode,
    splashScreenImagePresent: Boolean
  ): ResizeMode = {
    val __obj = js.Dynamic.literal(resizeMode = resizeMode.asInstanceOf[js.Any], splashScreenImagePresent = splashScreenImagePresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeMode]
  }
  @scala.inline
  implicit class ResizeModeOps[Self <: ResizeMode] (val x: Self) extends AnyVal {
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
    def setResizeMode(value: typings.expoConfigureSplashScreen.constantsMod.ResizeMode): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreenImagePresent(value: Boolean): Self = this.set("splashScreenImagePresent", value.asInstanceOf[js.Any])
  }
  
}

