package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastSnippet extends js.Object {
  var actualEndTime: js.UndefOr[String] = js.undefined
  var actualStartTime: js.UndefOr[String] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined
  var liveChatId: js.UndefOr[String] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var scheduledEndTime: js.UndefOr[String] = js.undefined
  var scheduledStartTime: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object LiveBroadcastSnippet {
  @scala.inline
  def apply(
    actualEndTime: String = null,
    actualStartTime: String = null,
    channelId: String = null,
    description: String = null,
    isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined,
    liveChatId: String = null,
    publishedAt: String = null,
    scheduledEndTime: String = null,
    scheduledStartTime: String = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): LiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    if (actualEndTime != null) __obj.updateDynamic("actualEndTime")(actualEndTime.asInstanceOf[js.Any])
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultBroadcast)) __obj.updateDynamic("isDefaultBroadcast")(isDefaultBroadcast.asInstanceOf[js.Any])
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveBroadcastSnippet]
  }
}

