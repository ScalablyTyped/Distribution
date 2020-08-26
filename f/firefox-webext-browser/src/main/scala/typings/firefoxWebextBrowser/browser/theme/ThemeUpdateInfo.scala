package typings.firefoxWebextBrowser.browser.theme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* theme types */
/** Info provided in the onUpdated listener. */
@js.native
trait ThemeUpdateInfo extends js.Object {
  /** The new theme after update */
  var theme: js.Object = js.native
  /** The id of the window the theme has been applied to */
  var windowId: js.UndefOr[Double] = js.native
}

object ThemeUpdateInfo {
  @scala.inline
  def apply(theme: js.Object): ThemeUpdateInfo = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUpdateInfo]
  }
  @scala.inline
  implicit class ThemeUpdateInfoOps[Self <: ThemeUpdateInfo] (val x: Self) extends AnyVal {
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
    def setTheme(value: js.Object): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

