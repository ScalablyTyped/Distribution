package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUtilizationReport extends js.Object {
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.undefined
}

object ResourceUtilizationReport {
  @scala.inline
  def apply(cpuTime: js.Array[CPUTime] = null): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    if (cpuTime != null) __obj.updateDynamic("cpuTime")(cpuTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
}

