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

