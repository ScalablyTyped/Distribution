package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionedLayout extends js.Object

@JSGlobal("GoogleAppsScript.Document.PositionedLayout")
@js.native
object PositionedLayout extends js.Object {
  @js.native
  sealed trait ABOVE_TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout
  
  @js.native
  sealed trait BREAK_BOTH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout
  
  @js.native
  sealed trait BREAK_LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout
  
  @js.native
  sealed trait BREAK_RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout
  
  @js.native
  sealed trait WRAP_TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout
  
  /* 0 */ val ABOVE_TEXT: ABOVE_TEXT with scala.Double = js.native
  /* 1 */ val BREAK_BOTH: BREAK_BOTH with scala.Double = js.native
  /* 2 */ val BREAK_LEFT: BREAK_LEFT with scala.Double = js.native
  /* 3 */ val BREAK_RIGHT: BREAK_RIGHT with scala.Double = js.native
  /* 4 */ val WRAP_TEXT: WRAP_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout with scala.Double
  ] = js.native
}

