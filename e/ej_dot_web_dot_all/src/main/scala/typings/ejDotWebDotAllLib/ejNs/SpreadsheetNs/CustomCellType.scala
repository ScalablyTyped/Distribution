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
  
  val Button: Button with java.lang.String = js.native
  val CheckBox: CheckBox with java.lang.String = js.native
  val DatePicker: DatePicker with java.lang.String = js.native
  val DropDownList: DropDownList with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.CustomCellType with java.lang.String] = js.native
}

