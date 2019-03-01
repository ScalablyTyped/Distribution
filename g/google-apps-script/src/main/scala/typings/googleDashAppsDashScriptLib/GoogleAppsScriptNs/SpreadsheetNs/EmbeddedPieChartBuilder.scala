package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def getChartType(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType
  def getContainer(): ContainerInfo
  def getRanges(): js.Array[Range]
  def removeRange(range: Range): EmbeddedChartBuilder
  def reverseCategories(): EmbeddedPieChartBuilder
  def set3D(): EmbeddedPieChartBuilder
  def setBackgroundColor(cssValue: java.lang.String): EmbeddedPieChartBuilder
  def setChartType(`type`: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[java.lang.String]): EmbeddedPieChartBuilder
  def setHiddenDimensionStrategy(strategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position): EmbeddedPieChartBuilder
  def setLegendTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedPieChartBuilder
  def setMergeStrategy(mergeStrategy: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): EmbeddedChartBuilder
  def setOption(option: java.lang.String, value: js.Object): EmbeddedChartBuilder
  def setPosition(
    anchorRowPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    anchorColPos: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetX: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    offsetY: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): EmbeddedChartBuilder
  def setTitle(chartTitle: java.lang.String): EmbeddedPieChartBuilder
  def setTitleTextStyle(textStyle: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle): EmbeddedPieChartBuilder
  def setTransposeRowsAndColumns(transpose: scala.Boolean): EmbeddedChartBuilder
}

object EmbeddedPieChartBuilder {
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
    reverseCategories: js.Function0[EmbeddedPieChartBuilder],
    set3D: js.Function0[EmbeddedPieChartBuilder],
    setBackgroundColor: js.Function1[java.lang.String, EmbeddedPieChartBuilder],
    setChartType: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartType, 
      EmbeddedChartBuilder
    ],
    setColors: js.Function1[js.Array[java.lang.String], EmbeddedPieChartBuilder],
    setHiddenDimensionStrategy: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy, 
      EmbeddedChartBuilder
    ],
    setLegendPosition: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Position, 
      EmbeddedPieChartBuilder
    ],
    setLegendTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedPieChartBuilder
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
    setTitle: js.Function1[java.lang.String, EmbeddedPieChartBuilder],
    setTitleTextStyle: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.TextStyle, 
      EmbeddedPieChartBuilder
    ],
    setTransposeRowsAndColumns: js.Function1[scala.Boolean, EmbeddedChartBuilder]
  ): EmbeddedPieChartBuilder = {
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
    __obj.updateDynamic("set3D")(set3D)
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
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setTitleTextStyle")(setTitleTextStyle)
    __obj.updateDynamic("setTransposeRowsAndColumns")(setTransposeRowsAndColumns)
    __obj.asInstanceOf[EmbeddedPieChartBuilder]
  }
}

