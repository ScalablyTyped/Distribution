package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChartBuilder extends js.Object {
  def build(): Chart = js.native
  def reverseCategories(): PieChartBuilder = js.native
  def set3D(): PieChartBuilder = js.native
  def setBackgroundColor(cssValue: java.lang.String): PieChartBuilder = js.native
  def setColors(cssValues: js.Array[java.lang.String]): PieChartBuilder = js.native
  def setDataSourceUrl(url: java.lang.String): PieChartBuilder = js.native
  def setDataTable(tableBuilder: DataTableBuilder): PieChartBuilder = js.native
  def setDataTable(table: DataTableSource): PieChartBuilder = js.native
  def setDataViewDefinition(dataViewDefinition: DataViewDefinition): PieChartBuilder = js.native
  def setDimensions(
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): PieChartBuilder = js.native
  def setLegendPosition(position: Position): PieChartBuilder = js.native
  def setLegendTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Object): PieChartBuilder = js.native
  def setTitle(chartTitle: java.lang.String): PieChartBuilder = js.native
  def setTitleTextStyle(textStyle: TextStyle): PieChartBuilder = js.native
}

