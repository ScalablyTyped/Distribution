package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.AltFields
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: AltFields): Request[Unit] = js.native
  /** Adds a new user to the given web property. */
  def insert(request: QuotaUser): Request[EntityUserLink] = js.native
  /** Lists webProperty-user links for a given web property. */
  def list(request: PrettyPrint): Request[EntityUserLinks] = js.native
  /** Updates permissions for an existing user on the given web property. */
  def update(request: AltFields): Request[EntityUserLink] = js.native
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: AltFields => Request[Unit],
    insert: QuotaUser => Request[EntityUserLink],
    list: PrettyPrint => Request[EntityUserLinks],
    update: AltFields => Request[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
  @scala.inline
  implicit class WebpropertyUserLinksResourceOps[Self <: WebpropertyUserLinksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: AltFields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[EntityUserLink]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[EntityUserLinks]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: AltFields => Request[EntityUserLink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

