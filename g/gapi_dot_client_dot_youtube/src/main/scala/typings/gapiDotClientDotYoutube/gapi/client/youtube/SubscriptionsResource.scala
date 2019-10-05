package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_Alt
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdFieldsForChannelId
import typings.gapiDotClientDotYoutube.Anon_AltFieldsIdKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: Anon_AltFieldsIdKeyOauthtokenPrettyPrint): Request[Unit]
  /** Adds a subscription for the authenticated user's channel. */
  def insert(request: Anon_Alt): Request[Subscription]
  /** Returns subscription resources that match the API request criteria. */
  def list(request: Anon_AltChannelIdFieldsForChannelId): Request[SubscriptionListResponse]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsIdKeyOauthtokenPrettyPrint => Request[Unit],
    insert: Anon_Alt => Request[Subscription],
    list: Anon_AltChannelIdFieldsForChannelId => Request[SubscriptionListResponse]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

