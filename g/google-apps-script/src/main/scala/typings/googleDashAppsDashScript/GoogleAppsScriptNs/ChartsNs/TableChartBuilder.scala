package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableChartBuilder extends js.Object {
  def build(): Chart = js.native
  def enablePaging(enablePaging: Boolean): TableChartBuilder = js.native
  def enablePaging(pageSize: Integer): TableChartBuilder = js.native
  def enablePaging(pageSize: Integer, startPage: Integer): TableChartBuilder = js.native
  def enableRtlTable(rtlEnabled: Boolean): TableChartBuilder = js.native
  def enableSorting(enableSorting: Boolean): TableChartBuilder = js.native
  def setDataSourceUrl(url: String): TableChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): TableChartBuilder = js.native
  def setDataTable(table: DataTableSource): TableChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): TableChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): TableChartBuilder = js.native
  def setFirstRowNumber(number: Integer): TableChartBuilder = js.native
  def setInitialSortingAscending(column: Integer): TableChartBuilder = js.native
  def setInitialSortingDescending(column: Integer): TableChartBuilder = js.native
  def setOption(option: String, value: js.Any): TableChartBuilder = js.native
  def showRowNumberColumn(showRowNumber: Boolean): TableChartBuilder = js.native
  def useAlternatingRowStyle(alternate: Boolean): TableChartBuilder = js.native
}

