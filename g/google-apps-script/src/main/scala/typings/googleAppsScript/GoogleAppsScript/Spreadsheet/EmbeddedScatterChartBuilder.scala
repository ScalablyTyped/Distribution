package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle
import typings.googleAppsScript.GoogleAppsScript.Charts.Position
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for scatter charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedScatterChartBuilder extends StObject {
  
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
  
  def setBackgroundColor(cssValue: String): EmbeddedScatterChartBuilder
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  
  def setColors(cssValues: js.Array[String]): EmbeddedScatterChartBuilder
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  
  def setLegendPosition(position: Position): EmbeddedScatterChartBuilder
  
  def setLegendTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  
  def setPointStyle(style: PointStyle): EmbeddedScatterChartBuilder
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  
  def setTitle(chartTitle: String): EmbeddedScatterChartBuilder
  
  def setTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  
  def setXAxisLogScale(): EmbeddedScatterChartBuilder
  
  def setXAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder
  
  def setXAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  
  def setXAxisTitle(title: String): EmbeddedScatterChartBuilder
  
  def setXAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  
  def setYAxisLogScale(): EmbeddedScatterChartBuilder
  
  def setYAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder
  
  def setYAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  
  def setYAxisTitle(title: String): EmbeddedScatterChartBuilder
  
  def setYAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
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
    getChartType: () => ChartType,
    getContainer: () => ContainerInfo,
    getRanges: () => js.Array[Range],
    removeRange: Range => EmbeddedChartBuilder,
    setBackgroundColor: String => EmbeddedScatterChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedScatterChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedScatterChartBuilder,
    setLegendTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPointStyle: PointStyle => EmbeddedScatterChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setTitle: String => EmbeddedScatterChartBuilder,
    setTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisLogScale: () => EmbeddedScatterChartBuilder,
    setXAxisRange: (Double, Double) => EmbeddedScatterChartBuilder,
    setXAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder,
    setXAxisTitle: String => EmbeddedScatterChartBuilder,
    setXAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder,
    setYAxisLogScale: () => EmbeddedScatterChartBuilder,
    setYAxisRange: (Double, Double) => EmbeddedScatterChartBuilder,
    setYAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder,
    setYAxisTitle: String => EmbeddedScatterChartBuilder,
    setYAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder
  ): EmbeddedScatterChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPointStyle = js.Any.fromFunction1(setPointStyle), setPosition = js.Any.fromFunction4(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisLogScale = js.Any.fromFunction0(setXAxisLogScale), setXAxisRange = js.Any.fromFunction2(setXAxisRange), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisLogScale = js.Any.fromFunction0(setYAxisLogScale), setYAxisRange = js.Any.fromFunction2(setYAxisRange), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle))
    __obj.asInstanceOf[EmbeddedScatterChartBuilder]
  }
  
  @scala.inline
  implicit class EmbeddedScatterChartBuilderMutableBuilder[Self <: EmbeddedScatterChartBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsAreaChart(value: () => EmbeddedAreaChartBuilder): Self = StObject.set(x, "asAreaChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsBarChart(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "asBarChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsColumnChart(value: () => EmbeddedColumnChartBuilder): Self = StObject.set(x, "asColumnChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsComboChart(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "asComboChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsHistogramChart(value: () => EmbeddedHistogramChartBuilder): Self = StObject.set(x, "asHistogramChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsLineChart(value: () => EmbeddedLineChartBuilder): Self = StObject.set(x, "asLineChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsPieChart(value: () => EmbeddedPieChartBuilder): Self = StObject.set(x, "asPieChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsScatterChart(value: () => EmbeddedScatterChartBuilder): Self = StObject.set(x, "asScatterChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTableChart(value: () => EmbeddedTableChartBuilder): Self = StObject.set(x, "asTableChart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => EmbeddedChart): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearRanges(value: () => EmbeddedChartBuilder): Self = StObject.set(x, "clearRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChartType(value: () => ChartType): Self = StObject.set(x, "getChartType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainer(value: () => ContainerInfo): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRanges(value: () => js.Array[Range]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackgroundColor(value: String => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColors(value: js.Array[String] => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendPosition(value: Position => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setLegendPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setLegendTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPointStyle(value: PointStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setPointStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetTitle(value: String => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisLogScale(value: () => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setXAxisLogScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetXAxisRange(value: (Double, Double) => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setXAxisRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetXAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setXAxisTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisTitle(value: String => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setXAxisTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setXAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisLogScale(value: () => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setYAxisLogScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetYAxisRange(value: (Double, Double) => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setYAxisRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetYAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setYAxisTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisTitle(value: String => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setYAxisTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedScatterChartBuilder): Self = StObject.set(x, "setYAxisTitleTextStyle", js.Any.fromFunction1(value))
  }
}
