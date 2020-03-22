package typings.expoLocation.mod

import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResponse
  extends typings.unimodulesPermissionsInterface.mod.PermissionResponse {
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
}

object PermissionResponse {
  @scala.inline
  def apply(
    canAskAgain: Boolean,
    expires: PermissionExpiration,
    granted: Boolean,
    status: typings.unimodulesPermissionsInterface.mod.PermissionStatus,
    android: PermissionDetailsLocationAndroid = null,
    ios: PermissionDetailsLocationIOS = null
  ): PermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResponse]
  }
}

