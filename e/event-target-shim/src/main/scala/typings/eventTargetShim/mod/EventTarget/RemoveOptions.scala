package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveOptions extends js.Object {
  /**
    * The flag to indicate that the listener is for the capturing phase.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
}

object RemoveOptions {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveOptions]
  }
}

