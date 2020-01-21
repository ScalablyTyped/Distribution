package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceSystemRamFreeReports extends js.Object {
  var reportTime: js.UndefOr[String] = js.undefined
  var systemRamFreeInfo: js.UndefOr[js.Array[String]] = js.undefined
}

object ChromeOsDeviceSystemRamFreeReports {
  @scala.inline
  def apply(reportTime: String = null, systemRamFreeInfo: js.Array[String] = null): ChromeOsDeviceSystemRamFreeReports = {
    val __obj = js.Dynamic.literal()
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime.asInstanceOf[js.Any])
    if (systemRamFreeInfo != null) __obj.updateDynamic("systemRamFreeInfo")(systemRamFreeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceSystemRamFreeReports]
  }
}

