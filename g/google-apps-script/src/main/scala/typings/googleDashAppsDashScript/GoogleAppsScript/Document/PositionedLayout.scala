package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionedLayout extends js.Object

/**
  * An enumeration that specifies how to lay out a PositionedImage in relation to surrounding
  * text.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionedLayout with Double] = js.native
  /* 0 */ @js.native
  object ABOVE_TEXT extends TopLevel[ABOVE_TEXT with Double]
  
  /* 1 */ @js.native
  object BREAK_BOTH extends TopLevel[BREAK_BOTH with Double]
  
  /* 2 */ @js.native
  object BREAK_LEFT extends TopLevel[BREAK_LEFT with Double]
  
  /* 3 */ @js.native
  object BREAK_RIGHT extends TopLevel[BREAK_RIGHT with Double]
  
  /* 4 */ @js.native
  object WRAP_TEXT extends TopLevel[WRAP_TEXT with Double]
  
}

