package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowIdNumber extends js.Object {
  /** Specify the window to get the openness from. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object WindowIdNumber {
  @scala.inline
  def apply(windowId: js.UndefOr[Double] = js.undefined): WindowIdNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowIdNumber]
  }
}

