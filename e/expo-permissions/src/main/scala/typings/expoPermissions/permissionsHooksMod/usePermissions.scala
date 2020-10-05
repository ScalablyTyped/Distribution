package typings.expoPermissions.permissionsHooksMod

import typings.expoPermissions.permissionsTypesMod.PermissionResponse
import typings.expoPermissions.permissionsTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-permissions/build/PermissionsHooks", "usePermissions")
@js.native
object usePermissions extends js.Object {
  def apply(`type`: js.Array[PermissionType]): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def apply(`type`: js.Array[PermissionType], options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def apply(`type`: PermissionType): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
  def apply(`type`: PermissionType, options: PermissionsOptions): js.Tuple3[
    js.UndefOr[PermissionResponse], 
    js.Function0[js.Promise[Unit]], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
}

