package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterChartBuilder extends js.Object {
  def build(): Chart = js.native
  def setBackgroundColor(cssValue: java.lang.String): ScatterChartBuilder = js.native
  def setColors(cssValues: js.Array[java.lang.String]): ScatterChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): ScatterChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): ScatterChartBuilder = js.native
  def setDataTable(table: DataTableSource): ScatterChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): ScatterChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ScatterChartBuilder = js.native
  def setLegendPosition(position: Position): ScatterChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): ScatterChartBuilder = js.native
  def setPointStyle(style: PointStyle): ScatterChartBuilder = js.native
  def setTitle(chartTitle: java.lang.String): ScatterChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  def setXAxisLogScale(): ScatterChartBuilder = js.native
  def setXAxisRange(start: scala.Double, end: scala.Double): ScatterChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  def setXAxisTitle(title: java.lang.String): ScatterChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  def setYAxisLogScale(): ScatterChartBuilder = js.native
  def setYAxisRange(start: scala.Double, end: scala.Double): ScatterChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
  def setYAxisTitle(title: java.lang.String): ScatterChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): ScatterChartBuilder = js.native
}

