package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): AreaChartBuilder = js.native
  def setBackgroundColor(cssValue: String): AreaChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): AreaChartBuilder = js.native
  def setDataSourceUrl(url: String): AreaChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): AreaChartBuilder = js.native
  def setDataTable(table: DataTableSource): AreaChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): AreaChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): AreaChartBuilder = js.native
  def setLegendPosition(position: Position): AreaChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setOption(option: String, value: js.Any): AreaChartBuilder = js.native
  def setPointStyle(style: PointStyle): AreaChartBuilder = js.native
  def setRange(start: Double, end: Double): AreaChartBuilder = js.native
  def setStacked(): AreaChartBuilder = js.native
  def setTitle(chartTitle: String): AreaChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setXAxisTitle(title: String): AreaChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setYAxisTitle(title: String): AreaChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def useLogScale(): AreaChartBuilder = js.native
}

