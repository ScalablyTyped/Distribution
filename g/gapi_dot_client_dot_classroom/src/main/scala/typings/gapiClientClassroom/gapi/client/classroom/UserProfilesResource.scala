package typings.gapiClientClassroom.gapi.client.classroom

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClassroom.anon.QuotaUserUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfilesResource extends js.Object {
  var guardianInvitations: GuardianInvitationsResource = js.native
  var guardians: GuardiansResource = js.native
  /**
    * Returns a user profile.
    *
    * This method returns the following error codes:
    *
    * &#42; `PERMISSION_DENIED` if the requesting user is not permitted to access
    * this user profile, if no profile exists with the requested ID, or for
    * access errors.
    */
  def get(): Request[UserProfile] = js.native
  def get(request: QuotaUserUploadType): Request[UserProfile] = js.native
}

