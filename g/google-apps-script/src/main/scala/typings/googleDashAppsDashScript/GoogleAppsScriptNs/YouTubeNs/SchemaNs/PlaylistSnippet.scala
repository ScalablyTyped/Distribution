package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistSnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var localized: js.UndefOr[PlaylistLocalization] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PlaylistSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    defaultLanguage: String = null,
    description: String = null,
    localized: PlaylistLocalization = null,
    publishedAt: String = null,
    tags: js.Array[String] = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): PlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (localized != null) __obj.updateDynamic("localized")(localized)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlaylistSnippet]
  }
}

