package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleAppsScript.GoogleAppsScript.Charts.ChartOptions
import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a chart that has been embedded into a spreadsheet.
  *
  * This example shows how to modify an existing chart:
  *
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A2:B8")
  *     var chart = sheet.getCharts()[0];
  *     chart = chart.modify()
  *         .addRange(range)
  *         .setOption('title', 'Updated!')
  *         .setOption('animation.duration', 500)
  *         .setPosition(2,2,0,0)
  *         .build();
  *     sheet.updateChart(chart);
  *
  * This example shows how to create a new chart:
  *
  *     function newChart(range, sheet) {
  *       var sheet = SpreadsheetApp.getActiveSheet();
  *       var chartBuilder = sheet.newChart();
  *       chartBuilder.addRange(range)
  *           .setChartType(Charts.ChartType.LINE)
  *           .setOption('title', 'My Line Chart!');
  *       sheet.insertChart(chartBuilder.build());
  *     }
  */
@js.native
trait EmbeddedChart extends js.Object {
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getChartId(): Integer | Null = js.native
  def getContainerInfo(): ContainerInfo = js.native
  def getHiddenDimensionStrategy(): ChartHiddenDimensionStrategy = js.native
  def getMergeStrategy(): ChartMergeStrategy = js.native
  def getNumHeaders(): Integer = js.native
  def getOptions(): ChartOptions = js.native
  def getRanges(): js.Array[Range] = js.native
  def getTransposeRowsAndColumns(): Boolean = js.native
  def modify(): EmbeddedChartBuilder = js.native
}

object EmbeddedChart {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getChartId: () => Integer | Null,
    getContainerInfo: () => ContainerInfo,
    getHiddenDimensionStrategy: () => ChartHiddenDimensionStrategy,
    getMergeStrategy: () => ChartMergeStrategy,
    getNumHeaders: () => Integer,
    getOptions: () => ChartOptions,
    getRanges: () => js.Array[Range],
    getTransposeRowsAndColumns: () => Boolean,
    modify: () => EmbeddedChartBuilder
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getChartId = js.Any.fromFunction0(getChartId), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getHiddenDimensionStrategy = js.Any.fromFunction0(getHiddenDimensionStrategy), getMergeStrategy = js.Any.fromFunction0(getMergeStrategy), getNumHeaders = js.Any.fromFunction0(getNumHeaders), getOptions = js.Any.fromFunction0(getOptions), getRanges = js.Any.fromFunction0(getRanges), getTransposeRowsAndColumns = js.Any.fromFunction0(getTransposeRowsAndColumns), modify = js.Any.fromFunction0(modify))
    __obj.asInstanceOf[EmbeddedChart]
  }
  @scala.inline
  implicit class EmbeddedChartOps[Self <: EmbeddedChart] (val x: Self) extends AnyVal {
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
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChartId(value: () => Integer | Null): Self = this.set("getChartId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContainerInfo(value: () => ContainerInfo): Self = this.set("getContainerInfo", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHiddenDimensionStrategy(value: () => ChartHiddenDimensionStrategy): Self = this.set("getHiddenDimensionStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMergeStrategy(value: () => ChartMergeStrategy): Self = this.set("getMergeStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumHeaders(value: () => Integer): Self = this.set("getNumHeaders", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptions(value: () => ChartOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRanges(value: () => js.Array[Range]): Self = this.set("getRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTransposeRowsAndColumns(value: () => Boolean): Self = this.set("getTransposeRowsAndColumns", js.Any.fromFunction0(value))
    @scala.inline
    def setModify(value: () => EmbeddedChartBuilder): Self = this.set("modify", js.Any.fromFunction0(value))
  }
  
}

