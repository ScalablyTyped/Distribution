package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.ChartType
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.PointStyle
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.Position
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedAreaChartBuilder extends js.Object {
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
  def getChartType(): ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def reverseCategories(): EmbeddedAreaChartBuilder
  def setBackgroundColor(cssValue: String): EmbeddedAreaChartBuilder
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[String]): EmbeddedAreaChartBuilder
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: Position): EmbeddedAreaChartBuilder
  def setLegendTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  def setPointStyle(style: PointStyle): EmbeddedAreaChartBuilder
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  def setRange(start: Double, end: Double): EmbeddedAreaChartBuilder
  def setStacked(): EmbeddedAreaChartBuilder
  def setTitle(chartTitle: String): EmbeddedAreaChartBuilder
  def setTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setXAxisTitle(title: String): EmbeddedAreaChartBuilder
  def setXAxisTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setYAxisTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setYAxisTitle(title: String): EmbeddedAreaChartBuilder
  def setYAxisTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def useLogScale(): EmbeddedAreaChartBuilder
}

object EmbeddedAreaChartBuilder {
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
    getChartType: () => ChartType,
    getContainer: () => ContainerInfo,
    getRanges: () => js.Array[Range],
    removeRange: Range => EmbeddedChartBuilder,
    reverseCategories: () => EmbeddedAreaChartBuilder,
    setBackgroundColor: String => EmbeddedAreaChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedAreaChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedAreaChartBuilder,
    setLegendTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPointStyle: PointStyle => EmbeddedAreaChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedAreaChartBuilder,
    setStacked: () => EmbeddedAreaChartBuilder,
    setTitle: String => EmbeddedAreaChartBuilder,
    setTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    setXAxisTitle: String => EmbeddedAreaChartBuilder,
    setXAxisTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    setYAxisTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    setYAxisTitle: String => EmbeddedAreaChartBuilder,
    setYAxisTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs.TextStyle => EmbeddedAreaChartBuilder,
    useLogScale: () => EmbeddedAreaChartBuilder
  ): EmbeddedAreaChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setStacked = js.Any.fromFunction0(setStacked), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
  
    __obj.asInstanceOf[EmbeddedAreaChartBuilder]
  }
}

