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
  
  val NOT_REQUIRED: NOT_REQUIRED with java.lang.String = js.native
  val REQUIRED: REQUIRED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthorizationStatus with java.lang.String
  ] = js.native
}

