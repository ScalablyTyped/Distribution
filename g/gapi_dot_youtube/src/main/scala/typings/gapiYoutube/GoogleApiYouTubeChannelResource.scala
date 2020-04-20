package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeChannelResource extends js.Object {
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: AnonChannel
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: AnonGooglePlusUserId
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
  var invideoPromotion: AnonItems
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: AnonDescription
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: AnonCommentCount
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: AnonIsLinked
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: AnonTopicIds
}

object GoogleApiYouTubeChannelResource {
  @scala.inline
  def apply(
    brandingSettings: AnonChannel,
    contentDetails: AnonGooglePlusUserId,
    etag: String,
    id: String,
    invideoPromotion: AnonItems,
    kind: String,
    snippet: AnonDescription,
    statistics: AnonCommentCount,
    status: AnonIsLinked,
    topicDetails: AnonTopicIds
  ): GoogleApiYouTubeChannelResource = {
    val __obj = js.Dynamic.literal(brandingSettings = brandingSettings.asInstanceOf[js.Any], contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invideoPromotion = invideoPromotion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeChannelResource]
  }
}

