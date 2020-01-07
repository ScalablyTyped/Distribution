package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates performance environment info
  */
@js.native
trait Schema$PerfEnvironment extends js.Object {
  /**
    * CPU related environment info
    */
  var cpuInfo: js.UndefOr[Schema$CPUInfo] = js.native
  /**
    * Memory related environment info
    */
  var memoryInfo: js.UndefOr[Schema$MemoryInfo] = js.native
}

object Schema$PerfEnvironment {
  @scala.inline
  def apply(cpuInfo: Schema$CPUInfo = null, memoryInfo: Schema$MemoryInfo = null): Schema$PerfEnvironment = {
    val __obj = js.Dynamic.literal()
    if (cpuInfo != null) __obj.updateDynamic("cpuInfo")(cpuInfo.asInstanceOf[js.Any])
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerfEnvironment]
  }
}

