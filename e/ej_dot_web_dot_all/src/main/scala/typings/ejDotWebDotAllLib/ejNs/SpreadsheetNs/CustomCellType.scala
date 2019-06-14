package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

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
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType
  
  ///To insert the Checkbox in cell.
  @js.native
  sealed trait CheckBox
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType
  
  ///To insert the Datepicker in cell.
  @js.native
  sealed trait DatePicker
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType
  
  ///To insert the Dropdownlist in cell.
  @js.native
  sealed trait DropDownList
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType
  
  /* 0 */ val Button: Button with scala.Double = js.native
  /* 1 */ val CheckBox: CheckBox with scala.Double = js.native
  /* 2 */ val DatePicker: DatePicker with scala.Double = js.native
  /* 3 */ val DropDownList: DropDownList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType with scala.Double] = js.native
}

