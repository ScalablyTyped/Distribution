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
  * Builder for bar charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedBarChartBuilder extends StObject {
  
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
  
  def reverseCategories(): EmbeddedBarChartBuilder
  
  def reverseDirection(): EmbeddedBarChartBuilder
  
  def setBackgroundColor(cssValue: String): EmbeddedBarChartBuilder
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  
  def setColors(cssValues: js.Array[String]): EmbeddedBarChartBuilder
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  
  def setLegendPosition(position: Position): EmbeddedBarChartBuilder
  
  def setLegendTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  
  def setRange(start: Double, end: Double): EmbeddedBarChartBuilder
  
  def setStacked(): EmbeddedBarChartBuilder
  
  def setTitle(chartTitle: String): EmbeddedBarChartBuilder
  
  def setTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  
  def setXAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def setXAxisTitle(title: String): EmbeddedBarChartBuilder
  
  def setXAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def setYAxisTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def setYAxisTitle(title: String): EmbeddedBarChartBuilder
  
  def setYAxisTitleTextStyle(textStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedBarChartBuilder
  
  def useLogScale(): EmbeddedBarChartBuilder
}
object EmbeddedBarChartBuilder {
  
  inline def apply(
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
    reverseCategories: () => EmbeddedBarChartBuilder,
    reverseDirection: () => EmbeddedBarChartBuilder,
    setBackgroundColor: String => EmbeddedBarChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedBarChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedBarChartBuilder,
    setLegendTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, js.Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedBarChartBuilder,
    setStacked: () => EmbeddedBarChartBuilder,
    setTitle: String => EmbeddedBarChartBuilder,
    setTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    setXAxisTitle: String => EmbeddedBarChartBuilder,
    setXAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    setYAxisTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    setYAxisTitle: String => EmbeddedBarChartBuilder,
    setYAxisTitleTextStyle: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder,
    useLogScale: () => EmbeddedBarChartBuilder
  ): EmbeddedBarChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = js.Any.fromFunction0(asAreaChart), asBarChart = js.Any.fromFunction0(asBarChart), asColumnChart = js.Any.fromFunction0(asColumnChart), asComboChart = js.Any.fromFunction0(asComboChart), asHistogramChart = js.Any.fromFunction0(asHistogramChart), asLineChart = js.Any.fromFunction0(asLineChart), asPieChart = js.Any.fromFunction0(asPieChart), asScatterChart = js.Any.fromFunction0(asScatterChart), asTableChart = js.Any.fromFunction0(asTableChart), build = js.Any.fromFunction0(build), clearRanges = js.Any.fromFunction0(clearRanges), getChartType = js.Any.fromFunction0(getChartType), getContainer = js.Any.fromFunction0(getContainer), getRanges = js.Any.fromFunction0(getRanges), removeRange = js.Any.fromFunction1(removeRange), reverseCategories = js.Any.fromFunction0(reverseCategories), reverseDirection = js.Any.fromFunction0(reverseDirection), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setStacked = js.Any.fromFunction0(setStacked), setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = js.Any.fromFunction0(useLogScale))
    __obj.asInstanceOf[EmbeddedBarChartBuilder]
  }
  
  extension [Self <: EmbeddedBarChartBuilder](x: Self) {
    
    inline def setAddRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    inline def setAsAreaChart(value: () => EmbeddedAreaChartBuilder): Self = StObject.set(x, "asAreaChart", js.Any.fromFunction0(value))
    
    inline def setAsBarChart(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "asBarChart", js.Any.fromFunction0(value))
    
    inline def setAsColumnChart(value: () => EmbeddedColumnChartBuilder): Self = StObject.set(x, "asColumnChart", js.Any.fromFunction0(value))
    
    inline def setAsComboChart(value: () => EmbeddedComboChartBuilder): Self = StObject.set(x, "asComboChart", js.Any.fromFunction0(value))
    
    inline def setAsHistogramChart(value: () => EmbeddedHistogramChartBuilder): Self = StObject.set(x, "asHistogramChart", js.Any.fromFunction0(value))
    
    inline def setAsLineChart(value: () => EmbeddedLineChartBuilder): Self = StObject.set(x, "asLineChart", js.Any.fromFunction0(value))
    
    inline def setAsPieChart(value: () => EmbeddedPieChartBuilder): Self = StObject.set(x, "asPieChart", js.Any.fromFunction0(value))
    
    inline def setAsScatterChart(value: () => EmbeddedScatterChartBuilder): Self = StObject.set(x, "asScatterChart", js.Any.fromFunction0(value))
    
    inline def setAsTableChart(value: () => EmbeddedTableChartBuilder): Self = StObject.set(x, "asTableChart", js.Any.fromFunction0(value))
    
    inline def setBuild(value: () => EmbeddedChart): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setClearRanges(value: () => EmbeddedChartBuilder): Self = StObject.set(x, "clearRanges", js.Any.fromFunction0(value))
    
    inline def setGetChartType(value: () => ChartType): Self = StObject.set(x, "getChartType", js.Any.fromFunction0(value))
    
    inline def setGetContainer(value: () => ContainerInfo): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetRanges(value: () => js.Array[Range]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    inline def setRemoveRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    inline def setReverseCategories(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "reverseCategories", js.Any.fromFunction0(value))
    
    inline def setReverseDirection(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "reverseDirection", js.Any.fromFunction0(value))
    
    inline def setSetBackgroundColor(value: String => EmbeddedBarChartBuilder): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    inline def setSetColors(value: js.Array[String] => EmbeddedBarChartBuilder): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    inline def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    inline def setSetLegendPosition(value: Position => EmbeddedBarChartBuilder): Self = StObject.set(x, "setLegendPosition", js.Any.fromFunction1(value))
    
    inline def setSetLegendTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setLegendTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    inline def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    inline def setSetOption(value: (String, js.Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    inline def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    inline def setSetRange(value: (Double, Double) => EmbeddedBarChartBuilder): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    inline def setSetStacked(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "setStacked", js.Any.fromFunction0(value))
    
    inline def setSetTitle(value: String => EmbeddedBarChartBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setXAxisTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTitle(value: String => EmbeddedBarChartBuilder): Self = StObject.set(x, "setXAxisTitle", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setXAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setYAxisTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTitle(value: String => EmbeddedBarChartBuilder): Self = StObject.set(x, "setYAxisTitle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTitleTextStyle(value: typings.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedBarChartBuilder): Self = StObject.set(x, "setYAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setUseLogScale(value: () => EmbeddedBarChartBuilder): Self = StObject.set(x, "useLogScale", js.Any.fromFunction0(value))
  }
}
