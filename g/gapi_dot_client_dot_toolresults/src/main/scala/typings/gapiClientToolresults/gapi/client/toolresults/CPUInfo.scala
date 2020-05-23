package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUInfo extends js.Object {
  /** description of the device processor ie '1.8 GHz hexa core 64-bit ARMv8-A' */
  var cpuProcessor: js.UndefOr[String] = js.undefined
  /** the CPU clock speed in GHz */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.undefined
  /** the number of CPU cores */
  var numberOfCores: js.UndefOr[Double] = js.undefined
}

object CPUInfo {
  @scala.inline
  def apply(
    cpuProcessor: String = null,
    cpuSpeedInGhz: js.UndefOr[Double] = js.undefined,
    numberOfCores: js.UndefOr[Double] = js.undefined
  ): CPUInfo = {
    val __obj = js.Dynamic.literal()
    if (cpuProcessor != null) __obj.updateDynamic("cpuProcessor")(cpuProcessor.asInstanceOf[js.Any])
    if (!js.isUndefined(cpuSpeedInGhz)) __obj.updateDynamic("cpuSpeedInGhz")(cpuSpeedInGhz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfCores)) __obj.updateDynamic("numberOfCores")(numberOfCores.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUInfo]
  }
}

