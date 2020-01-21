package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDeviceApplications extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var packageName: js.UndefOr[String] = js.undefined
  var permission: js.UndefOr[js.Array[String]] = js.undefined
  var versionCode: js.UndefOr[Double] = js.undefined
  var versionName: js.UndefOr[String] = js.undefined
}

object MobileDeviceApplications {
  @scala.inline
  def apply(
    displayName: String = null,
    packageName: String = null,
    permission: js.Array[String] = null,
    versionCode: Int | Double = null,
    versionName: String = null
  ): MobileDeviceApplications = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDeviceApplications]
  }
}

