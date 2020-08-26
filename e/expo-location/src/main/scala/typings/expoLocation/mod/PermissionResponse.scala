package typings.expoLocation.mod

import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionResponse
  extends typings.unimodulesPermissionsInterface.mod.PermissionResponse {
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.native
  var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.native
}

object PermissionResponse {
  @scala.inline
  def apply(
    canAskAgain: Boolean,
    expires: PermissionExpiration,
    granted: Boolean,
    status: typings.unimodulesPermissionsInterface.mod.PermissionStatus
  ): PermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionResponse]
  }
  @scala.inline
  implicit class PermissionResponseOps[Self <: PermissionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroid(value: PermissionDetailsLocationAndroid): Self = this.set("android", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    @scala.inline
    def setIos(value: PermissionDetailsLocationIOS): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
  
}

