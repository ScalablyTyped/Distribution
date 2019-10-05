package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionSubscriberSnippet extends js.Object {
  /** The channel ID of the subscriber. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The description of the subscriber. */
  var description: js.UndefOr[String] = js.undefined
  /** Thumbnails for this subscriber. */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The title of the subscriber. */
  var title: js.UndefOr[String] = js.undefined
}

object SubscriptionSubscriberSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    description: String = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): SubscriptionSubscriberSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SubscriptionSubscriberSnippet]
  }
}

