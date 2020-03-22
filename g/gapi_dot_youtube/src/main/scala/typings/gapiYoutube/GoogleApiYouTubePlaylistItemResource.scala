package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePlaylistItemResource extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the video.
    */
  var contentDetails: AnonEndAt
  /**
    * The ETag for the playlist item resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: String
  /**
    * The type of the API resource. For playlist item resources, the value will be youtube#playlistItem.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the playlist item, such as its title and position in the playlist.
    */
  var snippet: AnonPosition
  /**
    * The status object contains information about the playlist items privacy status.
    */
  var status: AnonPrivacyStatus
}

object GoogleApiYouTubePlaylistItemResource {
  @scala.inline
  def apply(
    contentDetails: AnonEndAt,
    etag: String,
    id: String,
    kind: String,
    snippet: AnonPosition,
    status: AnonPrivacyStatus
  ): GoogleApiYouTubePlaylistItemResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubePlaylistItemResource]
  }
}

