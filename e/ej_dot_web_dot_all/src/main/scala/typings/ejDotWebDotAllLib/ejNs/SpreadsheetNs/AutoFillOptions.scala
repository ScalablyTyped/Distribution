package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoFillOptions extends js.Object

@JSGlobal("ej.Spreadsheet.AutoFillOptions")
@js.native
object AutoFillOptions extends js.Object {
  ///Specifies the CopyCells property in AutoFillOptions.
  @js.native
  sealed trait CopyCells
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions
  
  ///Specifies the FillFormattingOnly property in AutoFillOptions.
  @js.native
  sealed trait FillFormattingOnly
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions
  
  ///Specifies the FillSeries property in AutoFillOptions.
  @js.native
  sealed trait FillSeries
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions
  
  ///Specifies the FillWithoutFormatting property in AutoFillOptions.
  @js.native
  sealed trait FillWithoutFormatting
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions
  
  ///Specifies the FlashFill property in AutoFillOptions.
  @js.native
  sealed trait FlashFill
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions
  
  /* 0 */ val CopyCells: CopyCells with scala.Double = js.native
  /* 2 */ val FillFormattingOnly: FillFormattingOnly with scala.Double = js.native
  /* 1 */ val FillSeries: FillSeries with scala.Double = js.native
  /* 3 */ val FillWithoutFormatting: FillWithoutFormatting with scala.Double = js.native
  /* 4 */ val FlashFill: FlashFill with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions with scala.Double] = js.native
}

