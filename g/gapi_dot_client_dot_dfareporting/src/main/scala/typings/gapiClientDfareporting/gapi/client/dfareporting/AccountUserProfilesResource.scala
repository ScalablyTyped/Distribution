package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Ids
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserProfilesResource extends js.Object {
  /** Gets one account user profile by ID. */
  def get(request: Fields): Request[AccountUserProfile] = js.native
  /** Inserts a new account user profile. */
  def insert(request: Key): Request[AccountUserProfile] = js.native
  /** Retrieves a list of account user profiles, possibly filtered. This method supports paging. */
  def list(request: Ids): Request[AccountUserProfilesListResponse] = js.native
  /** Updates an existing account user profile. This method supports patch semantics. */
  def patch(request: Fields): Request[AccountUserProfile] = js.native
  /** Updates an existing account user profile. */
  def update(request: Key): Request[AccountUserProfile] = js.native
}

object AccountUserProfilesResource {
  @scala.inline
  def apply(
    get: Fields => Request[AccountUserProfile],
    insert: Key => Request[AccountUserProfile],
    list: Ids => Request[AccountUserProfilesListResponse],
    patch: Fields => Request[AccountUserProfile],
    update: Key => Request[AccountUserProfile]
  ): AccountUserProfilesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserProfilesResource]
  }
  @scala.inline
  implicit class AccountUserProfilesResourceOps[Self <: AccountUserProfilesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[AccountUserProfile]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[AccountUserProfile]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Ids => Request[AccountUserProfilesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[AccountUserProfile]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[AccountUserProfile]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

