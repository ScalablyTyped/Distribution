package typings
package expectDashPuppeteerLib.expectDashPuppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectToClickOptions extends ExpectTimingActions {
  /**
    * A text or a RegExp to match in element textContent.
    */
  var text: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

object ExpectToClickOptions {
  @scala.inline
  def apply(
    polling: expectDashPuppeteerLib.ExpectPolling = null,
    text: java.lang.String | stdLib.RegExp = null,
    timeout: scala.Int | scala.Double = null
  ): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectToClickOptions]
  }
}

