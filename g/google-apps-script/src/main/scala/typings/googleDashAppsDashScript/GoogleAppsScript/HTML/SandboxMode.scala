package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SandboxMode extends js.Object

/**
  * An enum representing the sandbox modes that can be used for client-side HtmlService
  * scripts. These values can be accessed from HtmlService.SandboxMode, and set by calling
  * HtmlOutput.setSandboxMode(mode).
  *
  * The NATIVE and EMULATED modes were deprecated on October 13, 2015 and both are now sunset. Only
  * IFRAME mode is now supported.
  *
  * To protect users from being served malicious HTML or JavaScript, client-side code served from
  * HTML service executes in a security sandbox that imposes restrictions on the code. The method
  * HtmlOutput.setSandboxMode(mode) previously allowed script authors to choose
  * between different versions of the sandbox, but now has no effect. For more information, see the
  * guide to restrictions in HTML service.
  *
  * The IFRAME mode imposes many fewer restrictions than the other sandbox modes and runs
  * fastest, but does not work at all in certain older browsers, including Internet Explorer 9. The
  * sandbox mode can also be read in a client-side script by inspecting google.script.sandbox.mode. Note that this property returns the actual mode on the client, which
  * may differ from the mode requested on the server if the requested mode is not supported in the
  * user's browser.
  *
  *     <!-- Read the sandbox mode (in a client-side script). -->
  *     <script>
  *       alert(google.script.sandbox.mode);
  *     </script>
  */
@JSGlobal("GoogleAppsScript.HTML.SandboxMode")
@js.native
object SandboxMode extends js.Object {
  @js.native
  sealed trait EMULATED extends SandboxMode
  
  @js.native
  sealed trait IFRAME extends SandboxMode
  
  @js.native
  sealed trait NATIVE extends SandboxMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SandboxMode with Double] = js.native
  /* 0 */ @js.native
  object EMULATED extends TopLevel[EMULATED with Double]
  
  /* 1 */ @js.native
  object IFRAME extends TopLevel[IFRAME with Double]
  
  /* 2 */ @js.native
  object NATIVE extends TopLevel[NATIVE with Double]
  
}

