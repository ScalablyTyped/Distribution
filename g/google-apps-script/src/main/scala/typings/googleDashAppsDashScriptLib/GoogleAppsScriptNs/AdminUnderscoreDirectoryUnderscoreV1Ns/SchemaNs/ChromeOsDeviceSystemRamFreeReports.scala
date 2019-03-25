package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceSystemRamFreeReports extends js.Object {
  var reportTime: js.UndefOr[java.lang.String] = js.undefined
  var systemRamFreeInfo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ChromeOsDeviceSystemRamFreeReports {
  @scala.inline
  def apply(reportTime: java.lang.String = null, systemRamFreeInfo: js.Array[java.lang.String] = null): ChromeOsDeviceSystemRamFreeReports = {
    val __obj = js.Dynamic.literal()
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime)
    if (systemRamFreeInfo != null) __obj.updateDynamic("systemRamFreeInfo")(systemRamFreeInfo)
    __obj.asInstanceOf[ChromeOsDeviceSystemRamFreeReports]
  }
}

