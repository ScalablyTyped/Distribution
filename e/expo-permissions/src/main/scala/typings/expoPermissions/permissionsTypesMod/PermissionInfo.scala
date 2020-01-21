package typings.expoPermissions.permissionsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionInfo extends js.Object {
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
  var expires: PermissionExpiration
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
  var status: PermissionStatus
}

object PermissionInfo {
  @scala.inline
  def apply(
    expires: PermissionExpiration,
    status: PermissionStatus,
    android: PermissionDetailsLocationAndroid = null,
    ios: PermissionDetailsLocationIOS = null
  ): PermissionInfo = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionInfo]
  }
}

