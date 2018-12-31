package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePlaylistItemResource extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the video.
    */
  var contentDetails: Anon_Note
  /**
    * The ETag for the playlist item resource.
    */
  var etag: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: java.lang.String
  /**
    * The type of the API resource. For playlist item resources, the value will be youtube#playlistItem.
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about the playlist item, such as its title and position in the playlist.
    */
  var snippet: Anon_ResourceId
  /**
    * The status object contains information about the playlist items privacy status.
    */
  var status: Anon_PrivacyStatus
}

