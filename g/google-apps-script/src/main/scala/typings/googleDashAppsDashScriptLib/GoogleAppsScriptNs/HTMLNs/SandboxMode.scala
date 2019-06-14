package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SandboxMode extends js.Object

@JSGlobal("GoogleAppsScript.HTML.SandboxMode")
@js.native
object SandboxMode extends js.Object {
  @js.native
  sealed trait EMULATED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.SandboxMode
  
  @js.native
  sealed trait IFRAME
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.SandboxMode
  
  @js.native
  sealed trait NATIVE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.SandboxMode
  
  /* 0 */ val EMULATED: EMULATED with scala.Double = js.native
  /* 1 */ val IFRAME: IFRAME with scala.Double = js.native
  /* 2 */ val NATIVE: NATIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.SandboxMode with scala.Double
  ] = js.native
}

