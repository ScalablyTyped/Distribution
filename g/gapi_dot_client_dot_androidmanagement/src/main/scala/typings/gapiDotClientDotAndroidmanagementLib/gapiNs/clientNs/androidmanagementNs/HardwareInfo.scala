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

