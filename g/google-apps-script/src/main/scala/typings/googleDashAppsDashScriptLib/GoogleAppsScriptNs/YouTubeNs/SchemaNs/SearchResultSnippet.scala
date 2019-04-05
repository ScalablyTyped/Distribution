package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var liveBroadcastContent: js.UndefOr[java.lang.String] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SearchResultSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    description: java.lang.String = null,
    liveBroadcastContent: java.lang.String = null,
    publishedAt: java.lang.String = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
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

