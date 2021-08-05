package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.expoPermissions.permissionsTypesMod.PermissionType
import typings.std.PermissionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoPermissionsWebMod {
  
  @JSImport("expo-permissions/build/ExpoPermissions.web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("expo-permissions/build/ExpoPermissions.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def askAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("askAsync")(permissionTypes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PermissionMap]]
    
    inline def getAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(permissionTypes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PermissionMap]]
    
    @JSImport("expo-permissions/build/ExpoPermissions.web", "default.name")
    @js.native
    val name: String = js.native
  }
  
  inline def getRequestMotionPermission(): js.Function0[js.Promise[PermissionState]] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMotionPermission")().asInstanceOf[js.Function0[js.Promise[PermissionState]] | Null]
}
