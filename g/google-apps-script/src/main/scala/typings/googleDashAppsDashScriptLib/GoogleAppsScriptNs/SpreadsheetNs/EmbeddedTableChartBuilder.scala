package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddedTableChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder = js.native
  def asAreaChart(): EmbeddedAreaChartBuilder = js.native
  def asBarChart(): EmbeddedBarChartBuilder = js.native
  def asColumnChart(): EmbeddedColumnChartBuilder = js.native
  def asComboChart(): EmbeddedComboChartBuilder = js.native
  def asHistogramChart(): EmbeddedHistogramChartBuilder = js.native
  def asLineChart(): EmbeddedLineChartBuilder = js.native
  def asPieChart(): EmbeddedPieChartBuilder = js.native
  def asScatterChart(): EmbeddedScatterChartBuilder = js.native
  def asTableChart(): EmbeddedTableChartBuilder = js.native
  def build(): EmbeddedChart = js.native
  def clearRanges(): EmbeddedChartBuilder = js.native
  def enablePaging(enablePaging: scala.Boolean): EmbeddedTableChartBuilder = js.native
  def enablePaging(pageSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedTableChartBuilder = js.native
  def enablePaging(
    pageSize: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    startPage: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedTableChartBuilder = js.native
  def enableRtlTable(rtlEnabled: scala.Boolean): EmbeddedTableChartBuilder = js.native
  def enableSorting(enableSorting: scala.Boolean): EmbeddedTableChartBuilder = js.native
  def getChartType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder = js.native
  def setFirstRowNumber(number: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedTableChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setInitialSortingAscending(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedTableChartBuilder = js.native
  def setInitialSortingDescending(column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedTableChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder = js.native
  def setOption(option: java.lang.String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder = js.native
  def showRowNumberColumn(showRowNumber: scala.Boolean): EmbeddedTableChartBuilder = js.native
  def useAlternatingRowStyle(alternate: scala.Boolean): EmbeddedTableChartBuilder = js.native
}

