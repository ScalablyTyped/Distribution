package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionContentDetails extends js.Object {
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  var playlists: js.UndefOr[js.Array[String]] = js.undefined
}

object ChannelSectionContentDetails {
  @scala.inline
  def apply(channels: js.Array[String] = null, playlists: js.Array[String] = null): ChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (playlists != null) __obj.updateDynamic("playlists")(playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSectionContentDetails]
  }
}

