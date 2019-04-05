package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var temperature: js.UndefOr[scala.Double] = js.undefined
}

object ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo {
  @scala.inline
  def apply(label: java.lang.String = null, temperature: scala.Int | scala.Double = null): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (temperature != null) __obj.updateDynamic("temperature")(temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]
  }
}

