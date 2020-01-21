package typings.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures how to poll for an element.
  */
trait ExpectTimingActions extends js.Object {
  /**
    * delay to pass to the puppeteer element.type API
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * An interval at which the pageFunction is executed. Defaults to "raf".
    */
  var polling: js.UndefOr[ExpectPolling] = js.undefined
  /**
    * Maximum time to wait for in milliseconds. Defaults to 500.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ExpectTimingActions {
  @scala.inline
  def apply(delay: Int | Double = null, polling: ExpectPolling = null, timeout: Int | Double = null): ExpectTimingActions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectTimingActions]
  }
}

