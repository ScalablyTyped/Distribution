package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.SubscriptionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsCollection extends js.Object {
  // Creates a new subscription.
  def insert(resource: Subscription): Subscription
  // Retrieves a list of subscriptions for the authenticated user and service.
  def list(): SubscriptionsListResponse
  // Deletes a subscription.
  def remove(id: String): Unit
  // Updates an existing subscription in place.
  def update(resource: Subscription, id: String): Subscription
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
}

