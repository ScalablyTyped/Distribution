package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A playlistItem resource identifies another resource, such as a video, that
  * is included in a playlist. In addition, the playlistItem  resource contains
  * details about the included resource that pertain specifically to how that
  * resource is used in that playlist.  YouTube uses playlists to identify
  * special collections of videos for a channel, such as:   - uploaded videos
  * - favorite videos  - positively rated (liked) videos  - watch history  -
  * watch later  To be more specific, these lists are associated with a
  * channel, which is a collection of a person, group, or company&#39;s videos,
  * playlists, and other YouTube information.  You can retrieve the playlist
  * IDs for each of these lists from the  channel resource  for a given
  * channel. You can then use the   playlistItems.list method to retrieve any
  * of those lists. You can also add or remove items from those lists by
  * calling the   playlistItems.insert and   playlistItems.delete methods. For
  * example, if a user gives a positive rating to a video, you would insert
  * that video into the liked videos playlist for that user&#39;s channel.
  */
@js.native
trait Schema$PlaylistItem extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included
    * item is a YouTube video. The object contains additional information about
    * the video.
    */
  var contentDetails: js.UndefOr[Schema$PlaylistItemContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the playlist item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#playlistItem&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the playlist item, such
    * as its title and position in the playlist.
    */
  var snippet: js.UndefOr[Schema$PlaylistItemSnippet] = js.native
  /**
    * The status object contains information about the playlist item&#39;s
    * privacy status.
    */
  var status: js.UndefOr[Schema$PlaylistItemStatus] = js.native
}

object Schema$PlaylistItem {
  @scala.inline
  def apply(
    contentDetails: Schema$PlaylistItemContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$PlaylistItemSnippet = null,
    status: Schema$PlaylistItemStatus = null
  ): Schema$PlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlaylistItem]
  }
}

