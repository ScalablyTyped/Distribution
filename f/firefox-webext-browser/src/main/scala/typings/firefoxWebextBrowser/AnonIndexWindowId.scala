package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexWindowId extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: Double
  /** Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonIndexWindowId {
  @scala.inline
  def apply(index: Double, windowId: Int | Double = null): AnonIndexWindowId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexWindowId]
  }
}

