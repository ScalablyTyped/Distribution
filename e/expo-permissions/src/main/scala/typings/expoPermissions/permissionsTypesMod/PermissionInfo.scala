package typings.expoPermissions.permissionsTypesMod

import typings.expoPermissions.expoPermissionsStrings.all
import typings.expoPermissions.expoPermissionsStrings.always
import typings.expoPermissions.expoPermissionsStrings.limited
import typings.expoPermissions.expoPermissionsStrings.none
import typings.expoPermissions.expoPermissionsStrings.whenInUse
import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionInfo
  extends typings.unimodulesPermissionsInterface.mod.PermissionResponse {
  
  var accessPrivileges: js.UndefOr[all | limited | none] = js.native
  
  var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.native
  
  var scope: js.UndefOr[whenInUse | always | none] = js.native
}
object PermissionInfo {
  
  @scala.inline
  def apply(
    canAskAgain: Boolean,
    expires: PermissionExpiration,
    granted: Boolean,
    status: typings.unimodulesPermissionsInterface.mod.PermissionStatus
  ): PermissionInfo = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionInfo]
  }
  
  @scala.inline
  implicit class PermissionInfoOps[Self <: PermissionInfo] (val x: Self) extends AnyVal {
    
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
    def setAccessPrivileges(value: all | limited | none): Self = this.set("accessPrivileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPrivileges: Self = this.set("accessPrivileges", js.undefined)
    
    @scala.inline
    def setAndroid(value: PermissionDetailsLocationAndroid): Self = this.set("android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid: Self = this.set("android", js.undefined)
    
    @scala.inline
    def setScope(value: whenInUse | always | none): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
