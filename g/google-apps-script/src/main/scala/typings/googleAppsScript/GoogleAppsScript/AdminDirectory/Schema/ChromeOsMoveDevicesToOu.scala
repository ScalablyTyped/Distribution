package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsMoveDevicesToOu extends js.Object {
  var deviceIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(deviceIds: js.Array[String] = null): ChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsMoveDevicesToOu]
  }
}

