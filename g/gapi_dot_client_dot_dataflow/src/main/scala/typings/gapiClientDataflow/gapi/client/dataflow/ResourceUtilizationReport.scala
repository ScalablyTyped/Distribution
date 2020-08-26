package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceUtilizationReport extends js.Object {
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.native
}

object ResourceUtilizationReport {
  @scala.inline
  def apply(): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
  @scala.inline
  implicit class ResourceUtilizationReportOps[Self <: ResourceUtilizationReport] (val x: Self) extends AnyVal {
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
    def setCpuTimeVarargs(value: CPUTime*): Self = this.set("cpuTime", js.Array(value :_*))
    @scala.inline
    def setCpuTime(value: js.Array[CPUTime]): Self = this.set("cpuTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuTime: Self = this.set("cpuTime", js.undefined)
  }
  
}

