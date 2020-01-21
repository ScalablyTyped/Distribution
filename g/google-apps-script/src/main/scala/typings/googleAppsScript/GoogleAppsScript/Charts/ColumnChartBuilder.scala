package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for column charts. For more details, see the Google Charts documentation.
  *
  * This example shows how to create a column chart with data from a data table.
  *
  *     var sampleData = Charts.newDataTable()
  *         .addColumn(Charts.ColumnType.STRING, "Year")
  *         .addColumn(Charts.ColumnType.NUMBER, "Sales")
  *         .addColumn(Charts.ColumnType.NUMBER, "Expenses")
  *         .addRow(["2004", 1000, 400])
  *         .addRow(["2005", 1170, 460])
  *         .addRow(["2006", 660, 1120])
  *         .addRow(["2007", 1030, 540])
  *         .addRow(["2008", 800, 600])
  *         .addRow(["2009", 943, 678])
  *         .addRow(["2010", 1020, 550])
  *         .addRow(["2011", 910, 700])
  *         .addRow(["2012", 1230, 840])
  *         .build();
  *
  *     var chart = Charts.newColumnChart()
  *         .setTitle('Sales & Expenses')
  *         .setXAxisTitle('Year')
  *         .setYAxisTitle('Amount (USD)')
  *         .setDimensions(600, 500)
  *         .setDataTable(sampleData)
  *         .build();
  */
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

