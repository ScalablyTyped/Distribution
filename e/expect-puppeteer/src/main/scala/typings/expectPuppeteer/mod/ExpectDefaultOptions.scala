package typings.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default options that apply to all expectations and can be set globally
  */
trait ExpectDefaultOptions extends js.Object {
  /**
    * An interval at which the pageFunction is executed. Defaults to "raf".
    */
  var polling: js.UndefOr[ExpectPolling] = js.undefined
  /**
    * Maximum time to wait for in milliseconds. Defaults to 500.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ExpectDefaultOptions {
  @scala.inline
  def apply(polling: ExpectPolling = null, timeout: js.UndefOr[Double] = js.undefined): ExpectDefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectDefaultOptions]
  }
}

