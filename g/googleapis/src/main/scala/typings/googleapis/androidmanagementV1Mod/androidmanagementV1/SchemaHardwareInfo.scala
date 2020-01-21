package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device hardware. The fields related to temperature
  * thresholds are only available if hardwareStatusEnabled is true in the
  * device&#39;s policy.
  */
@js.native
trait SchemaHardwareInfo extends js.Object {
  /**
    * Battery shutdown temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Battery throttling temperature thresholds in Celsius for each battery on
    * the device.
    */
  var batteryThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Brand of the device. For example, Google.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * CPU shutdown temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * CPU throttling temperature thresholds in Celsius for each CPU on the
    * device.
    */
  var cpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Baseband version. For example, MDM9625_104662.22.05.34p.
    */
  var deviceBasebandVersion: js.UndefOr[String] = js.native
  /**
    * GPU shutdown temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * GPU throttling temperature thresholds in Celsius for each GPU on the
    * device.
    */
  var gpuThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Name of the hardware. For example, Angler.
    */
  var hardware: js.UndefOr[String] = js.native
  /**
    * Manufacturer. For example, Motorola.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The model of the device. For example, Asus Nexus 7.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.native
  /**
    * Device skin shutdown temperature thresholds in Celsius.
    */
  var skinShutdownTemperatures: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Device skin throttling temperature thresholds in Celsius.
    */
  var skinThrottlingTemperatures: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaHardwareInfo {
  @scala.inline
  def apply(
    batteryShutdownTemperatures: js.Array[Double] = null,
    batteryThrottlingTemperatures: js.Array[Double] = null,
    brand: String = null,
    cpuShutdownTemperatures: js.Array[Double] = null,
    cpuThrottlingTemperatures: js.Array[Double] = null,
    deviceBasebandVersion: String = null,
    gpuShutdownTemperatures: js.Array[Double] = null,
    gpuThrottlingTemperatures: js.Array[Double] = null,
    hardware: String = null,
    manufacturer: String = null,
    model: String = null,
    serialNumber: String = null,
    skinShutdownTemperatures: js.Array[Double] = null,
    skinThrottlingTemperatures: js.Array[Double] = null
  ): SchemaHardwareInfo = {
    val __obj = js.Dynamic.literal()
    if (batteryShutdownTemperatures != null) __obj.updateDynamic("batteryShutdownTemperatures")(batteryShutdownTemperatures.asInstanceOf[js.Any])
    if (batteryThrottlingTemperatures != null) __obj.updateDynamic("batteryThrottlingTemperatures")(batteryThrottlingTemperatures.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (cpuShutdownTemperatures != null) __obj.updateDynamic("cpuShutdownTemperatures")(cpuShutdownTemperatures.asInstanceOf[js.Any])
    if (cpuThrottlingTemperatures != null) __obj.updateDynamic("cpuThrottlingTemperatures")(cpuThrottlingTemperatures.asInstanceOf[js.Any])
    if (deviceBasebandVersion != null) __obj.updateDynamic("deviceBasebandVersion")(deviceBasebandVersion.asInstanceOf[js.Any])
    if (gpuShutdownTemperatures != null) __obj.updateDynamic("gpuShutdownTemperatures")(gpuShutdownTemperatures.asInstanceOf[js.Any])
    if (gpuThrottlingTemperatures != null) __obj.updateDynamic("gpuThrottlingTemperatures")(gpuThrottlingTemperatures.asInstanceOf[js.Any])
    if (hardware != null) __obj.updateDynamic("hardware")(hardware.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    if (skinShutdownTemperatures != null) __obj.updateDynamic("skinShutdownTemperatures")(skinShutdownTemperatures.asInstanceOf[js.Any])
    if (skinThrottlingTemperatures != null) __obj.updateDynamic("skinThrottlingTemperatures")(skinThrottlingTemperatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHardwareInfo]
  }
}

