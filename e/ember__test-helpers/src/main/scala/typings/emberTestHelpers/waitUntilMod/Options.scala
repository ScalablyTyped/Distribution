package typings.emberTestHelpers.waitUntilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutMessage: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined, timeoutMessage: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

