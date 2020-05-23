package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConferenceRequest extends js.Object {
  /** The conference solution, such as Hangouts or Google Meet. */
  var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.undefined
  /**
    * The client-generated unique ID for this request.
    * Clients should regenerate this ID for every new request. If an ID provided is the same as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.undefined
  /** The status of the conference create request. */
  var status: js.UndefOr[ConferenceRequestStatus] = js.undefined
}

object CreateConferenceRequest {
  @scala.inline
  def apply(
    conferenceSolutionKey: ConferenceSolutionKey = null,
    requestId: String = null,
    status: ConferenceRequestStatus = null
  ): CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    if (conferenceSolutionKey != null) __obj.updateDynamic("conferenceSolutionKey")(conferenceSolutionKey.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceRequest]
  }
}

