package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSessionsResponse extends js.Object {
  /**
    * `next_page_token` can be sent in a subsequent
    * ListSessions call to fetch more of the matching
    * sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of requested sessions. */
  var sessions: js.UndefOr[js.Array[Session]] = js.undefined
}

object ListSessionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sessions: js.Array[Session] = null): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSessionsResponse]
  }
}

