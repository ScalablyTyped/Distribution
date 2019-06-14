package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("GoogleAppsScript.Forms.Alignment")
@js.native
object Alignment extends js.Object {
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Alignment
  
  @js.native
  sealed trait LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Alignment
  
  @js.native
  sealed trait RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Alignment
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Alignment with scala.Double
  ] = js.native
}

