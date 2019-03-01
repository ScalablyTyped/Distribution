package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUInfo extends js.Object {
  /** description of the device processor ie '1.8 GHz hexa core 64-bit ARMv8-A' */
  var cpuProcessor: js.UndefOr[java.lang.String] = js.undefined
  /** the CPU clock speed in GHz */
  var cpuSpeedInGhz: js.UndefOr[scala.Double] = js.undefined
  /** the number of CPU cores */
  var numberOfCores: js.UndefOr[scala.Double] = js.undefined
}

object CPUInfo {
  @scala.inline
  def apply(
    cpuProcessor: java.lang.String = null,
    cpuSpeedInGhz: scala.Int | scala.Double = null,
    numberOfCores: scala.Int | scala.Double = null
  ): CPUInfo = {
    val __obj = js.Dynamic.literal()
    if (cpuProcessor != null) __obj.updateDynamic("cpuProcessor")(cpuProcessor)
    if (cpuSpeedInGhz != null) __obj.updateDynamic("cpuSpeedInGhz")(cpuSpeedInGhz.asInstanceOf[js.Any])
    if (numberOfCores != null) __obj.updateDynamic("numberOfCores")(numberOfCores.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUInfo]
  }
}

