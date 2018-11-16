package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableChartBuilder extends js.Object {
  def build(): Chart = js.native
  def enablePaging(enablePaging: scala.Boolean): TableChartBuilder = js.native
  def enablePaging(pageSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableChartBuilder = js.native
  def enablePaging(
    pageSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    startPage: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TableChartBuilder = js.native
  def enableRtlTable(rtlEnabled: scala.Boolean): TableChartBuilder = js.native
  def enableSorting(enableSorting: scala.Boolean): TableChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): TableChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): TableChartBuilder = js.native
  def setDataTable(table: DataTableSource): TableChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): TableChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TableChartBuilder = js.native
  def setFirstRowNumber(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableChartBuilder = js.native
  def setInitialSortingAscending(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableChartBuilder = js.native
  def setInitialSortingDescending(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): TableChartBuilder = js.native
  def showRowNumberColumn(showRowNumber: scala.Boolean): TableChartBuilder = js.native
  def useAlternatingRowStyle(alternate: scala.Boolean): TableChartBuilder = js.native
}

