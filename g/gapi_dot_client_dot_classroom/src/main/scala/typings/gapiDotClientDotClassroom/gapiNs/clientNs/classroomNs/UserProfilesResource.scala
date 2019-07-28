package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClassroom.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
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
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[UserProfile]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[UserProfile],
    guardianInvitations: GuardianInvitationsResource,
    guardians: GuardiansResource
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), guardianInvitations = guardianInvitations, guardians = guardians)
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

