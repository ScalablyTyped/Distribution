package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderStyle extends js.Object

/**
  * Styles that can be set on a range using Range.setBorder(top, left, bottom, right, vertical, horizontal, color, style).
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
@js.native
object BorderStyle extends js.Object {
  @js.native
  sealed trait DASHED extends BorderStyle
  
  @js.native
  sealed trait DOTTED extends BorderStyle
  
  @js.native
  sealed trait DOUBLE extends BorderStyle
  
  @js.native
  sealed trait SOLID extends BorderStyle
  
  @js.native
  sealed trait SOLID_MEDIUM extends BorderStyle
  
  @js.native
  sealed trait SOLID_THICK extends BorderStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BorderStyle with Double] = js.native
  /* 1 */ @js.native
  object DASHED extends TopLevel[DASHED with Double]
  
  /* 0 */ @js.native
  object DOTTED extends TopLevel[DOTTED with Double]
  
  /* 5 */ @js.native
  object DOUBLE extends TopLevel[DOUBLE with Double]
  
  /* 2 */ @js.native
  object SOLID extends TopLevel[SOLID with Double]
  
  /* 3 */ @js.native
  object SOLID_MEDIUM extends TopLevel[SOLID_MEDIUM with Double]
  
  /* 4 */ @js.native
  object SOLID_THICK extends TopLevel[SOLID_THICK with Double]
  
}

