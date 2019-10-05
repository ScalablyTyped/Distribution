package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartType
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.CurveStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.PointStyle
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.Position
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
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
  def getChartType(): ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def reverseCategories(): EmbeddedLineChartBuilder
  def setBackgroundColor(cssValue: String): EmbeddedLineChartBuilder
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[String]): EmbeddedLineChartBuilder
  def setCurveStyle(style: CurveStyle): EmbeddedLineChartBuilder
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: Position): EmbeddedLineChartBuilder
  def setLegendTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  def setPointStyle(style: PointStyle): EmbeddedLineChartBuilder
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  def setRange(start: Double, end: Double): EmbeddedLineChartBuilder
  def setTitle(chartTitle: String): EmbeddedLineChartBuilder
  def setTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setXAxisTitle(title: String): EmbeddedLineChartBuilder
  def setXAxisTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTitle(title: String): EmbeddedLineChartBuilder
  def setYAxisTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
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
    getChartType: () => ChartType,
    getContainer: () => ContainerInfo,
    getRanges: () => js.Array[Range],
    removeRange: Range => EmbeddedChartBuilder,
    reverseCategories: () => EmbeddedLineChartBuilder,
    setBackgroundColor: String => EmbeddedLineChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedLineChartBuilder,
    setCurveStyle: CurveStyle => EmbeddedLineChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedLineChartBuilder,
    setLegendTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPointStyle: PointStyle => EmbeddedLineChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedLineChartBuilder,
    setTitle: String => EmbeddedLineChartBuilder,
    setTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setXAxisTitle: String => EmbeddedLineChartBuilder,
    setXAxisTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTitle: String => EmbeddedLineChartBuilder,
    setYAxisTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    useLogScale: () => EmbeddedLineChartBuilder
  ): EmbeddedLineChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setCurveStyle = js.Any.fromFunction1(setCurveStyle), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
  
    __obj.asInstanceOf[EmbeddedLineChartBuilder]
  }
}

