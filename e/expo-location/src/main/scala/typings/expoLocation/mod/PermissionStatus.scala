package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "PermissionStatus")
@js.native
object PermissionStatus extends js.Object {
  /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
  /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
  /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
}

