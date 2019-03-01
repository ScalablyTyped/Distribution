package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  /** Invitations that match the list request. */
  var invitations: js.UndefOr[js.Array[Invitation]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(invitations: js.Array[Invitation] = null, nextPageToken: java.lang.String = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (invitations != null) __obj.updateDynamic("invitations")(invitations)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

