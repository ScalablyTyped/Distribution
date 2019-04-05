package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playlist extends js.Object {
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var player: js.UndefOr[PlaylistPlayer] = js.undefined
  var snippet: js.UndefOr[PlaylistSnippet] = js.undefined
  var status: js.UndefOr[PlaylistStatus] = js.undefined
}

object Playlist {
  @scala.inline
  def apply(
    contentDetails: PlaylistContentDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    localizations: js.Object = null,
    player: PlaylistPlayer = null,
    snippet: PlaylistSnippet = null,
    status: PlaylistStatus = null
  ): Playlist = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localizations != null) __obj.updateDynamic("localizations")(localizations)
    if (player != null) __obj.updateDynamic("player")(player)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Playlist]
  }
}

