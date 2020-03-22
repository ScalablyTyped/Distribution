package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowIdNumber extends js.Object {
  /** Specify the window to get the openness from. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonWindowIdNumber {
  @scala.inline
  def apply(windowId: Int | Double = null): AnonWindowIdNumber = {
    val __obj = js.Dynamic.literal()
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindowIdNumber]
  }
}

