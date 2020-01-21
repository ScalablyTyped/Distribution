package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playlist extends js.Object {
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var localizations: js.UndefOr[js.Object] = js.undefined
  var player: js.UndefOr[PlaylistPlayer] = js.undefined
  var snippet: js.UndefOr[PlaylistSnippet] = js.undefined
  var status: js.UndefOr[PlaylistStatus] = js.undefined
}

object Playlist {
  @scala.inline
  def apply(
    contentDetails: PlaylistContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: js.Object = null,
    player: PlaylistPlayer = null,
    snippet: PlaylistSnippet = null,
    status: PlaylistStatus = null
  ): Playlist = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlist]
  }
}

