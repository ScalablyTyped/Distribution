package typings.ejWebAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CFormatHighlightColor with Double] = js.native
  /* 2 */ @js.native
  object GreenFillwithDarkGreenText extends TopLevel[GreenFillwithDarkGreenText with Double]
  
  /* 3 */ @js.native
  object RedFill extends TopLevel[RedFill with Double]
  
  /* 0 */ @js.native
  object RedFillwithDarkRedText extends TopLevel[RedFillwithDarkRedText with Double]
  
  /* 4 */ @js.native
  object RedText extends TopLevel[RedText with Double]
  
  /* 1 */ @js.native
  object YellowFillwithDarkYellowText extends TopLevel[YellowFillwithDarkYellowText with Double]
  
}

