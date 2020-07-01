package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.expoPermissions.permissionsTypesMod.PermissionType
import typings.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/ExpoPermissions.web", JSImport.Namespace)
@js.native
object expoPermissionsWebMod extends js.Object {
  def getRequestMotionPermission(): js.Function0[js.Promise[PermissionState] | Null] = js.native
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def askAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    def getAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
  }
  
}

