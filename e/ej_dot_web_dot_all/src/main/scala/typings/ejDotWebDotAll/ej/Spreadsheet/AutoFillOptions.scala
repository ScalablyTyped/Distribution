package typings.ejDotWebDotAll.ej.Spreadsheet

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
  sealed trait CopyCells extends AutoFillOptions
  
  ///Specifies the FillFormattingOnly property in AutoFillOptions.
  @js.native
  sealed trait FillFormattingOnly extends AutoFillOptions
  
  ///Specifies the FillSeries property in AutoFillOptions.
  @js.native
  sealed trait FillSeries extends AutoFillOptions
  
  ///Specifies the FillWithoutFormatting property in AutoFillOptions.
  @js.native
  sealed trait FillWithoutFormatting extends AutoFillOptions
  
  ///Specifies the FlashFill property in AutoFillOptions.
  @js.native
  sealed trait FlashFill extends AutoFillOptions
  
  /* 0 */ val CopyCells: typings.ejDotWebDotAll.ej.Spreadsheet.AutoFillOptions.CopyCells with Double = js.native
  /* 2 */ val FillFormattingOnly: typings.ejDotWebDotAll.ej.Spreadsheet.AutoFillOptions.FillFormattingOnly with Double = js.native
  /* 1 */ val FillSeries: typings.ejDotWebDotAll.ej.Spreadsheet.AutoFillOptions.FillSeries with Double = js.native
  /* 3 */ val FillWithoutFormatting: typings.ejDotWebDotAll.ej.Spreadsheet.AutoFillOptions.FillWithoutFormatting with Double = js.native
  /* 4 */ val FlashFill: typings.ejDotWebDotAll.ej.Spreadsheet.AutoFillOptions.FlashFill with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFillOptions with Double] = js.native
}

