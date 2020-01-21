package typings.gapiClientYoutube.gapi.client.youtube

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Playlist extends js.Object {
  /** The contentDetails object contains information like video count. */
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the playlist. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlist". */
  var kind: js.UndefOr[String] = js.undefined
  /** Localizations for different languages */
  var localizations: js.UndefOr[Record[String, PlaylistLocalization]] = js.undefined
  /** The player object contains information that you would use to play the playlist in an embedded player. */
  var player: js.UndefOr[PlaylistPlayer] = js.undefined
  /** The snippet object contains basic details about the playlist, such as its title and description. */
  var snippet: js.UndefOr[PlaylistSnippet] = js.undefined
  /** The status object contains status information for the playlist. */
  var status: js.UndefOr[PlaylistStatus] = js.undefined
}

object Playlist {
  @scala.inline
  def apply(
    contentDetails: PlaylistContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: Record[String, PlaylistLocalization] = null,
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

