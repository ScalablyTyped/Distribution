package typings.devextreme

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindow extends js.Object {
  var window: js.UndefOr[Window_] = js.undefined
}

object AnonWindow {
  @scala.inline
  def apply(window: Window_ = null): AnonWindow = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindow]
  }
}

