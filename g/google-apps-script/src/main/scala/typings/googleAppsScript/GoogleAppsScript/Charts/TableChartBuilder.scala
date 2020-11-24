package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for table charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build a table chart. The data is imported from a Google spreadsheet.
  *
  *     // Get sample data from a spreadsheet.
  *     var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=A1%3AF' +
  *         '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=4&headers=-1';
  *
  *     var chartBuilder = Charts.newTableChart()
  *         .setDimensions(600, 500)
  *         .enablePaging(20)
  *         .setDataSourceUrl(dataSourceUrl);
  *
  *     var chart = chartBuilder.build();
  */
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
