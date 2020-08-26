package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Creates a new subscription. */
  def insert(request: Fields): Request[Subscription] = js.native
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: Fields): Request[SubscriptionsListResponse] = js.native
  /** Updates an existing subscription in place. */
  def update(request: Alt): Request[Subscription] = js.native
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    insert: Fields => Request[Subscription],
    list: Fields => Request[SubscriptionsListResponse],
    update: Alt => Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubscriptionsResource]
  }
  @scala.inline
  implicit class SubscriptionsResourceOps[Self <: SubscriptionsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Fields => Request[Subscription]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[SubscriptionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[Subscription]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

