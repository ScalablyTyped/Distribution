package typings
package enzymeDashAsyncDashHelpersLib.enzymeDashAsyncDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
   // Default: true, logs the wrapper's rendered structure when the wait times out. An attempt to help out in finding what's wrong.
  var logStructureOnSuccess: js.UndefOr[scala.Boolean] = js.undefined
  var logStructureOnTimeout: js.UndefOr[scala.Boolean] = js.undefined
   // Default: 50, how often to check for validity
  var timeout: js.UndefOr[scala.Double] = js.undefined
   // Default: 2000 (2 seconds), how long to wait before timing out
  var timeoutMessage: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    logStructureOnSuccess: js.UndefOr[scala.Boolean] = js.undefined,
    logStructureOnTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timeoutMessage: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(logStructureOnSuccess)) __obj.updateDynamic("logStructureOnSuccess")(logStructureOnSuccess)
    if (!js.isUndefined(logStructureOnTimeout)) __obj.updateDynamic("logStructureOnTimeout")(logStructureOnTimeout)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutMessage != null) __obj.updateDynamic("timeoutMessage")(timeoutMessage)
    __obj.asInstanceOf[Config]
  }
}

