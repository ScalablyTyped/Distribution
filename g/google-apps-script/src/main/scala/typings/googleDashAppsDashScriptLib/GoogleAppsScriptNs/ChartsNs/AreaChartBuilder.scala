package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): AreaChartBuilder = js.native
  def setBackgroundColor(cssValue: java.lang.String): AreaChartBuilder = js.native
  def setColors(cssValues: js.Array[java.lang.String]): AreaChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): AreaChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): AreaChartBuilder = js.native
  def setDataTable(table: DataTableSource): AreaChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): AreaChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): AreaChartBuilder = js.native
  def setLegendPosition(position: Position): AreaChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): AreaChartBuilder = js.native
  def setPointStyle(style: PointStyle): AreaChartBuilder = js.native
  def setRange(start: stdLib.Number, end: stdLib.Number): AreaChartBuilder = js.native
  def setStacked(): AreaChartBuilder = js.native
  def setTitle(chartTitle: java.lang.String): AreaChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setXAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setXAxisTitle(title: java.lang.String): AreaChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setYAxisTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def setYAxisTitle(title: java.lang.String): AreaChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: TextStyle): AreaChartBuilder = js.native
  def useLogScale(): AreaChartBuilder = js.native
}

