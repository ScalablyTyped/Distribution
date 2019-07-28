package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeSubscriptionResource extends js.Object {
  /**
    *
    */
  var contentDetails: Anon_NewItemCount
  /**
    * The ETag of the subscription resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: String
  /**
    * The type of the API resource. For subscription resources, the value will be youtube#subscription.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
    */
  var snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtResourceId
  /**
    *
    */
  var subscriberSnippet: Anon_ChannelIdDescription
}

object GoogleApiYouTubeSubscriptionResource {
  @scala.inline
  def apply(
    contentDetails: Anon_NewItemCount,
    etag: String,
    id: String,
    kind: String,
    snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtResourceId,
    subscriberSnippet: Anon_ChannelIdDescription
  ): GoogleApiYouTubeSubscriptionResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails, etag = etag, id = id, kind = kind, snippet = snippet, subscriberSnippet = subscriberSnippet)
  
    __obj.asInstanceOf[GoogleApiYouTubeSubscriptionResource]
  }
}

