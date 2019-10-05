package typings.gapiDotClientDotMirror.gapi.client.mirror

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMirror.Anon_Alt
import typings.gapiDotClientDotMirror.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Creates a new subscription. */
  def insert(request: Anon_AltFields): Request[Subscription]
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: Anon_AltFields): Request[SubscriptionsListResponse]
  /** Updates an existing subscription in place. */
  def update(request: Anon_Alt): Request[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    insert: Anon_AltFields => Request[Subscription],
    list: Anon_AltFields => Request[SubscriptionsListResponse],
    update: Anon_Alt => Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

