package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typings.googleAppsScript.GoogleAppsScript.Charts.Position
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for combo charts. For more details, see the Gviz documentation.
  */
trait EmbeddedComboChartBuilder extends StObject {
  
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
  
  def reverseCategories(): EmbeddedComboChartBuilder
  
  def setBackgroundColor(cssValue: String): EmbeddedComboChartBuilder
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  
  def setColors(cssValues: js.Array[String]): EmbeddedComboChartBuilder
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  
  def setLegendPosition(position: Position): EmbeddedComboChartBuilder
  
  def setLegendTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  
  def setRange(start: Double, end: Double): EmbeddedComboChartBuilder
  
  def setStacked(): EmbeddedComboChartBuilder
  
  def setTitle(chartTitle: String): EmbeddedComboChartBuilder
  
  def setTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  
  def setXAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def setXAxisTitle(title: String): EmbeddedComboChartBuilder
  
  def setXAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def setYAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def setYAxisTitle(title: String): EmbeddedComboChartBuilder
  
  def setYAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedComboChartBuilder
  
  def useLogScale(): EmbeddedComboChartBuilder
}
object EmbeddedComboChartBuilder {
  
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
    reverseCategories: () => EmbeddedComboChartBuilder,
    setBackgroundColor: String => EmbeddedComboChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedComboChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedComboChartBuilder,
    setLegendTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedComboChartBuilder,
    setStacked: () => EmbeddedComboChartBuilder,
    setTitle: String => EmbeddedComboChartBuilder,
    setTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    setXAxisTitle: String => EmbeddedComboChartBuilder,
    setXAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    setYAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    setYAxisTitle: String => EmbeddedComboChartBuilder,
    setYAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder,
    useLogScale: () => EmbeddedComboChartBuilder
  ): EmbeddedComboChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setStacked = js.Any.fromFunction0(setStacked), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
    __obj.asInstanceOf[EmbeddedComboChartBuilder]
  }
  
  @scala.inline
  implicit class EmbeddedComboChartBuilderMutableBuilder[Self <: EmbeddedComboChartBuilder] (val x: Self) extends AnyVal {
    
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
    def setReverseCategories(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "reverseCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBackgroundColor(value: String => EmbeddedComboChartBuilder): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColors(value: js.Array[String] => EmbeddedComboChartBuilder): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendPosition(value: Position => EmbeddedComboChartBuilder): Self = StObject.set(x, "setLegendPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLegendTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setLegendTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetRange(value: (Double, Double) => EmbeddedComboChartBuilder): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStacked(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "setStacked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTitle(value: String => EmbeddedComboChartBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setXAxisTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisTitle(value: String => EmbeddedComboChartBuilder): Self = StObject.set(x, "setXAxisTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setXAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setYAxisTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisTitle(value: String => EmbeddedComboChartBuilder): Self = StObject.set(x, "setYAxisTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedComboChartBuilder): Self = StObject.set(x, "setYAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseLogScale(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "useLogScale", js.Any.fromFunction0(value))
  }
}
