package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceTpmVersionInfo extends js.Object {
  var family: js.UndefOr[String] = js.undefined
  var firmwareVersion: js.UndefOr[String] = js.undefined
  var manufacturer: js.UndefOr[String] = js.undefined
  var specLevel: js.UndefOr[String] = js.undefined
  var tpmModel: js.UndefOr[String] = js.undefined
  var vendorSpecific: js.UndefOr[String] = js.undefined
}

object ChromeOsDeviceTpmVersionInfo {
  @scala.inline
  def apply(
    family: String = null,
    firmwareVersion: String = null,
    manufacturer: String = null,
    specLevel: String = null,
    tpmModel: String = null,
    vendorSpecific: String = null
  ): ChromeOsDeviceTpmVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (specLevel != null) __obj.updateDynamic("specLevel")(specLevel)
    if (tpmModel != null) __obj.updateDynamic("tpmModel")(tpmModel)
    if (vendorSpecific != null) __obj.updateDynamic("vendorSpecific")(vendorSpecific)
    __obj.asInstanceOf[ChromeOsDeviceTpmVersionInfo]
  }
}

