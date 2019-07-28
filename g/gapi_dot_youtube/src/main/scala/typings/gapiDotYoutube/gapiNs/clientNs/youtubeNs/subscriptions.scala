package typings.gapiDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotYoutube.Anon_ChannelIdForChannelId
import typings.gapiDotYoutube.Anon_Id
import typings.gapiDotYoutube.Anon_PartRequestBody
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiDotYoutube.GoogleApiYouTubeSubscriptionResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: Anon_Id): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: Anon_PartRequestBody): HttpRequest[GoogleApiYouTubeSubscriptionResource]
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: Anon_ChannelIdForChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
}

object subscriptions {
  @scala.inline
  def apply(
    delete: Anon_Id => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    insert: Anon_PartRequestBody => HttpRequest[GoogleApiYouTubeSubscriptionResource],
    list: Anon_ChannelIdForChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSubscriptionResource]]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[subscriptions]
  }
}

