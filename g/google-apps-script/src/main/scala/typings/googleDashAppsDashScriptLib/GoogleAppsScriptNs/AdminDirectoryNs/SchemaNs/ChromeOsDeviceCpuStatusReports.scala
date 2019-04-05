package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceCpuStatusReports extends js.Object {
  var cpuTemperatureInfo: js.UndefOr[js.Array[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo]] = js.undefined
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var reportTime: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceCpuStatusReports {
  @scala.inline
  def apply(
    cpuTemperatureInfo: js.Array[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo] = null,
    cpuUtilizationPercentageInfo: js.Array[scala.Double] = null,
    reportTime: java.lang.String = null
  ): ChromeOsDeviceCpuStatusReports = {
    val __obj = js.Dynamic.literal()
    if (cpuTemperatureInfo != null) __obj.updateDynamic("cpuTemperatureInfo")(cpuTemperatureInfo)
    if (cpuUtilizationPercentageInfo != null) __obj.updateDynamic("cpuUtilizationPercentageInfo")(cpuUtilizationPercentageInfo)
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime)
    __obj.asInstanceOf[ChromeOsDeviceCpuStatusReports]
  }
}

