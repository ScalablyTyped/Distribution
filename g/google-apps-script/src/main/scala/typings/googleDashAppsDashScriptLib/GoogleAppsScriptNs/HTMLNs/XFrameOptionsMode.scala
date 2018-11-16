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
  
  val ALLOWALL: ALLOWALL with java.lang.String = js.native
  val DEFAULT: DEFAULT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs.XFrameOptionsMode with java.lang.String
  ] = js.native
}

