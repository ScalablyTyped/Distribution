package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AuthMode extends js.Object

@JSGlobal("GoogleAppsScript.Script.AuthMode")
@js.native
object AuthMode extends js.Object {
  @js.native
  sealed trait CUSTOM_FUNCTION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode
  
  @js.native
  sealed trait FULL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode
  
  @js.native
  sealed trait LIMITED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode
  
  /* 1 */ val CUSTOM_FUNCTION: CUSTOM_FUNCTION with scala.Double = js.native
  /* 3 */ val FULL: FULL with scala.Double = js.native
  /* 2 */ val LIMITED: LIMITED with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode with scala.Double
  ] = js.native
}

