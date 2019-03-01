package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchSettings extends js.Object {
  /** The text color for the video watch page's branded area. */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** An ID that uniquely identifies a playlist that displays next to the video player. */
  var featuredPlaylistId: js.UndefOr[java.lang.String] = js.undefined
  /** The background color for the video watch page's branded area. */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
}

object WatchSettings {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    featuredPlaylistId: java.lang.String = null,
    textColor: java.lang.String = null
  ): WatchSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (featuredPlaylistId != null) __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[WatchSettings]
  }
}

