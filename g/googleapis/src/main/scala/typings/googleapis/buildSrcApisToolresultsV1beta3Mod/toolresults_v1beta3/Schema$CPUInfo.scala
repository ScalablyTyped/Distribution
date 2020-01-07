package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CPUInfo extends js.Object {
  /**
    * description of the device processor ie &#39;1.8 GHz hexa core 64-bit
    * ARMv8-A&#39;
    */
  var cpuProcessor: js.UndefOr[String] = js.native
  /**
    * the CPU clock speed in GHz
    */
  var cpuSpeedInGhz: js.UndefOr[Double] = js.native
  /**
    * the number of CPU cores
    */
  var numberOfCores: js.UndefOr[Double] = js.native
}

object Schema$CPUInfo {
  @scala.inline
  def apply(
    cpuProcessor: String = null,
    cpuSpeedInGhz: Int | Double = null,
    numberOfCores: Int | Double = null
  ): Schema$CPUInfo = {
    val __obj = js.Dynamic.literal()
    if (cpuProcessor != null) __obj.updateDynamic("cpuProcessor")(cpuProcessor.asInstanceOf[js.Any])
    if (cpuSpeedInGhz != null) __obj.updateDynamic("cpuSpeedInGhz")(cpuSpeedInGhz.asInstanceOf[js.Any])
    if (numberOfCores != null) __obj.updateDynamic("numberOfCores")(numberOfCores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CPUInfo]
  }
}

