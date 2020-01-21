package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for area charts. For more details, see the Google Charts documentation.
  *
  * Here is an example that shows how to build an area chart.
  *
  *       // Create a data table with some sample data.
  *       var sampleData = Charts.newDataTable()
  *           .addColumn(Charts.ColumnType.STRING, "Month")
  *           .addColumn(Charts.ColumnType.NUMBER, "Dining")
  *           .addColumn(Charts.ColumnType.NUMBER, "Total")
  *           .addRow(["Jan", 60, 520])
  *           .addRow(["Feb", 50, 430])
  *           .addRow(["Mar", 53, 440])
  *           .addRow(["Apr", 70, 410])
  *           .addRow(["May", 80, 390])
  *           .addRow(["Jun", 60, 500])
  *           .addRow(["Jul", 100, 450])
  *           .addRow(["Aug", 140, 431])
  *           .addRow(["Sep", 75, 488])
  *           .addRow(["Oct", 70, 521])
  *           .addRow(["Nov", 58, 388])
  *           .addRow(["Dec", 63, 400])
  *           .build();
  *
  *       var chart = Charts.newAreaChart()
  *           .setTitle('Yearly Spending')
  *           .setXAxisTitle('Month')
  *           .setYAxisTitle('Spending (USD)')
  *           .setDimensions(600, 500)
  *           .setStacked()
  *           .setColors(['red', 'green'])
  *           .setDataTable(sampleData)
  *           .build();
  */
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

