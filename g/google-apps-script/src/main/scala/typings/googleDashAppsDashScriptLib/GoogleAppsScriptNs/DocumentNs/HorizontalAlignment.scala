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
  
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val JUSTIFY: JUSTIFY with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.HorizontalAlignment with scala.Double
  ] = js.native
}

