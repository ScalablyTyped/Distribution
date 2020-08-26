package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuTemperatureInfo extends js.Object {
  var cpuTemperatureInfo: js.UndefOr[js.Array[Label]] = js.native
  var cpuUtilizationPercentageInfo: js.UndefOr[js.Array[Double]] = js.native
  var reportTime: js.UndefOr[String] = js.native
}

object CpuTemperatureInfo {
  @scala.inline
  def apply(): CpuTemperatureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuTemperatureInfo]
  }
  @scala.inline
  implicit class CpuTemperatureInfoOps[Self <: CpuTemperatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCpuTemperatureInfoVarargs(value: Label*): Self = this.set("cpuTemperatureInfo", js.Array(value :_*))
    @scala.inline
    def setCpuTemperatureInfo(value: js.Array[Label]): Self = this.set("cpuTemperatureInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuTemperatureInfo: Self = this.set("cpuTemperatureInfo", js.undefined)
    @scala.inline
    def setCpuUtilizationPercentageInfoVarargs(value: Double*): Self = this.set("cpuUtilizationPercentageInfo", js.Array(value :_*))
    @scala.inline
    def setCpuUtilizationPercentageInfo(value: js.Array[Double]): Self = this.set("cpuUtilizationPercentageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuUtilizationPercentageInfo: Self = this.set("cpuUtilizationPercentageInfo", js.undefined)
    @scala.inline
    def setReportTime(value: String): Self = this.set("reportTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTime: Self = this.set("reportTime", js.undefined)
  }
  
}

