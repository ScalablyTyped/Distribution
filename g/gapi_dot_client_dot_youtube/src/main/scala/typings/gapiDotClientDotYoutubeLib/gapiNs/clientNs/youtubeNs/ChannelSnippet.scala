package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSnippet extends js.Object {
  /** The country of the channel. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The custom url of the channel. */
  var customUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The language of the channel's default title and description. */
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the channel. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Localized title and description, read-only. */
  var localized: js.UndefOr[ChannelLocalization] = js.undefined
  /** The date and time that the channel was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The channel's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

