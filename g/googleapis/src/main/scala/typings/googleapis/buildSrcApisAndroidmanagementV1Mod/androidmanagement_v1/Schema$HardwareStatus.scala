package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hardware status. Temperatures may be compared to the temperature thresholds
  * available in hardwareInfo to determine hardware health.
  */
@js.native
trait Schema$HardwareStatus extends js.Object {
  /**
    * Current battery temperatures in Celsius for each battery on the device.
    */
  var batteryTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current CPU temperatures in Celsius for each CPU on the device.
    */
  var cpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * CPU usages in percentage for each core available on the device. Usage is
    * 0 for each unplugged core. Empty array implies that CPU usage is not
    * supported in the system.
    */
  var cpuUsages: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The time the measurements were taken.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Fan speeds in RPM for each fan on the device. Empty array means that
    * there are no fans or fan speed is not supported on the system.
    */
  var fanSpeeds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current GPU temperatures in Celsius for each GPU on the device.
    */
  var gpuTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Current device skin temperatures in Celsius.
    */
  var skinTemperatures: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$HardwareStatus {
  @scala.inline
  def apply(
    batteryTemperatures: js.Array[Double] = null,
    cpuTemperatures: js.Array[Double] = null,
    cpuUsages: js.Array[Double] = null,
    createTime: String = null,
    fanSpeeds: js.Array[Double] = null,
    gpuTemperatures: js.Array[Double] = null,
    skinTemperatures: js.Array[Double] = null
  ): Schema$HardwareStatus = {
    val __obj = js.Dynamic.literal()
    if (batteryTemperatures != null) __obj.updateDynamic("batteryTemperatures")(batteryTemperatures.asInstanceOf[js.Any])
    if (cpuTemperatures != null) __obj.updateDynamic("cpuTemperatures")(cpuTemperatures.asInstanceOf[js.Any])
    if (cpuUsages != null) __obj.updateDynamic("cpuUsages")(cpuUsages.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (fanSpeeds != null) __obj.updateDynamic("fanSpeeds")(fanSpeeds.asInstanceOf[js.Any])
    if (gpuTemperatures != null) __obj.updateDynamic("gpuTemperatures")(gpuTemperatures.asInstanceOf[js.Any])
    if (skinTemperatures != null) __obj.updateDynamic("skinTemperatures")(skinTemperatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HardwareStatus]
  }
}

