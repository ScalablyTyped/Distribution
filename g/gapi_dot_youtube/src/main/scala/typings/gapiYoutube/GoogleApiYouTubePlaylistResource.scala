package typings.gapiYoutube

import typings.gapiYoutube.anon.EmbedHtml
import typings.gapiYoutube.anon.ItemCount
import typings.gapiYoutube.anon.PrivacyStatus
import typings.gapiYoutube.anon.PublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubePlaylistResource extends js.Object {
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: ItemCount = js.native
  /**
    * The ETag for the playlist resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For video resources, the value will be youtube#playlist.
    */
  var kind: String = js.native
  /**
    * The player object contains information that you would use to play the playlist in an embedded player.
    */
  var player: EmbedHtml = js.native
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: PublishedAt = js.native
  /**
    * The status object contains status information for the playlist.
    */
  var status: PrivacyStatus = js.native
}

object GoogleApiYouTubePlaylistResource {
  @scala.inline
  def apply(
    contentDetails: ItemCount,
    etag: String,
    id: String,
    kind: String,
    player: EmbedHtml,
    snippet: PublishedAt,
    status: PrivacyStatus
  ): GoogleApiYouTubePlaylistResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePlaylistResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubePlaylistResourceOps[Self <: GoogleApiYouTubePlaylistResource] (val x: Self) extends AnyVal {
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
    def setContentDetails(value: ItemCount): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayer(value: EmbedHtml): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: PublishedAt): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PrivacyStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

