package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
