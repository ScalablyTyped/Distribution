package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
