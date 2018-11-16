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
  
  val CUSTOM_FUNCTION: CUSTOM_FUNCTION with java.lang.String = js.native
  val FULL: FULL with java.lang.String = js.native
  val LIMITED: LIMITED with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.AuthMode with java.lang.String
  ] = js.native
}

