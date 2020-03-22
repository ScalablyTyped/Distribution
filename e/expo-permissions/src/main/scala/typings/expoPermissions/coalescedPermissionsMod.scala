package typings.expoPermissions

import typings.expoPermissions.permissionsTypesMod.PermissionMap
import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import typings.unimodulesPermissionsInterface.mod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object coalescedPermissionsMod extends js.Object {
  def coalesceCanAskAgain(permissions: PermissionMap): Boolean = js.native
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  def coalesceGranted(permissions: PermissionMap): Boolean = js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}

