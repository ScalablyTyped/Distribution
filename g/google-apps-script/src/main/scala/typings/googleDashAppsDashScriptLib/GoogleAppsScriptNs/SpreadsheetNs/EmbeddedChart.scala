package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedChart extends js.Object {
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
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
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getContainerInfo: js.Function0[ContainerInfo],
    getHiddenDimensionStrategy: js.Function0[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartHiddenDimensionStrategy
    ],
    getId: js.Function0[java.lang.String],
    getMergeStrategy: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartMergeStrategy],
    getNumHeaders: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getOptions: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.ChartOptions],
    getRanges: js.Function0[js.Array[Range]],
    getTransposeRowsAndColumns: js.Function0[scala.Boolean],
    getType: js.Function0[java.lang.String],
    modify: js.Function0[EmbeddedChartBuilder],
    setId: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs.Chart]
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal(getAs = getAs, getBlob = getBlob, getContainerInfo = getContainerInfo, getHiddenDimensionStrategy = getHiddenDimensionStrategy, getId = getId, getMergeStrategy = getMergeStrategy, getNumHeaders = getNumHeaders, getOptions = getOptions, getRanges = getRanges, getTransposeRowsAndColumns = getTransposeRowsAndColumns, getType = getType, modify = modify, setId = setId)
  
    __obj.asInstanceOf[EmbeddedChart]
  }
}

