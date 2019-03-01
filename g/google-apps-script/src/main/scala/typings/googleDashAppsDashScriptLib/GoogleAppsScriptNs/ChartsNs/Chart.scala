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
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getId: js.Function0[java.lang.String],
    getOptions: js.Function0[ChartOptions],
    getType: js.Function0[java.lang.String],
    setId: js.Function1[java.lang.String, Chart]
  ): Chart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getOptions")(getOptions)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setId")(setId)
    __obj.asInstanceOf[Chart]
  }
}

