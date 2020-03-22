package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonAlt
import typings.gapiClientYoutube.AnonForChannelId
import typings.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a subscription for the authenticated user's channel. */
  def insert(request: AnonAlt): Request_[Subscription]
  /** Returns subscription resources that match the API request criteria. */
  def list(request: AnonForChannelId): Request_[SubscriptionListResponse]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => Request_[Unit],
    insert: AnonAlt => Request_[Subscription],
    list: AnonForChannelId => Request_[SubscriptionListResponse]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

