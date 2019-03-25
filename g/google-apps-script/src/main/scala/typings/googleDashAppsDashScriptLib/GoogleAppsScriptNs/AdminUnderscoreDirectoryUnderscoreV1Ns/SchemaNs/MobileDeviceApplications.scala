package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDeviceApplications extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  var permission: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var versionCode: js.UndefOr[scala.Double] = js.undefined
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}

object MobileDeviceApplications {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    packageName: java.lang.String = null,
    permission: js.Array[java.lang.String] = null,
    versionCode: scala.Int | scala.Double = null,
    versionName: java.lang.String = null
  ): MobileDeviceApplications = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (permission != null) __obj.updateDynamic("permission")(permission)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[MobileDeviceApplications]
  }
}

