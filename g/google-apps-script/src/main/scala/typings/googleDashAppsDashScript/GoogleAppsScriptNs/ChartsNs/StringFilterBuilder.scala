package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringFilterBuilder extends js.Object {
  def build(): Control = js.native
  def setCaseSensitive(caseSensitive: Boolean): StringFilterBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): StringFilterBuilder = js.native
  def setDataTable(table: DataTableSource): StringFilterBuilder = js.native
  def setFilterColumnIndex(columnIndex: Integer): StringFilterBuilder = js.native
  def setFilterColumnLabel(columnLabel: String): StringFilterBuilder = js.native
  def setLabel(label: String): StringFilterBuilder = js.native
  def setLabelSeparator(labelSeparator: String): StringFilterBuilder = js.native
  def setLabelStacking(orientation: Orientation): StringFilterBuilder = js.native
  def setMatchType(matchType: MatchType): StringFilterBuilder = js.native
  def setRealtimeTrigger(realtimeTrigger: Boolean): StringFilterBuilder = js.native
}

