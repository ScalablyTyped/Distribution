package typings
package gijgoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def checkbox(settings: gijgoLib.TypesNs.CheckboxSettings): gijgoLib.TypesNs.Checkbox = js.native
  def datepicker(settings: gijgoLib.TypesNs.DatePickerSettings): gijgoLib.TypesNs.DatePicker = js.native
  def datetimepicker(settings: gijgoLib.TypesNs.DateTimePickerSettings): gijgoLib.TypesNs.DateTimePicker = js.native
  def dialog(settings: gijgoLib.TypesNs.DialogSettings): gijgoLib.TypesNs.Dialog = js.native
  def dropdown(settings: gijgoLib.TypesNs.DropDownSettings): gijgoLib.TypesNs.DropDown = js.native
  def editor(settings: gijgoLib.TypesNs.EditorSettings): gijgoLib.TypesNs.Editor = js.native
  def grid(settings: gijgoLib.TypesNs.GridSettings[_]): gijgoLib.TypesNs.Grid[_, _] = js.native
  @JSName("grid")
  def grid_Entity[Entity](settings: gijgoLib.TypesNs.GridSettings[Entity]): gijgoLib.TypesNs.Grid[Entity, _] = js.native
  @JSName("grid")
  def grid_EntityParams[Entity, Params](settings: gijgoLib.TypesNs.GridSettings[Entity]): gijgoLib.TypesNs.Grid[Entity, Params] = js.native
  def slider(settings: gijgoLib.TypesNs.SliderSettings): gijgoLib.TypesNs.Slider = js.native
  def timepicker(settings: gijgoLib.TypesNs.TimePickerSettings): gijgoLib.TypesNs.TimePicker = js.native
  def tree(settings: gijgoLib.TypesNs.TreeSettings): gijgoLib.TypesNs.Tree = js.native
}

