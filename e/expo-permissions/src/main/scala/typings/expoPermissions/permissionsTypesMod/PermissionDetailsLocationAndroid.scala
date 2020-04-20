package typings.expoPermissions.permissionsTypesMod

import typings.expoPermissions.expoPermissionsStrings.coarse
import typings.expoPermissions.expoPermissionsStrings.fine
import typings.expoPermissions.expoPermissionsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionDetailsLocationAndroid extends js.Object {
  var scope: fine | coarse | none
}

object PermissionDetailsLocationAndroid {
  @scala.inline
  def apply(scope: fine | coarse | none): PermissionDetailsLocationAndroid = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionDetailsLocationAndroid]
  }
}

