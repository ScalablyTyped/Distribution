package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.SubscriptionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionsCollection extends js.Object {
  // Creates a new subscription.
  def insert(resource: Subscription): Subscription = js.native
  // Retrieves a list of subscriptions for the authenticated user and service.
  def list(): SubscriptionsListResponse = js.native
  // Deletes a subscription.
  def remove(id: String): Unit = js.native
  // Updates an existing subscription in place.
  def update(resource: Subscription, id: String): Subscription = js.native
}

object SubscriptionsCollection {
  @scala.inline
  def apply(
    insert: Subscription => Subscription,
    list: () => SubscriptionsListResponse,
    remove: String => Unit,
    update: (Subscription, String) => Subscription
  ): SubscriptionsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SubscriptionsCollection]
  }
  @scala.inline
  implicit class SubscriptionsCollectionOps[Self <: SubscriptionsCollection] (val x: Self) extends AnyVal {
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
    def setInsert(value: Subscription => Subscription): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => SubscriptionsListResponse): Self = this.set("list", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: (Subscription, String) => Subscription): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

