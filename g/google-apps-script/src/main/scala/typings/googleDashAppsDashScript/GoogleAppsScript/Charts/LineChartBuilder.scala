package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): LineChartBuilder = js.native
  def setBackgroundColor(cssValue: String): LineChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): LineChartBuilder = js.native
  def setCurveStyle(style: CurveStyle): LineChartBuilder = js.native
  def setDataSourceUrl(url: String): LineChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): LineChartBuilder = js.native
  def setDataTable(table: DataTableSource): LineChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): LineChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): LineChartBuilder = js.native
  def setLegendPosition(position: Position): LineChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def setOption(option: String, value: js.Any): LineChartBuilder = js.native
  def setPointStyle(style: PointStyle): LineChartBuilder = js.native
  def setRange(start: Double, end: Double): LineChartBuilder = js.native
  def setTitle(chartTitle: String): LineChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def setXAxisTitle(title: String): LineChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def setYAxisTitle(title: String): LineChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): LineChartBuilder = js.native
  def useLogScale(): LineChartBuilder = js.native
}

