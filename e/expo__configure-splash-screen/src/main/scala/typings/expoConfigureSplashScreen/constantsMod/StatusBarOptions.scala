package typings.expoConfigureSplashScreen.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarOptions extends js.Object {
  var statusBarHidden: Boolean = js.native
  var statusBarStyle: StatusBarStyle = js.native
}

object StatusBarOptions {
  @scala.inline
  def apply(statusBarHidden: Boolean, statusBarStyle: StatusBarStyle): StatusBarOptions = {
    val __obj = js.Dynamic.literal(statusBarHidden = statusBarHidden.asInstanceOf[js.Any], statusBarStyle = statusBarStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarOptions]
  }
  @scala.inline
  implicit class StatusBarOptionsOps[Self <: StatusBarOptions] (val x: Self) extends AnyVal {
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
    def setStatusBarHidden(value: Boolean): Self = this.set("statusBarHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusBarStyle(value: StatusBarStyle): Self = this.set("statusBarStyle", value.asInstanceOf[js.Any])
  }
  
}

