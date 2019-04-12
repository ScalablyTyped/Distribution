package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getChartId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getContainerInfo(): ContainerInfo
  def getHiddenDimensionStrategy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
  def getId(): java.lang.String
  def getMergeStrategy(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy
  def getNumHeaders(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getOptions(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartOptions
  def getRanges(): js.Array[Range]
  def getTransposeRowsAndColumns(): scala.Boolean
  def getType(): java.lang.String
  def modify(): EmbeddedChartBuilder
  def setId(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Chart
}

object EmbeddedChart {
  @scala.inline
  def apply(
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getChartId: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getContainerInfo: () => ContainerInfo,
    getHiddenDimensionStrategy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy,
    getId: () => java.lang.String,
    getMergeStrategy: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy,
    getNumHeaders: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getOptions: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartOptions,
    getRanges: () => js.Array[Range],
    getTransposeRowsAndColumns: () => scala.Boolean,
    getType: () => java.lang.String,
    modify: () => EmbeddedChartBuilder,
    setId: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Chart
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getChartId = js.Any.fromFunction0(getChartId), getContainerInfo = js.Any.fromFunction0(getContainerInfo), getHiddenDimensionStrategy = js.Any.fromFunction0(getHiddenDimensionStrategy), getId = js.Any.fromFunction0(getId), getMergeStrategy = js.Any.fromFunction0(getMergeStrategy), getNumHeaders = js.Any.fromFunction0(getNumHeaders), getOptions = js.Any.fromFunction0(getOptions), getRanges = js.Any.fromFunction0(getRanges), getTransposeRowsAndColumns = js.Any.fromFunction0(getTransposeRowsAndColumns), getType = js.Any.fromFunction0(getType), modify = js.Any.fromFunction0(modify), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[EmbeddedChart]
  }
}

