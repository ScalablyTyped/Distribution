package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CFormatHighlightColor extends js.Object

@JSGlobal("ej.Spreadsheet.CFormatHighlightColor")
@js.native
object CFormatHighlightColor extends js.Object {
  ///Highlights green with dark green text color.
  @js.native
  sealed trait GreenFillwithDarkGreenText extends CFormatHighlightColor
  
  ///Highlights with red fill.
  @js.native
  sealed trait RedFill extends CFormatHighlightColor
  
  ///Highlights red with dark red text color.
  @js.native
  sealed trait RedFillwithDarkRedText extends CFormatHighlightColor
  
  ///Highlights with red text.
  @js.native
  sealed trait RedText extends CFormatHighlightColor
  
  ///Highlights yellow with dark yellow text color.
  @js.native
  sealed trait YellowFillwithDarkYellowText extends CFormatHighlightColor
  
  /* 2 */ val GreenFillwithDarkGreenText: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatHighlightColor.GreenFillwithDarkGreenText with Double = js.native
  /* 3 */ val RedFill: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatHighlightColor.RedFill with Double = js.native
  /* 0 */ val RedFillwithDarkRedText: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatHighlightColor.RedFillwithDarkRedText with Double = js.native
  /* 4 */ val RedText: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatHighlightColor.RedText with Double = js.native
  /* 1 */ val YellowFillwithDarkYellowText: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.CFormatHighlightColor.YellowFillwithDarkYellowText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFormatHighlightColor with Double] = js.native
}

