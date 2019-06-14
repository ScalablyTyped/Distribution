package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthorizationStatus extends js.Object

@JSGlobal("GoogleAppsScript.Script.AuthorizationStatus")
@js.native
object AuthorizationStatus extends js.Object {
  @js.native
  sealed trait NOT_REQUIRED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthorizationStatus
  
  @js.native
  sealed trait REQUIRED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthorizationStatus
  
  /* 1 */ val NOT_REQUIRED: NOT_REQUIRED with scala.Double = js.native
  /* 0 */ val REQUIRED: REQUIRED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthorizationStatus with scala.Double
  ] = js.native
}

