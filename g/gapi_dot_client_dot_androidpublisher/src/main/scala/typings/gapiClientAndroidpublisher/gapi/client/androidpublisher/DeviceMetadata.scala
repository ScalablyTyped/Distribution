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
    glEsVersion: Int | Double = null,
    manufacturer: String = null,
    nativePlatform: String = null,
    productName: String = null,
    ramMb: Int | Double = null,
    screenDensityDpi: Int | Double = null,
    screenHeightPx: Int | Double = null,
    screenWidthPx: Int | Double = null
  ): DeviceMetadata = {
    val __obj = js.Dynamic.literal()
    if (cpuMake != null) __obj.updateDynamic("cpuMake")(cpuMake.asInstanceOf[js.Any])
    if (cpuModel != null) __obj.updateDynamic("cpuModel")(cpuModel.asInstanceOf[js.Any])
    if (deviceClass != null) __obj.updateDynamic("deviceClass")(deviceClass.asInstanceOf[js.Any])
    if (glEsVersion != null) __obj.updateDynamic("glEsVersion")(glEsVersion.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (nativePlatform != null) __obj.updateDynamic("nativePlatform")(nativePlatform.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (ramMb != null) __obj.updateDynamic("ramMb")(ramMb.asInstanceOf[js.Any])
    if (screenDensityDpi != null) __obj.updateDynamic("screenDensityDpi")(screenDensityDpi.asInstanceOf[js.Any])
    if (screenHeightPx != null) __obj.updateDynamic("screenHeightPx")(screenHeightPx.asInstanceOf[js.Any])
    if (screenWidthPx != null) __obj.updateDynamic("screenWidthPx")(screenWidthPx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetadata]
  }
}

