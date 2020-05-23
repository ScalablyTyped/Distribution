package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var window: js.UndefOr[typings.std.Window] = js.undefined
}

object Window {
  @scala.inline
  def apply(window: typings.std.Window = null): Window = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

