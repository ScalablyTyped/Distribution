package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmbeddedColumnChartBuilder extends js.Object {
  def addRange(range: Range): EmbeddedChartBuilder
  def asAreaChart(): EmbeddedAreaChartBuilder
  def asBarChart(): EmbeddedBarChartBuilder
  def asColumnChart(): EmbeddedColumnChartBuilder
  def asComboChart(): EmbeddedComboChartBuilder
  def asHistogramChart(): EmbeddedHistogramChartBuilder
  def asLineChart(): EmbeddedLineChartBuilder
  def asPieChart(): EmbeddedPieChartBuilder
  def asScatterChart(): EmbeddedScatterChartBuilder
  def asTableChart(): EmbeddedTableChartBuilder
  def build(): EmbeddedChart
  def getChartType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def reverseCategories(): EmbeddedColumnChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedColumnChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedColumnChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedColumnChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setRange(start: stdLib.Number, end: stdLib.Number): EmbeddedColumnChartBuilder
  def setStacked(): EmbeddedColumnChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedColumnChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedColumnChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedColumnChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedColumnChartBuilder
  def useLogScale(): EmbeddedColumnChartBuilder
}

