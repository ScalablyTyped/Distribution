package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceAction extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var deprovisionReason: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceAction {
  @scala.inline
  def apply(action: String = null, deprovisionReason: String = null): ChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (deprovisionReason != null) __obj.updateDynamic("deprovisionReason")(deprovisionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceAction]
  }
}

