package typings.gapiClientYoutube.gapi.client.youtube

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playlist extends js.Object {
  /** The contentDetails object contains information like video count. */
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.native
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  /** The ID that YouTube uses to uniquely identify the playlist. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlist". */
  var kind: js.UndefOr[String] = js.native
  /** Localizations for different languages */
  var localizations: js.UndefOr[Record[String, PlaylistLocalization]] = js.native
  /** The player object contains information that you would use to play the playlist in an embedded player. */
  var player: js.UndefOr[PlaylistPlayer] = js.native
  /** The snippet object contains basic details about the playlist, such as its title and description. */
  var snippet: js.UndefOr[PlaylistSnippet] = js.native
  /** The status object contains status information for the playlist. */
  var status: js.UndefOr[PlaylistStatus] = js.native
}

object Playlist {
  @scala.inline
  def apply(): Playlist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Playlist]
  }
  @scala.inline
  implicit class PlaylistOps[Self <: Playlist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentDetails(value: PlaylistContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocalizations(value: Record[String, PlaylistLocalization]): Self = this.set("localizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    @scala.inline
    def setPlayer(value: PlaylistPlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
    @scala.inline
    def setSnippet(value: PlaylistSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setStatus(value: PlaylistStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

