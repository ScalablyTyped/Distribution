package typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTargetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends RemoveOptions {
  /**
    * The flag to indicate that the listener will be removed on the first
    * event.
    */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * The flag to indicate that the listener doesn't support
    * `event.preventDefault()` operation.
    */
  var passive: js.UndefOr[Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    capture: js.UndefOr[Boolean] = js.undefined,
    once: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    __obj.asInstanceOf[AddOptions]
  }
}

