package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeChannelResource extends js.Object {
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: Anon_Channel
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: Anon_GooglePlusUserId
  /**
    * The ETag for the channel resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: String
  /**
    * The invideoPromotion object encapsulates information about a promotional campaign associated with the channel. A channel can use an in-video promotional campaign to display the thumbnail image of a promoted video in the video player during playback of the channels videos
    */
  var invideoPromotion: Anon_Items
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: Anon_Description
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: Anon_CommentCount
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: Anon_IsLinked
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: Anon_TopicIds
}

object GoogleApiYouTubeChannelResource {
  @scala.inline
  def apply(
    brandingSettings: Anon_Channel,
    contentDetails: Anon_GooglePlusUserId,
    etag: String,
    id: String,
    invideoPromotion: Anon_Items,
    kind: String,
    snippet: Anon_Description,
    statistics: Anon_CommentCount,
    status: Anon_IsLinked,
    topicDetails: Anon_TopicIds
  ): GoogleApiYouTubeChannelResource = {
    val __obj = js.Dynamic.literal(brandingSettings = brandingSettings.asInstanceOf[js.Any], contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invideoPromotion = invideoPromotion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubeChannelResource]
  }
}

