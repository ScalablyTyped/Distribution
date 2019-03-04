package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

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
  def getChartType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def reverseCategories(): EmbeddedAreaChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedAreaChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedAreaChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedAreaChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPointStyle(style: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle): EmbeddedAreaChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setRange(start: stdLib.Number, end: stdLib.Number): EmbeddedAreaChartBuilder
  def setStacked(): EmbeddedAreaChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedAreaChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedAreaChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedAreaChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedAreaChartBuilder
  def useLogScale(): EmbeddedAreaChartBuilder
}

object EmbeddedAreaChartBuilder {
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
    reverseCategories: js.Function0[EmbeddedAreaChartBuilder],
    setBackgroundColor: js.Function1[java.lang.String, EmbeddedAreaChartBuilder],
    setChartType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType, 
      EmbeddedChartBuilder
    ],
    setColors: js.Function1[js.Array[java.lang.String], EmbeddedAreaChartBuilder],
    setHiddenDimensionStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy, 
      EmbeddedChartBuilder
    ],
    setLegendPosition: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position, 
      EmbeddedAreaChartBuilder
    ],
    setLegendTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    setMergeStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy, 
      EmbeddedChartBuilder
    ],
    setNumHeaders: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, EmbeddedChartBuilder],
    setOption: js.Function2[java.lang.String, js.Object, EmbeddedChartBuilder],
    setPointStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.PointStyle, 
      EmbeddedAreaChartBuilder
    ],
    setPosition: js.Function4[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      EmbeddedChartBuilder
    ],
    setRange: js.Function2[stdLib.Number, stdLib.Number, EmbeddedAreaChartBuilder],
    setStacked: js.Function0[EmbeddedAreaChartBuilder],
    setTitle: js.Function1[java.lang.String, EmbeddedAreaChartBuilder],
    setTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    setTransposeRowsAndColumns: js.Function1[scala.Boolean, EmbeddedChartBuilder],
    setXAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    setXAxisTitle: js.Function1[java.lang.String, EmbeddedAreaChartBuilder],
    setXAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    setYAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    setYAxisTitle: js.Function1[java.lang.String, EmbeddedAreaChartBuilder],
    setYAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedAreaChartBuilder
    ],
    useLogScale: js.Function0[EmbeddedAreaChartBuilder]
  ): EmbeddedAreaChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = addRange, asAreaChart = asAreaChart, asBarChart = asBarChart, asColumnChart = asColumnChart, asComboChart = asComboChart, asHistogramChart = asHistogramChart, asLineChart = asLineChart, asPieChart = asPieChart, asScatterChart = asScatterChart, asTableChart = asTableChart, build = build, getChartType = getChartType, getContainer = getContainer, getRanges = getRanges, removeRange = removeRange, reverseCategories = reverseCategories, setBackgroundColor = setBackgroundColor, setChartType = setChartType, setColors = setColors, setHiddenDimensionStrategy = setHiddenDimensionStrategy, setLegendPosition = setLegendPosition, setLegendTextStyle = setLegendTextStyle, setMergeStrategy = setMergeStrategy, setNumHeaders = setNumHeaders, setOption = setOption, setPointStyle = setPointStyle, setPosition = setPosition, setRange = setRange, setStacked = setStacked, setTitle = setTitle, setTitleTextStyle = setTitleTextStyle, setTransposeRowsAndColumns = setTransposeRowsAndColumns, setXAxisTextStyle = setXAxisTextStyle, setXAxisTitle = setXAxisTitle, setXAxisTitleTextStyle = setXAxisTitleTextStyle, setYAxisTextStyle = setYAxisTextStyle, setYAxisTitle = setYAxisTitle, setYAxisTitleTextStyle = setYAxisTitleTextStyle, useLogScale = useLogScale)
  
    __obj.asInstanceOf[EmbeddedAreaChartBuilder]
  }
}

