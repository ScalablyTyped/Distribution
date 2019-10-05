package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var liveBroadcastContent: js.UndefOr[String] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object SearchResultSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    liveBroadcastContent: String = null,
    publishedAt: String = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): SearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (liveBroadcastContent != null) __obj.updateDynamic("liveBroadcastContent")(liveBroadcastContent)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SearchResultSnippet]
  }
}

