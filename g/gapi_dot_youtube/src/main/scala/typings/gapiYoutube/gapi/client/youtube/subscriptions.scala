package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonForChannelId
import typings.gapiYoutube.AnonId
import typings.gapiYoutube.AnonPartRequestBody
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeSubscriptionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: AnonPartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: AnonForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
}

object subscriptions {
  @scala.inline
  def apply(
    delete: AnonId => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    insert: AnonPartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    list: AnonForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[subscriptions]
  }
}

