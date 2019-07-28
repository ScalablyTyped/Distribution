package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): ColumnChartBuilder = js.native
  def setBackgroundColor(cssValue: String): ColumnChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): ColumnChartBuilder = js.native
  def setDataSourceUrl(url: String): ColumnChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): ColumnChartBuilder = js.native
  def setDataTable(table: DataTableSource): ColumnChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ColumnChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): ColumnChartBuilder = js.native
  def setLegendPosition(position: Position): ColumnChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setOption(option: String, value: js.Any): ColumnChartBuilder = js.native
  def setRange(start: Double, end: Double): ColumnChartBuilder = js.native
  def setStacked(): ColumnChartBuilder = js.native
  def setTitle(chartTitle: String): ColumnChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setXAxisTitle(title: String): ColumnChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setYAxisTitle(title: String): ColumnChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def useLogScale(): ColumnChartBuilder = js.native
}

