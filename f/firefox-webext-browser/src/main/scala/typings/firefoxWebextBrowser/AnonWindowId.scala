package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowId extends js.Object {
  /** Specify the window to get the openness from. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonWindowId {
  @scala.inline
  def apply(windowId: Int | Double = null): AnonWindowId = {
    val __obj = js.Dynamic.literal()
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindowId]
  }
}

