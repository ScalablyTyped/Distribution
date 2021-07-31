package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import typings.unimodulesPermissionsInterface.mod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coalescedPermissionsMod {
  
  @JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def coalesceCanAskAgain(permissions: PermissionMap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceCanAskAgain")(permissions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceExpirations")(permissions.asInstanceOf[js.Any]).asInstanceOf[PermissionExpiration]
  
  @scala.inline
  def coalesceGranted(permissions: PermissionMap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceGranted")(permissions.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("coalesceStatuses")(permissions.asInstanceOf[js.Any]).asInstanceOf[PermissionStatus]
}
