package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePlaylistResource extends js.Object {
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: AnonItemCount
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
  var player: AnonEmbedHtml
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: AnonPublishedAt
  /**
    * The status object contains status information for the playlist.
    */
  var status: AnonPrivacyStatus
}

object GoogleApiYouTubePlaylistResource {
  @scala.inline
  def apply(
    contentDetails: AnonItemCount,
    etag: String,
    id: String,
    kind: String,
    player: AnonEmbedHtml,
    snippet: AnonPublishedAt,
    status: AnonPrivacyStatus
  ): GoogleApiYouTubePlaylistResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubePlaylistResource]
  }
}

