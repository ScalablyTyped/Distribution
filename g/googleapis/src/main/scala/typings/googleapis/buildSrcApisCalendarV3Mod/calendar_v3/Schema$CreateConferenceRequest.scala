package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$CreateConferenceRequest extends js.Object {
  /**
    * The conference solution, such as Hangouts or Hangouts Meet.
    */
  var conferenceSolutionKey: js.UndefOr[Schema$ConferenceSolutionKey] = js.native
  /**
    * The client-generated unique ID for this request. Clients should
    * regenerate this ID for every new request. If an ID provided is the same
    * as for the previous request, the request is ignored.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The status of the conference create request.
    */
  var status: js.UndefOr[Schema$ConferenceRequestStatus] = js.native
}

object Schema$CreateConferenceRequest {
  @scala.inline
  def apply(
    conferenceSolutionKey: Schema$ConferenceSolutionKey = null,
    requestId: String = null,
    status: Schema$ConferenceRequestStatus = null
  ): Schema$CreateConferenceRequest = {
    val __obj = js.Dynamic.literal()
    if (conferenceSolutionKey != null) __obj.updateDynamic("conferenceSolutionKey")(conferenceSolutionKey.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateConferenceRequest]
  }
}

