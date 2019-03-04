package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  var guardianInvitations: GuardianInvitationsResource
  var guardians: GuardiansResource
  /**
    * Returns a user profile.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * this user profile, if no profile exists with the requested ID, or for
    * access errors.
    */
  def get(request: gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotClassroomLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp, 
      gapiDotClientLib.gapiNs.clientNs.Request[UserProfile]
    ],
    guardianInvitations: GuardianInvitationsResource,
    guardians: GuardiansResource
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = get, guardianInvitations = guardianInvitations, guardians = guardians)
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

