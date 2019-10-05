package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.Chart
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typings.googleDashAppsDashScript.GoogleAppsScript.Charts.ChartOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getChartId(): Integer | Null
  def getContainerInfo(): ContainerInfo
  def getHiddenDimensionStrategy(): ChartHiddenDimensionStrategy
  def getId(): String
  def getMergeStrategy(): ChartMergeStrategy
  def getNumHeaders(): Integer
  def getOptions(): ChartOptions
  def getRanges(): js.Array[Range]
  def getTransposeRowsAndColumns(): Boolean
  def getType(): String
  def modify(): EmbeddedChartBuilder
  def setId(id: String): Chart
}

object EmbeddedChart {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getChartId: () => Integer | Null,
    getContainerInfo: () => ContainerInfo,
    getHiddenDimensionStrategy: () => ChartHiddenDimensionStrategy,
    getId: () => String,
    getMergeStrategy: () => ChartMergeStrategy,
    getNumHeaders: () => Integer,
    getOptions: () => ChartOptions,
    getRanges: () => js.Array[Range],
    getTransposeRowsAndColumns: () => Boolean,
    getType: () => String,
    modify: () => EmbeddedChartBuilder,
    setId: String => Chart
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getChartId = js.Any.fromFunction0(getChartId), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getHiddenDimensionStrategy = js.Any.fromFunction0(getHiddenDimensionStrategy), getId = js.Any.fromFunction0(getId), getMergeStrategy = js.Any.fromFunction0(getMergeStrategy), getNumHeaders = js.Any.fromFunction0(getNumHeaders), getOptions = js.Any.fromFunction0(getOptions), getRanges = js.Any.fromFunction0(getRanges), getTransposeRowsAndColumns = js.Any.fromFunction0(getTransposeRowsAndColumns), getType = js.Any.fromFunction0(getType), modify = js.Any.fromFunction0(modify), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[EmbeddedChart]
  }
}

