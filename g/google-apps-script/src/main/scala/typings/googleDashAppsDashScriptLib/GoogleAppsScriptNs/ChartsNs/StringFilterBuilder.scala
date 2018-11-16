package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringFilterBuilder extends js.Object {
  def build(): Control = js.native
  def setCaseSensitive(caseSensitive: scala.Boolean): StringFilterBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): StringFilterBuilder = js.native
  def setDataTable(table: DataTableSource): StringFilterBuilder = js.native
  def setFilterColumnIndex(columnIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): StringFilterBuilder = js.native
  def setFilterColumnLabel(columnLabel: java.lang.String): StringFilterBuilder = js.native
  def setLabel(label: java.lang.String): StringFilterBuilder = js.native
  def setLabelSeparator(labelSeparator: java.lang.String): StringFilterBuilder = js.native
  def setLabelStacking(orientation: Orientation): StringFilterBuilder = js.native
  def setMatchType(matchType: MatchType): StringFilterBuilder = js.native
  def setRealtimeTrigger(realtimeTrigger: scala.Boolean): StringFilterBuilder = js.native
}

