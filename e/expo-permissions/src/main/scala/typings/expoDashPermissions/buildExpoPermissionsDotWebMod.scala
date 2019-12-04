package typings.expoDashPermissions

import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionMap
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/ExpoPermissions.web", JSImport.Namespace)
@js.native
object buildExpoPermissionsDotWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def askAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    def getAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
  }
  
}

