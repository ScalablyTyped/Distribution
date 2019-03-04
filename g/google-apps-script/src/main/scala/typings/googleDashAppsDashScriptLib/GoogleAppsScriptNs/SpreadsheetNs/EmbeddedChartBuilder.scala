package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChartBuilder extends js.Object {
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
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
}

object EmbeddedChartBuilder {
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
    setChartType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType, 
      EmbeddedChartBuilder
    ],
    setHiddenDimensionStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy, 
      EmbeddedChartBuilder
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
    setTransposeRowsAndColumns: js.Function1[scala.Boolean, EmbeddedChartBuilder]
  ): EmbeddedChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = addRange, asAreaChart = asAreaChart, asBarChart = asBarChart, asColumnChart = asColumnChart, asComboChart = asComboChart, asHistogramChart = asHistogramChart, asLineChart = asLineChart, asPieChart = asPieChart, asScatterChart = asScatterChart, asTableChart = asTableChart, build = build, getChartType = getChartType, getContainer = getContainer, getRanges = getRanges, removeRange = removeRange, setChartType = setChartType, setHiddenDimensionStrategy = setHiddenDimensionStrategy, setMergeStrategy = setMergeStrategy, setNumHeaders = setNumHeaders, setOption = setOption, setPosition = setPosition, setTransposeRowsAndColumns = setTransposeRowsAndColumns)
  
    __obj.asInstanceOf[EmbeddedChartBuilder]
  }
}

