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
  
  val EMULATED: EMULATED with java.lang.String = js.native
  val IFRAME: IFRAME with java.lang.String = js.native
  val NATIVE: NATIVE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.SandboxMode with java.lang.String
  ] = js.native
}

