package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Fields
import typings.gapiClientPartners.anon.Key
import typings.gapiClientPartners.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: Key): Request[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: Key): Request[js.Object]
  /** Gets a user. */
  def get(request: Oauthtoken): Request[User]
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: Fields): Request[UserProfile]
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: Key => Request[CompanyRelation],
    deleteCompanyRelation: Key => Request[js.Object],
    get: Oauthtoken => Request[User],
    updateProfile: Fields => Request[UserProfile]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(createCompanyRelation = js.Any.fromFunction1(createCompanyRelation), deleteCompanyRelation = js.Any.fromFunction1(deleteCompanyRelation), get = js.Any.fromFunction1(get), updateProfile = js.Any.fromFunction1(updateProfile))
    __obj.asInstanceOf[UsersResource]
  }
}

