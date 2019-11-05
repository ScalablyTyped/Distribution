package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartType
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.Position
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for pie charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedPieChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedPieChartBuilder
  def set3D(): EmbeddedPieChartBuilder
  def setBackgroundColor(cssValue: String): EmbeddedPieChartBuilder
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[String]): EmbeddedPieChartBuilder
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: Position): EmbeddedPieChartBuilder
  def setLegendTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  def setTitle(chartTitle: String): EmbeddedPieChartBuilder
  def setTitleTextStyle(textStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle): EmbeddedPieChartBuilder
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
}

object EmbeddedPieChartBuilder {
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
    reverseCategories: () => EmbeddedPieChartBuilder,
    set3D: () => EmbeddedPieChartBuilder,
    setBackgroundColor: String => EmbeddedPieChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedPieChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedPieChartBuilder,
    setLegendTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setTitle: String => EmbeddedPieChartBuilder,
    setTitleTextStyle: typings.googleDashAppsDashScript.GoogleAppsScript.Charts.TextStyle => EmbeddedPieChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder
  ): EmbeddedPieChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), set3D = js.Any.fromFunction0(set3D), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns))
  
    __obj.asInstanceOf[EmbeddedPieChartBuilder]
  }
}

