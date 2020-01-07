package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Worker metrics exported from workers. This contains resource utilization
  * metrics accumulated from a variety of sources. For more information, see
  * go/df-resource-signals.
  */
@js.native
trait Schema$ResourceUtilizationReport extends js.Object {
  /**
    * CPU utilization samples.
    */
  var cpuTime: js.UndefOr[js.Array[Schema$CPUTime]] = js.native
}

object Schema$ResourceUtilizationReport {
  @scala.inline
  def apply(cpuTime: js.Array[Schema$CPUTime] = null): Schema$ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    if (cpuTime != null) __obj.updateDynamic("cpuTime")(cpuTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceUtilizationReport]
  }
}

