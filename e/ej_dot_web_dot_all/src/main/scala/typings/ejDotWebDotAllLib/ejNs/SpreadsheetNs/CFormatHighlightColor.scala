package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  sealed trait GreenFillwithDarkGreenText
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor
  
  ///Highlights with red fill.
  @js.native
  sealed trait RedFill
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor
  
  ///Highlights red with dark red text color.
  @js.native
  sealed trait RedFillwithDarkRedText
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor
  
  ///Highlights with red text.
  @js.native
  sealed trait RedText
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor
  
  ///Highlights yellow with dark yellow text color.
  @js.native
  sealed trait YellowFillwithDarkYellowText
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor
  
  /* 2 */ val GreenFillwithDarkGreenText: GreenFillwithDarkGreenText with scala.Double = js.native
  /* 3 */ val RedFill: RedFill with scala.Double = js.native
  /* 0 */ val RedFillwithDarkRedText: RedFillwithDarkRedText with scala.Double = js.native
  /* 4 */ val RedText: RedText with scala.Double = js.native
  /* 1 */ val YellowFillwithDarkYellowText: YellowFillwithDarkYellowText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor with scala.Double] = js.native
}

