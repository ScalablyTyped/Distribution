package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedHistogramChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedHistogramChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedHistogramChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedHistogramChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedHistogramChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setRange(start: stdLib.Number, end: stdLib.Number): EmbeddedHistogramChartBuilder
  def setStacked(): EmbeddedHistogramChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedHistogramChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def setXAxisTitle(title: java.lang.String): EmbeddedHistogramChartBuilder
  def setXAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def setYAxisTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def setYAxisTitle(title: java.lang.String): EmbeddedHistogramChartBuilder
  def setYAxisTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedHistogramChartBuilder
  def useLogScale(): EmbeddedHistogramChartBuilder
}

object EmbeddedHistogramChartBuilder {
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
    reverseCategories: js.Function0[EmbeddedHistogramChartBuilder],
    setBackgroundColor: js.Function1[java.lang.String, EmbeddedHistogramChartBuilder],
    setChartType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType, 
      EmbeddedChartBuilder
    ],
    setColors: js.Function1[js.Array[java.lang.String], EmbeddedHistogramChartBuilder],
    setHiddenDimensionStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy, 
      EmbeddedChartBuilder
    ],
    setLegendPosition: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position, 
      EmbeddedHistogramChartBuilder
    ],
    setLegendTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
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
    setRange: js.Function2[stdLib.Number, stdLib.Number, EmbeddedHistogramChartBuilder],
    setStacked: js.Function0[EmbeddedHistogramChartBuilder],
    setTitle: js.Function1[java.lang.String, EmbeddedHistogramChartBuilder],
    setTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
    ],
    setTransposeRowsAndColumns: js.Function1[scala.Boolean, EmbeddedChartBuilder],
    setXAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
    ],
    setXAxisTitle: js.Function1[java.lang.String, EmbeddedHistogramChartBuilder],
    setXAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
    ],
    setYAxisTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
    ],
    setYAxisTitle: js.Function1[java.lang.String, EmbeddedHistogramChartBuilder],
    setYAxisTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedHistogramChartBuilder
    ],
    useLogScale: js.Function0[EmbeddedHistogramChartBuilder]
  ): EmbeddedHistogramChartBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addRange")(addRange)
    __obj.updateDynamic("asAreaChart")(asAreaChart)
    __obj.updateDynamic("asBarChart")(asBarChart)
    __obj.updateDynamic("asColumnChart")(asColumnChart)
    __obj.updateDynamic("asComboChart")(asComboChart)
    __obj.updateDynamic("asHistogramChart")(asHistogramChart)
    __obj.updateDynamic("asLineChart")(asLineChart)
    __obj.updateDynamic("asPieChart")(asPieChart)
    __obj.updateDynamic("asScatterChart")(asScatterChart)
    __obj.updateDynamic("asTableChart")(asTableChart)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("getChartType")(getChartType)
    __obj.updateDynamic("getContainer")(getContainer)
    __obj.updateDynamic("getRanges")(getRanges)
    __obj.updateDynamic("removeRange")(removeRange)
    __obj.updateDynamic("reverseCategories")(reverseCategories)
    __obj.updateDynamic("setBackgroundColor")(setBackgroundColor)
    __obj.updateDynamic("setChartType")(setChartType)
    __obj.updateDynamic("setColors")(setColors)
    __obj.updateDynamic("setHiddenDimensionStrategy")(setHiddenDimensionStrategy)
    __obj.updateDynamic("setLegendPosition")(setLegendPosition)
    __obj.updateDynamic("setLegendTextStyle")(setLegendTextStyle)
    __obj.updateDynamic("setMergeStrategy")(setMergeStrategy)
    __obj.updateDynamic("setNumHeaders")(setNumHeaders)
    __obj.updateDynamic("setOption")(setOption)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setRange")(setRange)
    __obj.updateDynamic("setStacked")(setStacked)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setTitleTextStyle")(setTitleTextStyle)
    __obj.updateDynamic("setTransposeRowsAndColumns")(setTransposeRowsAndColumns)
    __obj.updateDynamic("setXAxisTextStyle")(setXAxisTextStyle)
    __obj.updateDynamic("setXAxisTitle")(setXAxisTitle)
    __obj.updateDynamic("setXAxisTitleTextStyle")(setXAxisTitleTextStyle)
    __obj.updateDynamic("setYAxisTextStyle")(setYAxisTextStyle)
    __obj.updateDynamic("setYAxisTitle")(setYAxisTitle)
    __obj.updateDynamic("setYAxisTitleTextStyle")(setYAxisTitleTextStyle)
    __obj.updateDynamic("useLogScale")(useLogScale)
    __obj.asInstanceOf[EmbeddedHistogramChartBuilder]
  }
}

