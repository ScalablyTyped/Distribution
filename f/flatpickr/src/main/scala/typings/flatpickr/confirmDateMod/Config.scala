package typings.flatpickr.confirmDateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var confirmIcon: js.UndefOr[String] = js.native
  var confirmText: js.UndefOr[String] = js.native
  var showAlways: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setConfirmIcon(value: String): Self = this.set("confirmIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmIcon: Self = this.set("confirmIcon", js.undefined)
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    @scala.inline
    def setShowAlways(value: Boolean): Self = this.set("showAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAlways: Self = this.set("showAlways", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

