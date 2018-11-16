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

