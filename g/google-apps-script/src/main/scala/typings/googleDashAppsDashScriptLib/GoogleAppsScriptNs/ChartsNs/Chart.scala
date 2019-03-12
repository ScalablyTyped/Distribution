package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getId(): java.lang.String
  def getOptions(): ChartOptions
  def getType(): java.lang.String
  def setId(id: java.lang.String): Chart
}

object Chart {
  @scala.inline
  def apply(
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getId: () => java.lang.String,
    getOptions: () => ChartOptions,
    getType: () => java.lang.String,
    setId: java.lang.String => Chart
  ): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getId = js.Any.fromFunction0(getId), getOptions = js.Any.fromFunction0(getOptions), getType = js.Any.fromFunction0(getType), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[Chart]
  }
}

