package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastSnippet extends js.Object {
  var actualEndTime: js.UndefOr[java.lang.String] = js.undefined
  var actualStartTime: js.UndefOr[java.lang.String] = js.undefined
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDefaultBroadcast: js.UndefOr[scala.Boolean] = js.undefined
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var scheduledEndTime: js.UndefOr[java.lang.String] = js.undefined
  var scheduledStartTime: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object LiveBroadcastSnippet {
  @scala.inline
  def apply(
    actualEndTime: java.lang.String = null,
    actualStartTime: java.lang.String = null,
    channelId: java.lang.String = null,
    description: java.lang.String = null,
    isDefaultBroadcast: js.UndefOr[scala.Boolean] = js.undefined,
    liveChatId: java.lang.String = null,
    publishedAt: java.lang.String = null,
    scheduledEndTime: java.lang.String = null,
    scheduledStartTime: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
  ): LiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    if (actualEndTime != null) __obj.updateDynamic("actualEndTime")(actualEndTime)
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isDefaultBroadcast)) __obj.updateDynamic("isDefaultBroadcast")(isDefaultBroadcast)
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (scheduledEndTime != null) __obj.updateDynamic("scheduledEndTime")(scheduledEndTime)
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LiveBroadcastSnippet]
  }
}

