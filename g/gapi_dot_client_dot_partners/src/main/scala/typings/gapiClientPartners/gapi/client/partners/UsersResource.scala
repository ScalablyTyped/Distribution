package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonFields
import typings.gapiClientPartners.AnonKey
import typings.gapiClientPartners.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: AnonKey): Request_[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: AnonKey): Request_[js.Object]
  /** Gets a user. */
  def get(request: AnonOauthtoken): Request_[User]
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: AnonFields): Request_[UserProfile]
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: AnonKey => Request_[CompanyRelation],
    deleteCompanyRelation: AnonKey => Request_[js.Object],
    get: AnonOauthtoken => Request_[User],
    updateProfile: AnonFields => Request_[UserProfile]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(createCompanyRelation = js.Any.fromFunction1(createCompanyRelation), deleteCompanyRelation = js.Any.fromFunction1(deleteCompanyRelation), get = js.Any.fromFunction1(get), updateProfile = js.Any.fromFunction1(updateProfile))
    __obj.asInstanceOf[UsersResource]
  }
}

