package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMetadata extends js.Object {
  /** Device CPU make e.g. "Qualcomm" */
  var cpuMake: js.UndefOr[String] = js.undefined
  /** Device CPU model e.g. "MSM8974" */
  var cpuModel: js.UndefOr[String] = js.undefined
  /** Device class (e.g. tablet) */
  var deviceClass: js.UndefOr[String] = js.undefined
  /** OpenGL version */
  var glEsVersion: js.UndefOr[Double] = js.undefined
  /** Device manufacturer (e.g. Motorola) */
  var manufacturer: js.UndefOr[String] = js.undefined
  /** Comma separated list of native platforms (e.g. "arm", "arm7") */
  var nativePlatform: js.UndefOr[String] = js.undefined
  /** Device model name (e.g. Droid) */
  var productName: js.UndefOr[String] = js.undefined
  /** Device RAM in Megabytes e.g. "2048" */
  var ramMb: js.UndefOr[Double] = js.undefined
  /** Screen density in DPI */
  var screenDensityDpi: js.UndefOr[Double] = js.undefined
  /** Screen height in pixels */
  var screenHeightPx: js.UndefOr[Double] = js.undefined
  /** Screen width in pixels */
  var screenWidthPx: js.UndefOr[Double] = js.undefined
}

object DeviceMetadata {
  @scala.inline
  def apply(
    cpuMake: String = null,
    cpuModel: String = null,
    deviceClass: String = null,
    glEsVersion: js.UndefOr[Double] = js.undefined,
    manufacturer: String = null,
    nativePlatform: String = null,
    productName: String = null,
    ramMb: js.UndefOr[Double] = js.undefined,
    screenDensityDpi: js.UndefOr[Double] = js.undefined,
    screenHeightPx: js.UndefOr[Double] = js.undefined,
    screenWidthPx: js.UndefOr[Double] = js.undefined
  ): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cpuMake != null) __obj.updateDynamic("cpuMake")(cpuMake.asInstanceOf[js.Any])
    if (cpuModel != null) __obj.updateDynamic("cpuModel")(cpuModel.asInstanceOf[js.Any])
    if (deviceClass != null) __obj.updateDynamic("deviceClass")(deviceClass.asInstanceOf[js.Any])
    if (!js.isUndefined(glEsVersion)) __obj.updateDynamic("glEsVersion")(glEsVersion.get.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (nativePlatform != null) __obj.updateDynamic("nativePlatform")(nativePlatform.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (!js.isUndefined(ramMb)) __obj.updateDynamic("ramMb")(ramMb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenDensityDpi)) __obj.updateDynamic("screenDensityDpi")(screenDensityDpi.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenHeightPx)) __obj.updateDynamic("screenHeightPx")(screenHeightPx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenWidthPx)) __obj.updateDynamic("screenWidthPx")(screenWidthPx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetadata]
  }
}

