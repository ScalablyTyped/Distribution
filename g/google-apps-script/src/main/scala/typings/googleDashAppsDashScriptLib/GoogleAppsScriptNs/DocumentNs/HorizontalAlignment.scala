package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Document.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment
  
  @js.native
  sealed trait JUSTIFY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment
  
  @js.native
  sealed trait LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment
  
  @js.native
  sealed trait RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment
  
  val CENTER: CENTER with java.lang.String = js.native
  val JUSTIFY: JUSTIFY with java.lang.String = js.native
  val LEFT: LEFT with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment with java.lang.String
  ] = js.native
}

