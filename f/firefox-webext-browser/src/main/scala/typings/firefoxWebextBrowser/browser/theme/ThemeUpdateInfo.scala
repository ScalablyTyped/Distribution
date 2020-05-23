package typings.firefoxWebextBrowser.browser.theme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* theme types */
/** Info provided in the onUpdated listener. */
trait ThemeUpdateInfo extends js.Object {
  /** The new theme after update */
  var theme: js.Object
  /** The id of the window the theme has been applied to */
  var windowId: js.UndefOr[Double] = js.undefined
}

object ThemeUpdateInfo {
  @scala.inline
  def apply(theme: js.Object, windowId: js.UndefOr[Double] = js.undefined): ThemeUpdateInfo = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUpdateInfo]
  }
}

