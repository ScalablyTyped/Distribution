package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.LinkId
import typings.gapiClientAnalytics.anon.Maxresults
import typings.gapiClientAnalytics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: LinkId): Request[Unit] = js.native
  /** Adds a new user to the given account. */
  def insert(request: Oauthtoken): Request[EntityUserLink] = js.native
  /** Lists account-user links for a given account. */
  def list(request: Maxresults): Request[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given account. */
  def update(request: LinkId): Request[EntityUserLink] = js.native
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: LinkId => Request[Unit],
    insert: Oauthtoken => Request[EntityUserLink],
    list: Maxresults => Request[EntityUserLinks],
    update: LinkId => Request[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserLinksResource]
  }
  @scala.inline
  implicit class AccountUserLinksResourceOps[Self <: AccountUserLinksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: LinkId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[EntityUserLink]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Maxresults => Request[EntityUserLinks]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: LinkId => Request[EntityUserLink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

