package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceId extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var playlistId: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceId {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    kind: java.lang.String = null,
    playlistId: java.lang.String = null,
    videoId: java.lang.String = null
  ): ResourceId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ResourceId]
  }
}

