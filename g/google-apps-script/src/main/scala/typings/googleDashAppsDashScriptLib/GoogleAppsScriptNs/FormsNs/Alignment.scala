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
  
  val CENTER: CENTER with java.lang.String = js.native
  val LEFT: LEFT with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs.Alignment with java.lang.String
  ] = js.native
}

