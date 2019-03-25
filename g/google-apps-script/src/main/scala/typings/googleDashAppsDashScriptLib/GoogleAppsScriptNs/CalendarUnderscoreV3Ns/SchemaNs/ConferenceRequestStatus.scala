package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceRequestStatus extends js.Object {
  var statusCode: js.UndefOr[java.lang.String] = js.undefined
}

object ConferenceRequestStatus {
  @scala.inline
  def apply(statusCode: java.lang.String = null): ConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[ConferenceRequestStatus]
  }
}

