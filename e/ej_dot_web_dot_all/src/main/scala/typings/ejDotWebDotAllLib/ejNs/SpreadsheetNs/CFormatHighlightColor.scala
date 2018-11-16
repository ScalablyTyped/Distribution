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
  
  val GreenFillwithDarkGreenText: GreenFillwithDarkGreenText with java.lang.String = js.native
  val RedFill: RedFill with java.lang.String = js.native
  val RedFillwithDarkRedText: RedFillwithDarkRedText with java.lang.String = js.native
  val RedText: RedText with java.lang.String = js.native
  val YellowFillwithDarkYellowText: YellowFillwithDarkYellowText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CFormatHighlightColor with java.lang.String] = js.native
}

