package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeSubscriptionResource extends js.Object {
  /**
    *
    */
  var contentDetails: AnonNewItemCount
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
  var snippet: AnonChannelIdChannelTitle
  /**
    *
    */
  var subscriberSnippet: AnonChannelIdDescription
}

object GoogleApiYouTubeSubscriptionResource {
  @scala.inline
  def apply(
    contentDetails: AnonNewItemCount,
    etag: String,
    id: String,
    kind: String,
    snippet: AnonChannelIdChannelTitle,
    subscriberSnippet: AnonChannelIdDescription
  ): GoogleApiYouTubeSubscriptionResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], subscriberSnippet = subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSubscriptionResource]
  }
}

