package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAlt
import typings.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a new subscription. */
  def insert(request: AnonFields): Request_[Subscription]
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: AnonFields): Request_[SubscriptionsListResponse]
  /** Updates an existing subscription in place. */
  def update(request: AnonAlt): Request_[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    insert: AnonFields => Request_[Subscription],
    list: AnonFields => Request_[SubscriptionsListResponse],
    update: AnonAlt => Request_[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

