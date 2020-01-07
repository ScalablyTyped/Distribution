package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics about a channel: number of subscribers, number of videos in the
  * channel, etc.
  */
@js.native
trait Schema$ChannelStatistics extends js.Object {
  /**
    * The number of comments for the channel.
    */
  var commentCount: js.UndefOr[String] = js.native
  /**
    * Whether or not the number of subscribers is shown for this user.
    */
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.native
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: js.UndefOr[String] = js.native
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: js.UndefOr[String] = js.native
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: js.UndefOr[String] = js.native
}

object Schema$ChannelStatistics {
  @scala.inline
  def apply(
    commentCount: String = null,
    hiddenSubscriberCount: js.UndefOr[Boolean] = js.undefined,
    subscriberCount: String = null,
    videoCount: String = null,
    viewCount: String = null
  ): Schema$ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenSubscriberCount)) __obj.updateDynamic("hiddenSubscriberCount")(hiddenSubscriberCount.asInstanceOf[js.Any])
    if (subscriberCount != null) __obj.updateDynamic("subscriberCount")(subscriberCount.asInstanceOf[js.Any])
    if (videoCount != null) __obj.updateDynamic("videoCount")(videoCount.asInstanceOf[js.Any])
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelStatistics]
  }
}

