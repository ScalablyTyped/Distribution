package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

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
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (playlists != null) __obj.updateDynamic("playlists")(playlists)
    __obj.asInstanceOf[ChannelSectionContentDetails]
  }
}

