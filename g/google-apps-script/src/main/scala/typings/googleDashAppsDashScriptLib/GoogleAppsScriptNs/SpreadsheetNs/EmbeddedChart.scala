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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getContainerInfo")(getContainerInfo)
    __obj.updateDynamic("getHiddenDimensionStrategy")(getHiddenDimensionStrategy)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getMergeStrategy")(getMergeStrategy)
    __obj.updateDynamic("getNumHeaders")(getNumHeaders)
    __obj.updateDynamic("getOptions")(getOptions)
    __obj.updateDynamic("getRanges")(getRanges)
    __obj.updateDynamic("getTransposeRowsAndColumns")(getTransposeRowsAndColumns)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("modify")(modify)
    __obj.updateDynamic("setId")(setId)
    __obj.asInstanceOf[EmbeddedChart]
  }
}

