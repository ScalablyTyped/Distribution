package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClassroom.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
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
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[UserProfile]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[UserProfile],
    guardianInvitations: GuardianInvitationsResource,
    guardians: GuardiansResource
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), guardianInvitations = guardianInvitations.asInstanceOf[js.Any], guardians = guardians.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

