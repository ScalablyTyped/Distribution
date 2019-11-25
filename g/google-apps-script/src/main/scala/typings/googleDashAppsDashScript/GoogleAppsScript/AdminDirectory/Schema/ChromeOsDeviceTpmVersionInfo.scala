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
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (firmwareVersion != null) __obj.updateDynamic("firmwareVersion")(firmwareVersion.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (specLevel != null) __obj.updateDynamic("specLevel")(specLevel.asInstanceOf[js.Any])
    if (tpmModel != null) __obj.updateDynamic("tpmModel")(tpmModel.asInstanceOf[js.Any])
    if (vendorSpecific != null) __obj.updateDynamic("vendorSpecific")(vendorSpecific.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDeviceTpmVersionInfo]
  }
}

