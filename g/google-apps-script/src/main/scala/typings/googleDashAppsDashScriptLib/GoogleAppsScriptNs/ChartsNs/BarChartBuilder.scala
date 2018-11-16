package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): BarChartBuilder = js.native
  def reverseDirection(): BarChartBuilder = js.native
  def setBackgroundColor(cssValue: java.lang.String): BarChartBuilder = js.native
  def setColors(cssValues: js.Array[java.lang.String]): BarChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): BarChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): BarChartBuilder = js.native
  def setDataTable(table: DataTableSource): BarChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): BarChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): BarChartBuilder = js.native
  def setLegendPosition(position: Position): BarChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): BarChartBuilder = js.native
  def setRange(start: stdLib.Number, end: stdLib.Number): BarChartBuilder = js.native
  def setStacked(): BarChartBuilder = js.native
  def setTitle(chartTitle: java.lang.String): BarChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setXAxisTitle(title: java.lang.String): BarChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def setYAxisTitle(title: java.lang.String): BarChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): BarChartBuilder = js.native
  def useLogScale(): BarChartBuilder = js.native
}

