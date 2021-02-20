package typings.gijgo

import typings.gijgo.Types.Checkbox
import typings.gijgo.Types.CheckboxSettings
import typings.gijgo.Types.DatePicker
import typings.gijgo.Types.DatePickerSettings
import typings.gijgo.Types.DateTimePicker
import typings.gijgo.Types.DateTimePickerSettings
import typings.gijgo.Types.Dialog
import typings.gijgo.Types.DialogSettings
import typings.gijgo.Types.DropDown
import typings.gijgo.Types.DropDownSettings
import typings.gijgo.Types.Editor
import typings.gijgo.Types.EditorSettings
import typings.gijgo.Types.Grid
import typings.gijgo.Types.GridSettings
import typings.gijgo.Types.Slider
import typings.gijgo.Types.SliderSettings
import typings.gijgo.Types.TimePicker
import typings.gijgo.Types.TimePickerSettings
import typings.gijgo.Types.Tree
import typings.gijgo.Types.TreeSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
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
