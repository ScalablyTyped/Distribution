package typings.expoDashPermissions.buildPermissionsDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionStatus extends js.Object

@JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
@js.native
object PermissionStatus extends js.Object {
  @js.native
  sealed trait DENIED extends PermissionStatus
  
  @js.native
  sealed trait GRANTED extends PermissionStatus
  
  @js.native
  sealed trait UNDETERMINED extends PermissionStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PermissionStatus with String] = js.native
  /* "denied" */ @js.native
  object DENIED extends TopLevel[DENIED with String]
  
  /* "granted" */ @js.native
  object GRANTED extends TopLevel[GRANTED with String]
  
  /* "undetermined" */ @js.native
  object UNDETERMINED extends TopLevel[UNDETERMINED with String]
  
}

