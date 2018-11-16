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
  
  val CopyCells: CopyCells with java.lang.String = js.native
  val FillFormattingOnly: FillFormattingOnly with java.lang.String = js.native
  val FillSeries: FillSeries with java.lang.String = js.native
  val FillWithoutFormatting: FillWithoutFormatting with java.lang.String = js.native
  val FlashFill: FlashFill with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.AutoFillOptions with java.lang.String] = js.native
}

