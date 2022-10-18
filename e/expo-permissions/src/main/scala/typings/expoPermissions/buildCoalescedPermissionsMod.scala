package typings.expoPermissions

import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionExpiration
import typings.expoModulesCore.buildPermissionsInterfaceMod.PermissionStatus
import typings.expoPermissions.buildPermissionsDottypesMod.PermissionMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCoalescedPermissionsMod {
  
  @JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coalesceCanAskAgain(permissions: PermissionMap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceCanAskAgain")(permissions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceExpirations")(permissions.asInstanceOf[js.Any]).asInstanceOf[PermissionExpiration]
  
  inline def coalesceGranted(permissions: PermissionMap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceGranted")(permissions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def coalesceStatuses(permissions: PermissionMap): PermissionStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceStatuses")(permissions.asInstanceOf[js.Any]).asInstanceOf[PermissionStatus]
}
