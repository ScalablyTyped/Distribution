package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchSettings extends js.Object {
  /** The text color for the video watch page's branded area. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** An ID that uniquely identifies a playlist that displays next to the video player. */
  var featuredPlaylistId: js.UndefOr[String] = js.undefined
  /** The background color for the video watch page's branded area. */
  var textColor: js.UndefOr[String] = js.undefined
}

object WatchSettings {
  @scala.inline
  def apply(backgroundColor: String = null, featuredPlaylistId: String = null, textColor: String = null): WatchSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (featuredPlaylistId != null) __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchSettings]
  }
}

