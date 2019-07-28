package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var playlistId: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PlaylistItemSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    playlistId: String = null,
    position: Int | Double = null,
    publishedAt: String = null,
    resourceId: ResourceId = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): PlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlaylistItemSnippet]
  }
}

