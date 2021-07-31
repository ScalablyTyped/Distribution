package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for table charts. For more details, see the Gviz documentation.
  */
@js.native
trait EmbeddedTableChartBuilder extends StObject {
  
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
  
  def enablePaging(enablePaging: Boolean): EmbeddedTableChartBuilder = js.native
  def enablePaging(pageSize: Integer): EmbeddedTableChartBuilder = js.native
  def enablePaging(pageSize: Integer, startPage: Integer): EmbeddedTableChartBuilder = js.native
  
  def enableRtlTable(rtlEnabled: Boolean): EmbeddedTableChartBuilder = js.native
  
  def enableSorting(enableSorting: Boolean): EmbeddedTableChartBuilder = js.native
  
  def getChartType(): ChartType = js.native
  
  def getContainer(): ContainerInfo = js.native
  
  def getRanges(): js.Array[Range] = js.native
  
  def removeRange(range: Range): EmbeddedChartBuilder = js.native
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder = js.native
  
  def setFirstRowNumber(number: Integer): EmbeddedTableChartBuilder = js.native
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder = js.native
  
  def setInitialSortingAscending(column: Integer): EmbeddedTableChartBuilder = js.native
  
  def setInitialSortingDescending(column: Integer): EmbeddedTableChartBuilder = js.native
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder = js.native
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder = js.native
  
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder = js.native
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder = js.native
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder = js.native
  
  def showRowNumberColumn(showRowNumber: Boolean): EmbeddedTableChartBuilder = js.native
  
  def useAlternatingRowStyle(alternate: Boolean): EmbeddedTableChartBuilder = js.native
}
