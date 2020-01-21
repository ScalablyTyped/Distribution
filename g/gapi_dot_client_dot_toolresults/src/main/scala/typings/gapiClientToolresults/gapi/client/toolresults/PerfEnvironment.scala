package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfEnvironment extends js.Object {
  /** CPU related environment info */
  var cpuInfo: js.UndefOr[CPUInfo] = js.undefined
  /** Memory related environment info */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.undefined
}

object PerfEnvironment {
  @scala.inline
  def apply(cpuInfo: CPUInfo = null, memoryInfo: MemoryInfo = null): PerfEnvironment = {
    val __obj = js.Dynamic.literal()
    if (cpuInfo != null) __obj.updateDynamic("cpuInfo")(cpuInfo.asInstanceOf[js.Any])
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfEnvironment]
  }
}

