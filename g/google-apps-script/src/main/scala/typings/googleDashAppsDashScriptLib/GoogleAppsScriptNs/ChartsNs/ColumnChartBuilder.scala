package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): ColumnChartBuilder = js.native
  def setBackgroundColor(cssValue: java.lang.String): ColumnChartBuilder = js.native
  def setColors(cssValues: js.Array[java.lang.String]): ColumnChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): ColumnChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): ColumnChartBuilder = js.native
  def setDataTable(table: DataTableSource): ColumnChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ColumnChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ColumnChartBuilder = js.native
  def setLegendPosition(position: Position): ColumnChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): ColumnChartBuilder = js.native
  def setRange(start: scala.Double, end: scala.Double): ColumnChartBuilder = js.native
  def setStacked(): ColumnChartBuilder = js.native
  def setTitle(chartTitle: java.lang.String): ColumnChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setXAxisTitle(title: java.lang.String): ColumnChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def setYAxisTitle(title: java.lang.String): ColumnChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): ColumnChartBuilder = js.native
  def useLogScale(): ColumnChartBuilder = js.native
}

