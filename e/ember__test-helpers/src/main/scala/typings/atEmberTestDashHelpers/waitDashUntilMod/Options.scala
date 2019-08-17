package typings.atEmberTestDashHelpers.waitDashUntilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutMessage: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(timeout: Int | Double = null, timeoutMessage: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage)
    __obj.asInstanceOf[Options]
  }
}

