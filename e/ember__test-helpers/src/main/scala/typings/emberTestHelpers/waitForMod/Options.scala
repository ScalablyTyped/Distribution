package typings.emberTestHelpers.waitForMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutMessage: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutMessage: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

