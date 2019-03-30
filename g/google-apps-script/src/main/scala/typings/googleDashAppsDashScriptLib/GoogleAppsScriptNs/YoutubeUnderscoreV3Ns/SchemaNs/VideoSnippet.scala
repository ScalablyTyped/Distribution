package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSnippet extends js.Object {
  var categoryId: js.UndefOr[java.lang.String] = js.undefined
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  var defaultAudioLanguage: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var liveBroadcastContent: js.UndefOr[java.lang.String] = js.undefined
  var localized: js.UndefOr[VideoLocalization] = js.undefined
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object VideoSnippet {
  @scala.inline
  def apply(
    categoryId: java.lang.String = null,
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    defaultAudioLanguage: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    description: java.lang.String = null,
    liveBroadcastContent: java.lang.String = null,
    localized: VideoLocalization = null,
    publishedAt: java.lang.String = null,
    tags: js.Array[java.lang.String] = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
  ): VideoSnippet = {
    val __obj = js.Dynamic.literal()
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (defaultAudioLanguage != null) __obj.updateDynamic("defaultAudioLanguage")(defaultAudioLanguage)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (description != null) __obj.updateDynamic("description")(description)
    if (liveBroadcastContent != null) __obj.updateDynamic("liveBroadcastContent")(liveBroadcastContent)
    if (localized != null) __obj.updateDynamic("localized")(localized)
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VideoSnippet]
  }
}

