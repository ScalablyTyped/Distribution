package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WindowId extends js.Object {
  /** Specify the window to get the openness from. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Anon_WindowId {
  @scala.inline
  def apply(windowId: Int | Double = null): Anon_WindowId = {
    val __obj = js.Dynamic.literal()
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WindowId]
  }
}

