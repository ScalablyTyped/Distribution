package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedComboChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedComboChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedComboChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedComboChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedComboChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setRange(start: stdLib.Number, end: stdLib.Number): EmbeddedComboChartBuilder
  def setStacked(): EmbeddedComboChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedComboChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedComboChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedComboChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedComboChartBuilder
  def useLogScale(): EmbeddedComboChartBuilder
}

object EmbeddedComboChartBuilder {
  @scala.inline
  def apply(
    addRange: js.Function1[Range, EmbeddedChartBuilder],
    asAreaChart: js.Function0[EmbeddedAreaChartBuilder],
    asBarChart: js.Function0[EmbeddedBarChartBuilder],
    asColumnChart: js.Function0[EmbeddedColumnChartBuilder],
    asComboChart: js.Function0[EmbeddedComboChartBuilder],
    asHistogramChart: js.Function0[EmbeddedHistogramChartBuilder],
    asLineChart: js.Function0[EmbeddedLineChartBuilder],
    asPieChart: js.Function0[EmbeddedPieChartBuilder],
    asScatterChart: js.Function0[EmbeddedScatterChartBuilder],
    asTableChart: js.Function0[EmbeddedTableChartBuilder],
    build: js.Function0[EmbeddedChart],
    getChartType: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType],
    getContainer: js.Function0[ContainerInfo],
    getRanges: js.Function0[js.Array[Range]],
    removeRange: js.Function1[Range, EmbeddedChartBuilder],
    reverseCategories: js.Function0[EmbeddedComboChartBuilder],
    setBackgroundColor: js.Function1[java.lang.String, EmbeddedComboChartBuilder],
    setChartType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType, 
      EmbeddedChartBuilder
    ],
    setColors: js.Function1[js.Array[java.lang.String], EmbeddedComboChartBuilder],
    setHiddenDimensionStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy, 
      EmbeddedChartBuilder
    ],
    setLegendPosition: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position, 
      EmbeddedComboChartBuilder
    ],
    setLegendTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    setMergeStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy, 
      EmbeddedChartBuilder
    ],
    setNumHeaders: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, EmbeddedChartBuilder],
    setOption: js.Function2[java.lang.String, js.Object, EmbeddedChartBuilder],
    setPosition: js.Function4[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      EmbeddedChartBuilder
    ],
    setRange: js.Function2[stdLib.Number, stdLib.Number, EmbeddedComboChartBuilder],
    setStacked: js.Function0[EmbeddedComboChartBuilder],
    setTitle: js.Function1[java.lang.String, EmbeddedComboChartBuilder],
    setTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    setTransposeRowsAndColumns: js.Function1[scala.Boolean, EmbeddedChartBuilder],
    setXAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    setXAxisTitle: js.Function1[java.lang.String, EmbeddedComboChartBuilder],
    setXAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    setYAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    setYAxisTitle: js.Function1[java.lang.String, EmbeddedComboChartBuilder],
    setYAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedComboChartBuilder
    ],
    useLogScale: js.Function0[EmbeddedComboChartBuilder]
  ): EmbeddedComboChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = addRange, asAreaChart = asAreaChart, asBarChart = asBarChart, asColumnChart = asColumnChart, asComboChart = asComboChart, asHistogramChart = asHistogramChart, asLineChart = asLineChart, asPieChart = asPieChart, asScatterChart = asScatterChart, asTableChart = asTableChart, build = build, getChartType = getChartType, getContainer = getContainer, getRanges = getRanges, removeRange = removeRange, reverseCategories = reverseCategories, setBackgroundColor = setBackgroundColor, setChartType = setChartType, setColors = setColors, setHiddenDimensionStrategy = setHiddenDimensionStrategy, setLegendPosition = setLegendPosition, setLegendTextStyle = setLegendTextStyle, setMergeStrategy = setMergeStrategy, setNumHeaders = setNumHeaders, setOption = setOption, setPosition = setPosition, setRange = setRange, setStacked = setStacked, setTitle = setTitle, setTitleTextStyle = setTitleTextStyle, setTransposeRowsAndColumns = setTransposeRowsAndColumns, setXAxisTextStyle = setXAxisTextStyle, setXAxisTitle = setXAxisTitle, setXAxisTitleTextStyle = setXAxisTitleTextStyle, setYAxisTextStyle = setYAxisTextStyle, setYAxisTitle = setYAxisTitle, setYAxisTitleTextStyle = setYAxisTitleTextStyle, useLogScale = useLogScale)
  
    __obj.asInstanceOf[EmbeddedComboChartBuilder]
  }
}

