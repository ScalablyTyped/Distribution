package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InstallationSource extends js.Object

@JSGlobal("GoogleAppsScript.Script.InstallationSource")
@js.native
object InstallationSource extends js.Object {
  @js.native
  sealed trait APPS_MARKETPLACE_DOMAIN_ADD_ON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.InstallationSource
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.InstallationSource
  
  @js.native
  sealed trait WEB_STORE_ADD_ON
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.InstallationSource
  
  /* 0 */ val APPS_MARKETPLACE_DOMAIN_ADD_ON: APPS_MARKETPLACE_DOMAIN_ADD_ON with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val WEB_STORE_ADD_ON: WEB_STORE_ADD_ON with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs.InstallationSource with scala.Double
  ] = js.native
}

