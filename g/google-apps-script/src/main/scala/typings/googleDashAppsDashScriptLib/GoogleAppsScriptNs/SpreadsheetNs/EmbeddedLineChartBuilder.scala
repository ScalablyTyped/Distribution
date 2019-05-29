package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedLineChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedLineChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedLineChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedLineChartBuilder
  def setCurveStyle(style: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle): EmbeddedLineChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedLineChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPointStyle(style: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle): EmbeddedLineChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setRange(start: scala.Double, end: scala.Double): EmbeddedLineChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedLineChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedLineChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedLineChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedLineChartBuilder
  def useLogScale(): EmbeddedLineChartBuilder
}

object EmbeddedLineChartBuilder {
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
    reverseCategories: () => EmbeddedLineChartBuilder,
    setBackgroundColor: java.lang.String => EmbeddedLineChartBuilder,
    setChartType: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType => EmbeddedChartBuilder,
    setColors: js.Array[java.lang.String] => EmbeddedLineChartBuilder,
    setCurveStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.CurveStyle => EmbeddedLineChartBuilder,
    setHiddenDimensionStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position => EmbeddedLineChartBuilder,
    setLegendTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    setMergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => EmbeddedChartBuilder,
    setOption: (java.lang.String, js.Object) => EmbeddedChartBuilder,
    setPointStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle => EmbeddedLineChartBuilder,
    setPosition: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => EmbeddedChartBuilder,
    setRange: (scala.Double, scala.Double) => EmbeddedLineChartBuilder,
    setTitle: java.lang.String => EmbeddedLineChartBuilder,
    setTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    setTransposeRowsAndColumns: scala.Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    setXAxisTitle: java.lang.String => EmbeddedLineChartBuilder,
    setXAxisTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTitle: java.lang.String => EmbeddedLineChartBuilder,
    setYAxisTitleTextStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedLineChartBuilder,
    useLogScale: () => EmbeddedLineChartBuilder
  ): EmbeddedLineChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setCurveStyle = js.Any.fromFunction1(setCurveStyle), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
  
    __obj.asInstanceOf[EmbeddedLineChartBuilder]
  }
}

