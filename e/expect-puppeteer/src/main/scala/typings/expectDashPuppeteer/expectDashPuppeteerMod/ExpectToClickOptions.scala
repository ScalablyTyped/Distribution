package typings.expectDashPuppeteer.expectDashPuppeteerMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectToClickOptions extends ExpectTimingActions {
  /**
    * A text or a RegExp to match in element textContent.
    */
  var text: js.UndefOr[String | RegExp] = js.undefined
}

object ExpectToClickOptions {
  @scala.inline
  def apply(polling: ExpectPolling = null, text: String | RegExp = null, timeout: Int | Double = null): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectToClickOptions]
  }
}

