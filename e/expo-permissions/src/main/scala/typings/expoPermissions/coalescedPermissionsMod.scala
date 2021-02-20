package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import typings.unimodulesPermissionsInterface.mod.PermissionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coalescedPermissionsMod {
  
  @JSImport("expo-permissions/build/CoalescedPermissions", "coalesceCanAskAgain")
  @js.native
  def coalesceCanAskAgain(permissions: PermissionMap): Boolean = js.native
  
  @JSImport("expo-permissions/build/CoalescedPermissions", "coalesceExpirations")
  @js.native
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  
  @JSImport("expo-permissions/build/CoalescedPermissions", "coalesceGranted")
  @js.native
  def coalesceGranted(permissions: PermissionMap): Boolean = js.native
  
  @JSImport("expo-permissions/build/CoalescedPermissions", "coalesceStatuses")
  @js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}
