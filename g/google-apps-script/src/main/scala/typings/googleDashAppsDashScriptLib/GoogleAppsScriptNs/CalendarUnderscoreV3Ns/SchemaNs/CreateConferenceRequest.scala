package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConferenceRequest extends js.Object {
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.undefined
  var requestId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[ConferenceRequestStatus] = js.undefined
}

object CreateConferenceRequest {
  @scala.inline
  def apply(
    conferenceSolutionKey: ConferenceSolutionKey = null,
    requestId: java.lang.String = null,
    status: ConferenceRequestStatus = null
  ): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    if (conferenceSolutionKey != null) __obj.updateDynamic("conferenceSolutionKey")(conferenceSolutionKey)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CreateConferenceRequest]
  }
}

