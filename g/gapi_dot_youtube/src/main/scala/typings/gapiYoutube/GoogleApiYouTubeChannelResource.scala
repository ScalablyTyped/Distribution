package typings.gapiYoutube

import typings.gapiYoutube.anon.Channel
import typings.gapiYoutube.anon.CommentCount
import typings.gapiYoutube.anon.Description
import typings.gapiYoutube.anon.GooglePlusUserId
import typings.gapiYoutube.anon.IsLinked
import typings.gapiYoutube.anon.Items
import typings.gapiYoutube.anon.TopicIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeChannelResource extends js.Object {
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: Channel = js.native
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: GooglePlusUserId = js.native
  /**
    * The ETag for the channel resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: String = js.native
  /**
    * The invideoPromotion object encapsulates information about a promotional campaign associated with the channel. A channel can use an in-video promotional campaign to display the thumbnail image of a promoted video in the video player during playback of the channels videos
    */
  var invideoPromotion: Items = js.native
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: Description = js.native
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: CommentCount = js.native
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: IsLinked = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: TopicIds = js.native
}

object GoogleApiYouTubeChannelResource {
  @scala.inline
  def apply(
    brandingSettings: Channel,
    contentDetails: GooglePlusUserId,
    etag: String,
    id: String,
    invideoPromotion: Items,
    kind: String,
    snippet: Description,
    statistics: CommentCount,
    status: IsLinked,
    topicDetails: TopicIds
  ): GoogleApiYouTubeChannelResource = {
    val __obj = js.Dynamic.literal(brandingSettings = brandingSettings.asInstanceOf[js.Any], contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invideoPromotion = invideoPromotion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeChannelResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeChannelResourceOps[Self <: GoogleApiYouTubeChannelResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrandingSettings(value: Channel): Self = this.set("brandingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentDetails(value: GooglePlusUserId): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvideoPromotion(value: Items): Self = this.set("invideoPromotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: Description): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: CommentCount): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IsLinked): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicDetails(value: TopicIds): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
  }
  
}

