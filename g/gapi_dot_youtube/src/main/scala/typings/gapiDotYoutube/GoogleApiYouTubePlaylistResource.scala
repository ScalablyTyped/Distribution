package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePlaylistResource extends js.Object {
  /**
    * The contentDetails object contains information about the playlist content, including the number of videos in the playlist.
    */
  var contentDetails: Anon_ItemCount
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
  var player: Anon_EmbedHtml
  /**
    * The snippet object contains basic details about the playlist, such as its title and description.
    */
  var snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAt
  /**
    * The status object contains status information for the playlist.
    */
  var status: Anon_PrivacyStatus
}

object GoogleApiYouTubePlaylistResource {
  @scala.inline
  def apply(
    contentDetails: Anon_ItemCount,
    etag: String,
    id: String,
    kind: String,
    player: Anon_EmbedHtml,
    snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAt,
    status: Anon_PrivacyStatus
  ): GoogleApiYouTubePlaylistResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails, etag = etag, id = id, kind = kind, player = player, snippet = snippet, status = status)
  
    __obj.asInstanceOf[GoogleApiYouTubePlaylistResource]
  }
}

