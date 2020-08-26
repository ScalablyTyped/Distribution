package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSessionsResponse extends js.Object {
  /**
    * `next_page_token` can be sent in a subsequent
    * ListSessions call to fetch more of the matching
    * sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of requested sessions. */
  var sessions: js.UndefOr[js.Array[Session]] = js.native
}

object ListSessionsResponse {
  @scala.inline
  def apply(): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSessionsResponse]
  }
  @scala.inline
  implicit class ListSessionsResponseOps[Self <: ListSessionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = this.set("sessions", js.Array(value :_*))
    @scala.inline
    def setSessions(value: js.Array[Session]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
  }
  
}

