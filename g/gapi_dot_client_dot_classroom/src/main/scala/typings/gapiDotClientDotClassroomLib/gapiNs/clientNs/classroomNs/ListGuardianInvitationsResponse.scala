package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListGuardianInvitationsResponse extends js.Object {
  /** Guardian invitations that matched the list request. */
  var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.undefined
  /**
               * Token identifying the next page of results to return. If empty, no further
               * results are available.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

