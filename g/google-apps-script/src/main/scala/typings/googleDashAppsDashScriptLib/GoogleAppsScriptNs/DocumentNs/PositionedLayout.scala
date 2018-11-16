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
  
  val ABOVE_TEXT: ABOVE_TEXT with java.lang.String = js.native
  val BREAK_BOTH: BREAK_BOTH with java.lang.String = js.native
  val BREAK_LEFT: BREAK_LEFT with java.lang.String = js.native
  val BREAK_RIGHT: BREAK_RIGHT with java.lang.String = js.native
  val WRAP_TEXT: WRAP_TEXT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.PositionedLayout with java.lang.String
  ] = js.native
}

