package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexWindowId extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: Double
  /** Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object IndexWindowId {
  @scala.inline
  def apply(index: Double, windowId: js.UndefOr[Double] = js.undefined): IndexWindowId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexWindowId]
  }
}

