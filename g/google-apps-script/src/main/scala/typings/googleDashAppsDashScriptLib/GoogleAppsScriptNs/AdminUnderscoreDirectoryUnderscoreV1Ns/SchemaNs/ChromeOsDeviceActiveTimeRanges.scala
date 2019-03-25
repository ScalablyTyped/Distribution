package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceActiveTimeRanges extends js.Object {
  var activeTime: js.UndefOr[scala.Double] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceActiveTimeRanges {
  @scala.inline
  def apply(activeTime: scala.Int | scala.Double = null, date: java.lang.String = null): ChromeOsDeviceActiveTimeRanges = {
    val __obj = js.Dynamic.literal()
    if (activeTime != null) __obj.updateDynamic("activeTime")(activeTime.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    __obj.asInstanceOf[ChromeOsDeviceActiveTimeRanges]
  }
}

