package typings.ejDotWebDotAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomCellType extends js.Object

@JSGlobal("ej.Spreadsheet.CustomCellType")
@js.native
object CustomCellType extends js.Object {
  ///To insert the Button in cell.
  @js.native
  sealed trait Button extends CustomCellType
  
  ///To insert the Checkbox in cell.
  @js.native
  sealed trait CheckBox extends CustomCellType
  
  ///To insert the Datepicker in cell.
  @js.native
  sealed trait DatePicker extends CustomCellType
  
  ///To insert the Dropdownlist in cell.
  @js.native
  sealed trait DropDownList extends CustomCellType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomCellType with Double] = js.native
  /* 0 */ @js.native
  object Button
    extends TopLevel[typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.Button with Double]
  
  /* 1 */ @js.native
  object CheckBox
    extends TopLevel[typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.CheckBox with Double]
  
  /* 2 */ @js.native
  object DatePicker
    extends TopLevel[typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.DatePicker with Double]
  
  /* 3 */ @js.native
  object DropDownList
    extends TopLevel[typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.DropDownList with Double]
  
}

