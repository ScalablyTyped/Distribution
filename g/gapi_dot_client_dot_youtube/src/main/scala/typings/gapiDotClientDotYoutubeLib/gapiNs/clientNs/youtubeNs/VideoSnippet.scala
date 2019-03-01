package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSnippet extends js.Object {
  /** The YouTube video category associated with the video. */
  var categoryId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel that the video was uploaded to. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Channel title for the channel that the video belongs to. */
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The default_audio_language property specifies the language spoken in the video's default audio track. */
  var defaultAudioLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The language of the videos's default snippet. */
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The video's description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates if the video is an upcoming/active live broadcast. Or it's "none" if the video is not an upcoming/active live broadcast. */
  var liveBroadcastContent: js.UndefOr[java.lang.String] = js.undefined
  /** Localized snippet selected with the hl parameter. If no such localization exists, this field is populated with the default snippet. (Read-only) */
  var localized: js.UndefOr[VideoLocalization] = js.undefined
  /** The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** A list of keyword tags associated with the video. Tags may contain spaces. */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object
    * that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The video's title. */
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

