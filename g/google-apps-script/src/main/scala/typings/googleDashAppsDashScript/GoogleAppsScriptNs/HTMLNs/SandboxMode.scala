package typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SandboxMode extends js.Object

@JSGlobal("GoogleAppsScript.HTML.SandboxMode")
@js.native
object SandboxMode extends js.Object {
  @js.native
  sealed trait EMULATED extends SandboxMode
  
  @js.native
  sealed trait IFRAME extends SandboxMode
  
  @js.native
  sealed trait NATIVE extends SandboxMode
  
  /* 0 */ val EMULATED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs.SandboxMode.EMULATED with Double = js.native
  /* 1 */ val IFRAME: typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs.SandboxMode.IFRAME with Double = js.native
  /* 2 */ val NATIVE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.HTMLNs.SandboxMode.NATIVE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SandboxMode with Double] = js.native
}

