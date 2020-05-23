package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.Alt
import typings.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: Alt): Request[Unit]
  /** Creates a new subscription. */
  def insert(request: Fields): Request[Subscription]
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: Fields): Request[SubscriptionsListResponse]
  /** Updates an existing subscription in place. */
  def update(request: Alt): Request[Subscription]
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
}

