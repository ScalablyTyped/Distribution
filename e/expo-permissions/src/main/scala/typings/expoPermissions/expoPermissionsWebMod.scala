package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.expoPermissions.permissionsTypesMod.PermissionType
import typings.std.PermissionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoPermissionsWebMod {
  
  object default {
    
    @JSImport("expo-permissions/build/ExpoPermissions.web", "default.askAsync")
    @js.native
    def askAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    
    @JSImport("expo-permissions/build/ExpoPermissions.web", "default.getAsync")
    @js.native
    def getAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    
    @JSImport("expo-permissions/build/ExpoPermissions.web", "default.name")
    @js.native
    val name: String = js.native
  }
  
  @JSImport("expo-permissions/build/ExpoPermissions.web", "getRequestMotionPermission")
  @js.native
  def getRequestMotionPermission(): js.Function0[js.Promise[PermissionState]] | Null = js.native
}
