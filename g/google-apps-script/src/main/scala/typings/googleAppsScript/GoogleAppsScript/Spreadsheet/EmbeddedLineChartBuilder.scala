package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle
import typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle
import typings.googleAppsScript.GoogleAppsScript.Charts.Position
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for line charts. For more details, see the Gviz
  * documentation.
  */
@js.native
trait EmbeddedLineChartBuilder extends js.Object {
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
  def getChartType(): ChartType = js.native
  def getContainer(): ContainerInfo = js.native
  def getRanges(): js.Array[Range] = js.native
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  def reverseCategories(): EmbeddedLineChartBuilder = js.native
  def setBackgroundColor(cssValue: String): EmbeddedLineChartBuilder = js.native
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  def setColors(cssValues: js.Array[String]): EmbeddedLineChartBuilder = js.native
  def setCurveStyle(style: CurveStyle): EmbeddedLineChartBuilder = js.native
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  def setLegendPosition(position: Position): EmbeddedLineChartBuilder = js.native
  def setLegendTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder = js.native
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  def setPointStyle(style: PointStyle): EmbeddedLineChartBuilder = js.native
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  def setRange(start: Double, end: Double): EmbeddedLineChartBuilder = js.native
  def setTitle(chartTitle: String): EmbeddedLineChartBuilder = js.native
  def setTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  def setXAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setXAxisTitle(title: String): EmbeddedLineChartBuilder = js.native
  def setXAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setYAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def setYAxisTitle(title: String): EmbeddedLineChartBuilder = js.native
  def setYAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder = js.native
  def useLogScale(): EmbeddedLineChartBuilder = js.native
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
    setLegendTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPointStyle: PointStyle => EmbeddedLineChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedLineChartBuilder,
    setTitle: String => EmbeddedLineChartBuilder,
    setTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setXAxisTitle: String => EmbeddedLineChartBuilder,
    setXAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    setYAxisTitle: String => EmbeddedLineChartBuilder,
    setYAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder,
    useLogScale: () => EmbeddedLineChartBuilder
  ): EmbeddedLineChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setCurveStyle = js.Any.fromFunction1(setCurveStyle), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
    __obj.asInstanceOf[EmbeddedLineChartBuilder]
  }
  @scala.inline
  implicit class EmbeddedLineChartBuilderOps[Self <: EmbeddedLineChartBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRange(value: Range => EmbeddedChartBuilder): Self = this.set("addRange", js.Any.fromFunction1(value))
    @scala.inline
    def setAsAreaChart(value: () => EmbeddedAreaChartBuilder): Self = this.set("asAreaChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsBarChart(value: () => EmbeddedBarChartBuilder): Self = this.set("asBarChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsColumnChart(value: () => EmbeddedColumnChartBuilder): Self = this.set("asColumnChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsComboChart(value: () => EmbeddedComboChartBuilder): Self = this.set("asComboChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsHistogramChart(value: () => EmbeddedHistogramChartBuilder): Self = this.set("asHistogramChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsLineChart(value: () => EmbeddedLineChartBuilder): Self = this.set("asLineChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsPieChart(value: () => EmbeddedPieChartBuilder): Self = this.set("asPieChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsScatterChart(value: () => EmbeddedScatterChartBuilder): Self = this.set("asScatterChart", js.Any.fromFunction0(value))
    @scala.inline
    def setAsTableChart(value: () => EmbeddedTableChartBuilder): Self = this.set("asTableChart", js.Any.fromFunction0(value))
    @scala.inline
    def setBuild(value: () => EmbeddedChart): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setClearRanges(value: () => EmbeddedChartBuilder): Self = this.set("clearRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChartType(value: () => ChartType): Self = this.set("getChartType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainer(value: () => ContainerInfo): Self = this.set("getContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRanges(value: () => js.Array[Range]): Self = this.set("getRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveRange(value: Range => EmbeddedChartBuilder): Self = this.set("removeRange", js.Any.fromFunction1(value))
    @scala.inline
    def setReverseCategories(value: () => EmbeddedLineChartBuilder): Self = this.set("reverseCategories", js.Any.fromFunction0(value))
    @scala.inline
    def setSetBackgroundColor(value: String => EmbeddedLineChartBuilder): Self = this.set("setBackgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = this.set("setChartType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetColors(value: js.Array[String] => EmbeddedLineChartBuilder): Self = this.set("setColors", js.Any.fromFunction1(value))
    @scala.inline
    def setSetCurveStyle(value: CurveStyle => EmbeddedLineChartBuilder): Self = this.set("setCurveStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = this.set("setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLegendPosition(value: Position => EmbeddedLineChartBuilder): Self = this.set("setLegendPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLegendTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setLegendTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = this.set("setMergeStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = this.set("setNumHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = this.set("setOption", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPointStyle(value: PointStyle => EmbeddedLineChartBuilder): Self = this.set("setPointStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = this.set("setPosition", js.Any.fromFunction4(value))
    @scala.inline
    def setSetRange(value: (Double, Double) => EmbeddedLineChartBuilder): Self = this.set("setRange", js.Any.fromFunction2(value))
    @scala.inline
    def setSetTitle(value: String => EmbeddedLineChartBuilder): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setTitleTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = this.set("setTransposeRowsAndColumns", js.Any.fromFunction1(value))
    @scala.inline
    def setSetXAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setXAxisTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetXAxisTitle(value: String => EmbeddedLineChartBuilder): Self = this.set("setXAxisTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetXAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setXAxisTitleTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetYAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setYAxisTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetYAxisTitle(value: String => EmbeddedLineChartBuilder): Self = this.set("setYAxisTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetYAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedLineChartBuilder): Self = this.set("setYAxisTitleTextStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setUseLogScale(value: () => EmbeddedLineChartBuilder): Self = this.set("useLogScale", js.Any.fromFunction0(value))
  }
  
}

