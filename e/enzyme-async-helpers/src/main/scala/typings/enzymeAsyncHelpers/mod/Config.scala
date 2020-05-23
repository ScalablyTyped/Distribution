package typings.enzymeAsyncHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
   // Default: true, logs the wrapper's rendered structure when the wait times out. An attempt to help out in finding what's wrong.
  var logStructureOnSuccess: js.UndefOr[Boolean] = js.undefined
  var logStructureOnTimeout: js.UndefOr[Boolean] = js.undefined
   // Default: 50, how often to check for validity
  var timeout: js.UndefOr[Double] = js.undefined
   // Default: 2000 (2 seconds), how long to wait before timing out
  var timeoutMessage: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    logStructureOnSuccess: js.UndefOr[Boolean] = js.undefined,
    logStructureOnTimeout: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timeoutMessage: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logStructureOnSuccess)) __obj.updateDynamic("logStructureOnSuccess")(logStructureOnSuccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logStructureOnTimeout)) __obj.updateDynamic("logStructureOnTimeout")(logStructureOnTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

