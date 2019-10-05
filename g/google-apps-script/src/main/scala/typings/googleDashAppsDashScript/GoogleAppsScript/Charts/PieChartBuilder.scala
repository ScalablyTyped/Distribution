package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): PieChartBuilder = js.native
  def set3D(): PieChartBuilder = js.native
  def setBackgroundColor(cssValue: String): PieChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): PieChartBuilder = js.native
  def setDataSourceUrl(url: String): PieChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder = js.native
  def setDataTable(table: DataTableSource): PieChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder = js.native
  def setDimensions(width: Integer, height: Integer): PieChartBuilder = js.native
  def setLegendPosition(position: Position): PieChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
  def setOption(option: String, value: js.Any): PieChartBuilder = js.native
  def setTitle(chartTitle: String): PieChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
}

