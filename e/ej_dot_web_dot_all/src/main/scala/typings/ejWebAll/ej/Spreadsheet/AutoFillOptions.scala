package typings.ejWebAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoFillOptions with Double] = js.native
  /* 0 */ @js.native
  object CopyCells extends TopLevel[CopyCells with Double]
  
  /* 2 */ @js.native
  object FillFormattingOnly extends TopLevel[FillFormattingOnly with Double]
  
  /* 1 */ @js.native
  object FillSeries extends TopLevel[FillSeries with Double]
  
  /* 3 */ @js.native
  object FillWithoutFormatting extends TopLevel[FillWithoutFormatting with Double]
  
  /* 4 */ @js.native
  object FlashFill extends TopLevel[FlashFill with Double]
  
}

