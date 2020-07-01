package typings.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures how to poll for an element.
  */
trait ExpectTimingActions extends ExpectDefaultOptions {
  /**
    * delay to pass to the puppeteer element.type API
    */
  var delay: js.UndefOr[Double] = js.undefined
}

object ExpectTimingActions {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    polling: ExpectPolling = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): ExpectTimingActions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectTimingActions]
  }
}

