package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
