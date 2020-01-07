package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a subscription&#39;s subscriber including title,
  * description, channel ID and thumbnails.
  */
@js.native
trait Schema$SubscriptionSubscriberSnippet extends js.Object {
  /**
    * The channel ID of the subscriber.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The description of the subscriber.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Thumbnails for this subscriber.
    */
  var thumbnails: js.UndefOr[Schema$ThumbnailDetails] = js.native
  /**
    * The title of the subscriber.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$SubscriptionSubscriberSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    description: String = null,
    thumbnails: Schema$ThumbnailDetails = null,
    title: String = null
  ): Schema$SubscriptionSubscriberSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionSubscriberSnippet]
  }
}

