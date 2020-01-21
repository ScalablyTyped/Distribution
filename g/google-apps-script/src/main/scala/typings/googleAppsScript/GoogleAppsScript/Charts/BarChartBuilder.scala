package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for bar charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build a bar chart. The data is imported from a
  * Google spreadsheet.
  *
  *      // Get sample data from a spreadsheet.
  *      var dataSourceUrl = 'https://docs.google.com/spreadsheet/tq?range=B1%3AC11' +
  *          '&key=0Aq4s9w_HxMs7dHpfX05JdmVSb1FpT21sbXd4NVE3UEE&gid=0&headers=-1';
  *
  *      var chartBuilder = Charts.newBarChart()
  *          .setTitle('Top Grossing Films in US and Canada')
  *          .setXAxisTitle('USD')
  *          .setYAxisTitle('Film')
  *          .setDimensions(600, 500)
  *          .setLegendPosition(Charts.Position.BOTTOM)
  *          .setDataSourceUrl(dataSourceUrl);
  *
  *      var chart = chartBuilder.build();
  */
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

