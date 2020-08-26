package typings.expoPermissions.permissionsTypesMod

import typings.expoPermissions.expoPermissionsStrings.always
import typings.expoPermissions.expoPermissionsStrings.whenInUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionDetailsLocationIOS extends js.Object {
  var scope: whenInUse | always = js.native
}

object PermissionDetailsLocationIOS {
  @scala.inline
  def apply(scope: whenInUse | always): PermissionDetailsLocationIOS = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationIOS]
  }
  @scala.inline
  implicit class PermissionDetailsLocationIOSOps[Self <: PermissionDetailsLocationIOS] (val x: Self) extends AnyVal {
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
    def setScope(value: whenInUse | always): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

