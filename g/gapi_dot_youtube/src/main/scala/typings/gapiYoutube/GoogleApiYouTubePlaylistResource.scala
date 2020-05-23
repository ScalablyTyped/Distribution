package typings.gapiYoutube

import typings.gapiYoutube.anon.EmbedHtml
import typings.gapiYoutube.anon.ItemCount
import typings.gapiYoutube.anon.PrivacyStatus
import typings.gapiYoutube.anon.PublishedAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePlaylistResource extends js.Object {
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: ItemCount
  /**
    * The ETag for the playlist resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the playlist.
    */
  var id: String
  /**
    * The type of the API resource. For video resources, the value will be youtube#playlist.
    */
  var kind: String
  /**
    * The player object contains information that you would use to play the playlist in an embedded player.
    */
  var player: EmbedHtml
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: PublishedAt
  /**
    * The status object contains status information for the playlist.
    */
  var status: PrivacyStatus
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
}

