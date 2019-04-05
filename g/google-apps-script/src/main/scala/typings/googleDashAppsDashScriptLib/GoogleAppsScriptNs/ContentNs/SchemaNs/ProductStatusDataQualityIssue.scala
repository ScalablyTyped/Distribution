package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDataQualityIssue extends js.Object {
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var detail: js.UndefOr[java.lang.String] = js.undefined
  var fetchStatus: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  var valueOnLandingPage: js.UndefOr[java.lang.String] = js.undefined
  var valueProvided: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatusDataQualityIssue {
  @scala.inline
  def apply(
    destination: java.lang.String = null,
    detail: java.lang.String = null,
    fetchStatus: java.lang.String = null,
    id: java.lang.String = null,
    location: java.lang.String = null,
    severity: java.lang.String = null,
    timestamp: java.lang.String = null,
    valueOnLandingPage: java.lang.String = null,
    valueProvided: java.lang.String = null
  ): ProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (fetchStatus != null) __obj.updateDynamic("fetchStatus")(fetchStatus)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage)
    if (valueProvided != null) __obj.updateDynamic("valueProvided")(valueProvided)
    __obj.asInstanceOf[ProductStatusDataQualityIssue]
  }
}

