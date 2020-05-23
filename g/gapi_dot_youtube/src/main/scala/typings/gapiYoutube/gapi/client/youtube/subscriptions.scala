package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeSubscriptionResource
import typings.gapiYoutube.anon.ForChannelId
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.PartRequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: PartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: ForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
}

object subscriptions {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    insert: PartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    list: ForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[subscriptions]
  }
}

