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

