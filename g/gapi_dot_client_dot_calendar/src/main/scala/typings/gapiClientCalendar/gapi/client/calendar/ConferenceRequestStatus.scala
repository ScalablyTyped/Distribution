package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceRequestStatus extends js.Object {
  /**
    * The current status of the conference create request. Read-only.
    * The possible values are:
    * - "pending": the conference create request is still being processed.
    * - "success": the conference create request succeeded, the entry points are populated.
    * - "failure": the conference create request failed, there are no entry points.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}

object ConferenceRequestStatus {
  @scala.inline
  def apply(statusCode: String = null): ConferenceRequestStatus = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceRequestStatus]
  }
}

