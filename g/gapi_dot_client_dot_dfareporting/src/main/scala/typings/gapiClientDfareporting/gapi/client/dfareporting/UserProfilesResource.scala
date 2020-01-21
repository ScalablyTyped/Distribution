package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsKey
import typings.gapiClientDfareporting.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilesResource extends js.Object {
  /** Gets one user profile by ID. */
  def get(request: AnonAltFieldsKey): Request_[UserProfile]
  /** Retrieves list of user profiles for a user. */
  def list(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[UserProfileList]
}

object UserProfilesResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsKey => Request_[UserProfile],
    list: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[UserProfileList]
  ): UserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[UserProfilesResource]
  }
}

