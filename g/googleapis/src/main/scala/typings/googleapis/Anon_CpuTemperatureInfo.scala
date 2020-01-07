package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CpuTemperatureInfo extends js.Object {
  var cpuTemperatureInfo: js.UndefOr[js.Array[Anon_Label]] = js.native
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[Double]] = js.native
  var reportTime: js.UndefOr[String] = js.native
}

object Anon_CpuTemperatureInfo {
  @scala.inline
  def apply(
    cpuTemperatureInfo: js.Array[Anon_Label] = null,
    cpuUtilizationPercentageInfo: js.Array[Double] = null,
    reportTime: String = null
  ): Anon_CpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    if (cpuTemperatureInfo != null) __obj.updateDynamic("cpuTemperatureInfo")(cpuTemperatureInfo.asInstanceOf[js.Any])
    if (cpuUtilizationPercentageInfo != null) __obj.updateDynamic("cpuUtilizationPercentageInfo")(cpuUtilizationPercentageInfo.asInstanceOf[js.Any])
    if (reportTime != null) __obj.updateDynamic("reportTime")(reportTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CpuTemperatureInfo]
  }
}

