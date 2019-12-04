package typings.expoDashPermissions

import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionExpiration
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionMap
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object buildCoalescedPermissionsMod extends js.Object {
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}

