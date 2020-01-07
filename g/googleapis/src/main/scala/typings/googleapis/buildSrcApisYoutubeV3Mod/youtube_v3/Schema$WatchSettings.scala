package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties for the watch. All deprecated.
  */
@js.native
trait Schema$WatchSettings extends js.Object {
  /**
    * The text color for the video watch page&#39;s branded area.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * An ID that uniquely identifies a playlist that displays next to the video
    * player.
    */
  var featuredPlaylistId: js.UndefOr[String] = js.native
  /**
    * The background color for the video watch page&#39;s branded area.
    */
  var textColor: js.UndefOr[String] = js.native
}

object Schema$WatchSettings {
  @scala.inline
  def apply(backgroundColor: String = null, featuredPlaylistId: String = null, textColor: String = null): Schema$WatchSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (featuredPlaylistId != null) __obj.updateDynamic("featuredPlaylistId")(featuredPlaylistId.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WatchSettings]
  }
}

