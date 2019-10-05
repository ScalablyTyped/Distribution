package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDeviceAction extends js.Object {
  var action: js.UndefOr[String] = js.undefined
}

object MobileDeviceAction {
  @scala.inline
  def apply(action: String = null): MobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[MobileDeviceAction]
  }
}

