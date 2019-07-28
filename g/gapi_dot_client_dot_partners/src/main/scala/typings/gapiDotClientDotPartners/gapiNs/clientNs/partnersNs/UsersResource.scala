package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import typings.gapiDotClientDotPartners.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[CompanyRelation]
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /** Gets a user. */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[User]
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[UserProfile]
}

object UsersResource {
  @scala.inline
  def apply(
    createCompanyRelation: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[CompanyRelation],
    deleteCompanyRelation: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[User],
    updateProfile: Anon_AccesstokenAltBearertokenCallbackFields => Request[UserProfile]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(createCompanyRelation = js.Any.fromFunction1(createCompanyRelation), deleteCompanyRelation = js.Any.fromFunction1(deleteCompanyRelation), get = js.Any.fromFunction1(get), updateProfile = js.Any.fromFunction1(updateProfile))
  
    __obj.asInstanceOf[UsersResource]
  }
}

