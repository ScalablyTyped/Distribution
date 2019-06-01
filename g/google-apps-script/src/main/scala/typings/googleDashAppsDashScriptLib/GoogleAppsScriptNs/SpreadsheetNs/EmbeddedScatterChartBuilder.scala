package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedScatterChartBuilder extends js.Object {
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
  def clearRanges(): EmbeddedChartBuilder
  def getChartType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedScatterChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedScatterChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedScatterChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Any): EmbeddedChartBuilder
  def setPointStyle(style: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle): EmbeddedScatterChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedScatterChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisLogScale(): EmbeddedScatterChartBuilder
  def setXAxisRange(start: scala.Double, end: scala.Double): EmbeddedScatterChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedScatterChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
  def setYAxisLogScale(): EmbeddedScatterChartBuilder
  def setYAxisRange(start: scala.Double, end: scala.Double): EmbeddedScatterChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedScatterChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedScatterChartBuilder
}

object EmbeddedScatterChartBuilder {
  @scala.inline
  def apply(
    addRange: Range => EmbeddedChartBuilder,
    asAreaChart: () => EmbeddedAreaChartBuilder,
    asBarChart: () => EmbeddedBarChartBuilder,
    asColumnChart: () => EmbeddedColumnChartBuilder,
    asComboChart: () => EmbeddedComboChartBuilder,
    asHistogramChart: () => EmbeddedHistogramChartBuilder,
    asLineChart: () => EmbeddedLineChartBuilder,
    asPieChart: () => EmbeddedPieChartBuilder,
    asScatterChart: () => EmbeddedScatterChartBuilder,
    asTableChart: () => EmbeddedTableChartBuilder,
    build: () => EmbeddedChart,
    clearRanges: () => EmbeddedChartBuilder,
    getChartType: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType,
    getContainer: () => ContainerInfo,
    getRanges: () => js.Array[Range],
    removeRange: Range => EmbeddedChartBuilder,
    setBackgroundColor: java.lang.String => EmbeddedScatterChartBuilder,
    setChartType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType => EmbeddedChartBuilder,
    setColors: js.Array[java.lang.String] => EmbeddedScatterChartBuilder,
    setHiddenDimensionStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position => EmbeddedScatterChartBuilder,
    setLegendTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder,
    setMergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => EmbeddedChartBuilder,
    setOption: (java.lang.String, js.Any) => EmbeddedChartBuilder,
    setPointStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle => EmbeddedScatterChartBuilder,
    setPosition: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => EmbeddedChartBuilder,
    setTitle: java.lang.String => EmbeddedScatterChartBuilder,
    setTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder,
    setTransposeRowsAndColumns: scala.Boolean => EmbeddedChartBuilder,
    setXAxisLogScale: () => EmbeddedScatterChartBuilder,
    setXAxisRange: (scala.Double, scala.Double) => EmbeddedScatterChartBuilder,
    setXAxisTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder,
    setXAxisTitle: java.lang.String => EmbeddedScatterChartBuilder,
    setXAxisTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder,
    setYAxisLogScale: () => EmbeddedScatterChartBuilder,
    setYAxisRange: (scala.Double, scala.Double) => EmbeddedScatterChartBuilder,
    setYAxisTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder,
    setYAxisTitle: java.lang.String => EmbeddedScatterChartBuilder,
    setYAxisTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedScatterChartBuilder
  ): EmbeddedScatterChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisLogScale = js.Any.fromFunction0(setXAxisLogScale), setXAxisRange = js.Any.fromFunction2(setXAxisRange), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisLogScale = js.Any.fromFunction0(setYAxisLogScale), setYAxisRange = js.Any.fromFunction2(setYAxisRange), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle))
  
    __obj.asInstanceOf[EmbeddedScatterChartBuilder]
  }
}

