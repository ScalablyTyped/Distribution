package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): BarChartBuilder = js.native
  def reverseDirection(): BarChartBuilder = js.native
  def setBackgroundColor(cssValue: String): BarChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): BarChartBuilder = js.native
  def setDataSourceUrl(url: String): BarChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): BarChartBuilder = js.native
  def setDataTable(table: DataTableSource): BarChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): BarChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): BarChartBuilder = js.native
  def setLegendPosition(position: Position): BarChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setOption(option: String, value: js.Any): BarChartBuilder = js.native
  def setRange(start: Double, end: Double): BarChartBuilder = js.native
  def setStacked(): BarChartBuilder = js.native
  def setTitle(chartTitle: String): BarChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setXAxisTitle(title: String): BarChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setYAxisTitle(title: String): BarChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def useLogScale(): BarChartBuilder = js.native
}

