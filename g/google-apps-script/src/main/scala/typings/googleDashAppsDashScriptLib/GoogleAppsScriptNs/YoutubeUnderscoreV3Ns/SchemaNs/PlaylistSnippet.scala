package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistSnippet extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var localized: js.UndefOr[PlaylistLocalization] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    description: java.lang.String = null,
    localized: PlaylistLocalization = null,
    publishedAt: java.lang.String = null,
    tags: js.Array[java.lang.String] = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
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

