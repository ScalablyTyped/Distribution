package typings.gijgo

import typings.gijgo.TypesNs.Checkbox
import typings.gijgo.TypesNs.CheckboxSettings
import typings.gijgo.TypesNs.DatePicker
import typings.gijgo.TypesNs.DatePickerSettings
import typings.gijgo.TypesNs.DateTimePicker
import typings.gijgo.TypesNs.DateTimePickerSettings
import typings.gijgo.TypesNs.Dialog
import typings.gijgo.TypesNs.DialogSettings
import typings.gijgo.TypesNs.DropDown
import typings.gijgo.TypesNs.DropDownSettings
import typings.gijgo.TypesNs.Editor
import typings.gijgo.TypesNs.EditorSettings
import typings.gijgo.TypesNs.Grid
import typings.gijgo.TypesNs.GridSettings
import typings.gijgo.TypesNs.Slider
import typings.gijgo.TypesNs.SliderSettings
import typings.gijgo.TypesNs.TimePicker
import typings.gijgo.TypesNs.TimePickerSettings
import typings.gijgo.TypesNs.Tree
import typings.gijgo.TypesNs.TreeSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def checkbox(settings: CheckboxSettings): Checkbox = js.native
  def datepicker(settings: DatePickerSettings): DatePicker = js.native
  def datetimepicker(settings: DateTimePickerSettings): DateTimePicker = js.native
  def dialog(settings: DialogSettings): Dialog = js.native
  def dropdown(settings: DropDownSettings): DropDown = js.native
  def editor(settings: EditorSettings): Editor = js.native
  def grid(settings: GridSettings[_]): Grid[_, _] = js.native
  @JSName("grid")
  def grid_Entity[Entity](settings: GridSettings[Entity]): Grid[Entity, _] = js.native
  @JSName("grid")
  def grid_EntityParams[Entity, Params](settings: GridSettings[Entity]): Grid[Entity, Params] = js.native
  def slider(settings: SliderSettings): Slider = js.native
  def timepicker(settings: TimePickerSettings): TimePicker = js.native
  def tree(settings: TreeSettings): Tree = js.native
}

