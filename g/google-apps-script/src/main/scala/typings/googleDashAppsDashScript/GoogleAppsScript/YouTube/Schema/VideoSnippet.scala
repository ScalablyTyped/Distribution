package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSnippet extends js.Object {
  var categoryId: js.UndefOr[String] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var channelTitle: js.UndefOr[String] = js.undefined
  var defaultAudioLanguage: js.UndefOr[String] = js.undefined
  var defaultLanguage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var liveBroadcastContent: js.UndefOr[String] = js.undefined
  var localized: js.UndefOr[VideoLocalization] = js.undefined
  var publishedAt: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object VideoSnippet {
  @scala.inline
  def apply(
    categoryId: String = null,
    channelId: String = null,
    channelTitle: String = null,
    defaultAudioLanguage: String = null,
    defaultLanguage: String = null,
    description: String = null,
    liveBroadcastContent: String = null,
    localized: VideoLocalization = null,
    publishedAt: String = null,
    tags: js.Array[String] = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): VideoSnippet = {
    val __obj = js.Dynamic.literal()
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (defaultAudioLanguage != null) __obj.updateDynamic("defaultAudioLanguage")(defaultAudioLanguage.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (liveBroadcastContent != null) __obj.updateDynamic("liveBroadcastContent")(liveBroadcastContent.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSnippet]
  }
}

