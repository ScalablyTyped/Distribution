package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.WebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: WebPropertyId): Request[Unit] = js.native
  /** Adds a new user to the given view (profile). */
  def insert(request: ProfileId): Request[EntityUserLink] = js.native
  /** Lists profile-user links for a given view (profile). */
  def list(request: Startindex): Request[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: WebPropertyId): Request[EntityUserLink] = js.native
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: WebPropertyId => Request[Unit],
    insert: ProfileId => Request[EntityUserLink],
    list: Startindex => Request[EntityUserLinks],
    update: WebPropertyId => Request[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
  @scala.inline
  implicit class ProfileUserLinksResourceOps[Self <: ProfileUserLinksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: WebPropertyId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[EntityUserLink]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Startindex => Request[EntityUserLinks]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: WebPropertyId => Request[EntityUserLink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

