package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Fields
import typings.gapiClientPartners.anon.Key
import typings.gapiClientPartners.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  /** Creates a user's company relation. Affiliates the user to a company. */
  def createCompanyRelation(request: Key): Request[CompanyRelation] = js.native
  /** Deletes a user's company relation. Unaffiliaites the user from a company. */
  def deleteCompanyRelation(request: Key): Request[js.Object] = js.native
  /** Gets a user. */
  def get(request: Oauthtoken): Request[User] = js.native
  /**
    * Updates a user's profile. A user can only update their own profile and
    * should only be called within the context of a logged in user.
    */
  def updateProfile(request: Fields): Request[UserProfile] = js.native
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
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateCompanyRelation(value: Key => Request[CompanyRelation]): Self = this.set("createCompanyRelation", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteCompanyRelation(value: Key => Request[js.Object]): Self = this.set("deleteCompanyRelation", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Oauthtoken => Request[User]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateProfile(value: Fields => Request[UserProfile]): Self = this.set("updateProfile", js.Any.fromFunction1(value))
  }
  
}

