package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XFrameOptionsMode extends js.Object

@JSGlobal("GoogleAppsScript.HTML.XFrameOptionsMode")
@js.native
object XFrameOptionsMode extends js.Object {
  @js.native
  sealed trait ALLOWALL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.XFrameOptionsMode
  
  @js.native
  sealed trait DEFAULT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.XFrameOptionsMode
  
  /* 0 */ val ALLOWALL: ALLOWALL with scala.Double = js.native
  /* 1 */ val DEFAULT: DEFAULT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.XFrameOptionsMode with scala.Double
  ] = js.native
}

