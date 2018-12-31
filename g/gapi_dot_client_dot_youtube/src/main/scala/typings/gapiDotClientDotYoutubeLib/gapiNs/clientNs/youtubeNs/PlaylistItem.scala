package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the
    * video.
    */
  var contentDetails: js.UndefOr[PlaylistItemContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the playlist item. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlistItem". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the playlist item, such as its title and position in the playlist. */
  var snippet: js.UndefOr[PlaylistItemSnippet] = js.undefined
  /** The status object contains information about the playlist item's privacy status. */
  var status: js.UndefOr[PlaylistItemStatus] = js.undefined
}

