package typings.ejDotWebDotAll.ej.Spreadsheet

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
  
  /* 0 */ val Button: typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.Button with Double = js.native
  /* 1 */ val CheckBox: typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.CheckBox with Double = js.native
  /* 2 */ val DatePicker: typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.DatePicker with Double = js.native
  /* 3 */ val DropDownList: typings.ejDotWebDotAll.ej.Spreadsheet.CustomCellType.DropDownList with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomCellType with Double] = js.native
}

