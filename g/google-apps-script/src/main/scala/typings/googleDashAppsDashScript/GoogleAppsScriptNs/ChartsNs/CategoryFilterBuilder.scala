package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryFilterBuilder extends js.Object {
  def build(): Control = js.native
  def setAllowMultiple(allowMultiple: Boolean): CategoryFilterBuilder = js.native
  def setAllowNone(allowNone: Boolean): CategoryFilterBuilder = js.native
  def setAllowTyping(allowTyping: Boolean): CategoryFilterBuilder = js.native
  def setCaption(caption: String): CategoryFilterBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): CategoryFilterBuilder = js.native
  def setDataTable(table: DataTableSource): CategoryFilterBuilder = js.native
  def setFilterColumnIndex(columnIndex: Integer): CategoryFilterBuilder = js.native
  def setFilterColumnLabel(columnLabel: String): CategoryFilterBuilder = js.native
  def setLabel(label: String): CategoryFilterBuilder = js.native
  def setLabelSeparator(labelSeparator: String): CategoryFilterBuilder = js.native
  def setLabelStacking(orientation: Orientation): CategoryFilterBuilder = js.native
  def setSelectedValuesLayout(layout: PickerValuesLayout): CategoryFilterBuilder = js.native
  def setSortValues(sortValues: Boolean): CategoryFilterBuilder = js.native
  def setValues(values: js.Array[String]): CategoryFilterBuilder = js.native
}

