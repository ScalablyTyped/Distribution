package typings
package expectDashPuppeteerLib.expectDashPuppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures how to poll for an element.
  */
trait ExpectTimingActions extends js.Object {
  /**
    * An interval at which the pageFunction is executed. Defaults to "raf".
    */
  var polling: js.UndefOr[expectDashPuppeteerLib.ExpectPolling] = js.undefined
  /**
    * Maximum time to wait for in milliseconds. Defaults to 500.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ExpectTimingActions {
  @scala.inline
  def apply(polling: expectDashPuppeteerLib.ExpectPolling = null, timeout: scala.Int | scala.Double = null): ExpectTimingActions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectTimingActions]
  }
}

