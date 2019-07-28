package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceId extends js.Object {
  var channelId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var playlistId: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object ResourceId {
  @scala.inline
  def apply(channelId: String = null, kind: String = null, playlistId: String = null, videoId: String = null): ResourceId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ResourceId]
  }
}

