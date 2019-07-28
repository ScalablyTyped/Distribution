package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the channel that published the playlist. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The channel title of the channel that the video belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  /** The language of the playlist's default title and description. */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  /** The playlist's description. */
  var description: js.UndefOr[String] = js.undefined
  /** Localized title and description, read-only. */
  var localized: js.UndefOr[PlaylistLocalization] = js.undefined
  /** The date and time that the playlist was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  /** Keyword tags associated with the playlist. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The playlist's title. */
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

