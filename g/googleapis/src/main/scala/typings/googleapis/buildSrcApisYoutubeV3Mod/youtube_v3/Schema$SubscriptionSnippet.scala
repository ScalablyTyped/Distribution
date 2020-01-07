package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a subscription, including title, description and
  * thumbnails of the subscribed item.
  */
@js.native
trait Schema$SubscriptionSnippet extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the subscriber&#39;s
    * channel.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Channel title for the channel that the subscription belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * The subscription&#39;s details.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The date and time that the subscription was created. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The id object contains information about the channel that the user
    * subscribed to.
    */
  var resourceId: js.UndefOr[Schema$ResourceId] = js.native
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[Schema$ThumbnailDetails] = js.native
  /**
    * The subscription&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$SubscriptionSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    publishedAt: String = null,
    resourceId: Schema$ResourceId = null,
    thumbnails: Schema$ThumbnailDetails = null,
    title: String = null
  ): Schema$SubscriptionSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubscriptionSnippet]
  }
}

