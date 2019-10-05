package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionedLayout extends js.Object

@JSGlobal("GoogleAppsScript.Document.PositionedLayout")
@js.native
object PositionedLayout extends js.Object {
  @js.native
  sealed trait ABOVE_TEXT extends PositionedLayout
  
  @js.native
  sealed trait BREAK_BOTH extends PositionedLayout
  
  @js.native
  sealed trait BREAK_LEFT extends PositionedLayout
  
  @js.native
  sealed trait BREAK_RIGHT extends PositionedLayout
  
  @js.native
  sealed trait WRAP_TEXT extends PositionedLayout
  
  /* 0 */ val ABOVE_TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.PositionedLayout.ABOVE_TEXT with Double = js.native
  /* 1 */ val BREAK_BOTH: typings.googleDashAppsDashScript.GoogleAppsScript.Document.PositionedLayout.BREAK_BOTH with Double = js.native
  /* 2 */ val BREAK_LEFT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.PositionedLayout.BREAK_LEFT with Double = js.native
  /* 3 */ val BREAK_RIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.PositionedLayout.BREAK_RIGHT with Double = js.native
  /* 4 */ val WRAP_TEXT: typings.googleDashAppsDashScript.GoogleAppsScript.Document.PositionedLayout.WRAP_TEXT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionedLayout with Double] = js.native
}

