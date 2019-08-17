package typings.emberDashTestDashHelpers.waitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOptions extends js.Object {
  var waitForAJAX: js.UndefOr[Boolean] = js.undefined
  var waitForTimers: js.UndefOr[Boolean] = js.undefined
  var waitForWaiters: js.UndefOr[Boolean] = js.undefined
}

object WaitOptions {
  @scala.inline
  def apply(
    waitForAJAX: js.UndefOr[Boolean] = js.undefined,
    waitForTimers: js.UndefOr[Boolean] = js.undefined,
    waitForWaiters: js.UndefOr[Boolean] = js.undefined
  ): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(waitForAJAX)) __obj.updateDynamic("waitForAJAX")(waitForAJAX)
    if (!js.isUndefined(waitForTimers)) __obj.updateDynamic("waitForTimers")(waitForTimers)
    if (!js.isUndefined(waitForWaiters)) __obj.updateDynamic("waitForWaiters")(waitForWaiters)
    __obj.asInstanceOf[WaitOptions]
  }
}

