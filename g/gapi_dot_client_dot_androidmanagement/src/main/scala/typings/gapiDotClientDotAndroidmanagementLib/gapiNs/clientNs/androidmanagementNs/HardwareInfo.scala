package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HardwareInfo extends js.Object {
  /** Battery shutdown temperature thresholds in Celsius for each battery on the device. */
  var batteryShutdownTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Battery throttling temperature thresholds in Celsius for each battery on the device. */
  var batteryThrottlingTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Brand of the device, e.g. Google. */
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /** CPU shutdown temperature thresholds in Celsius for each CPU on the device. */
  var cpuShutdownTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** CPU throttling temperature thresholds in Celsius for each CPU on the device. */
  var cpuThrottlingTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Baseband version, e.g. MDM9625_104662.22.05.34p. */
  var deviceBasebandVersion: js.UndefOr[java.lang.String] = js.undefined
  /** GPU shutdown temperature thresholds in Celsius for each GPU on the device. */
  var gpuShutdownTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** GPU throttling temperature thresholds in Celsius for each GPU on the device. */
  var gpuThrottlingTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Name of the hardware, e.g. Angler. */
  var hardware: js.UndefOr[java.lang.String] = js.undefined
  /** Manufacturer, e.g. Motorola. */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /** The model of the device, e.g. Asus Nexus 7. */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** The device serial number. */
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Device skin shutdown temperature thresholds in Celsius. */
  var skinShutdownTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** Device skin throttling temperature thresholds in Celsius. */
  var skinThrottlingTemperatures: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object HardwareInfo {
  @scala.inline
  def apply(
    batteryShutdownTemperatures: js.Array[scala.Double] = null,
    batteryThrottlingTemperatures: js.Array[scala.Double] = null,
    brand: java.lang.String = null,
    cpuShutdownTemperatures: js.Array[scala.Double] = null,
    cpuThrottlingTemperatures: js.Array[scala.Double] = null,
    deviceBasebandVersion: java.lang.String = null,
    gpuShutdownTemperatures: js.Array[scala.Double] = null,
    gpuThrottlingTemperatures: js.Array[scala.Double] = null,
    hardware: java.lang.String = null,
    manufacturer: java.lang.String = null,
    model: java.lang.String = null,
    serialNumber: java.lang.String = null,
    skinShutdownTemperatures: js.Array[scala.Double] = null,
    skinThrottlingTemperatures: js.Array[scala.Double] = null
  ): HardwareInfo = {
    val __obj = js.Dynamic.literal()
    if (batteryShutdownTemperatures != null) __obj.updateDynamic("batteryShutdownTemperatures")(batteryShutdownTemperatures)
    if (batteryThrottlingTemperatures != null) __obj.updateDynamic("batteryThrottlingTemperatures")(batteryThrottlingTemperatures)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (cpuShutdownTemperatures != null) __obj.updateDynamic("cpuShutdownTemperatures")(cpuShutdownTemperatures)
    if (cpuThrottlingTemperatures != null) __obj.updateDynamic("cpuThrottlingTemperatures")(cpuThrottlingTemperatures)
    if (deviceBasebandVersion != null) __obj.updateDynamic("deviceBasebandVersion")(deviceBasebandVersion)
    if (gpuShutdownTemperatures != null) __obj.updateDynamic("gpuShutdownTemperatures")(gpuShutdownTemperatures)
    if (gpuThrottlingTemperatures != null) __obj.updateDynamic("gpuThrottlingTemperatures")(gpuThrottlingTemperatures)
    if (hardware != null) __obj.updateDynamic("hardware")(hardware)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (model != null) __obj.updateDynamic("model")(model)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (skinShutdownTemperatures != null) __obj.updateDynamic("skinShutdownTemperatures")(skinShutdownTemperatures)
    if (skinThrottlingTemperatures != null) __obj.updateDynamic("skinThrottlingTemperatures")(skinThrottlingTemperatures)
    __obj.asInstanceOf[HardwareInfo]
  }
}

