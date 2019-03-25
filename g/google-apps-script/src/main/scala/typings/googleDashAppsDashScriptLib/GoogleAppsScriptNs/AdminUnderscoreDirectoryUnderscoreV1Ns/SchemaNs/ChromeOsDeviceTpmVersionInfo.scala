package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceTpmVersionInfo extends js.Object {
  var family: js.UndefOr[java.lang.String] = js.undefined
  var firmwareVersion: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var specLevel: js.UndefOr[java.lang.String] = js.undefined
  var tpmModel: js.UndefOr[java.lang.String] = js.undefined
  var vendorSpecific: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceTpmVersionInfo {
  @scala.inline
  def apply(
    family: java.lang.String = null,
    firmwareVersion: java.lang.String = null,
    manufacturer: java.lang.String = null,
    specLevel: java.lang.String = null,
    tpmModel: java.lang.String = null,
    vendorSpecific: java.lang.String = null
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

