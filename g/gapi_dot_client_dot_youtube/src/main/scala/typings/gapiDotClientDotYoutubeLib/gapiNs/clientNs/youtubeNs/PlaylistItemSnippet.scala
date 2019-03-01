package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the user that added the item to the playlist. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Channel title for the channel that the playlist item belongs to. */
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The item's description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the playlist that the playlist item is in. */
  var playlistId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a
    * position of 1, and so forth.
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /** The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is
    * an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The item's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistItemSnippet {
  @scala.inline
  def apply(
    channelId: java.lang.String = null,
    channelTitle: java.lang.String = null,
    description: java.lang.String = null,
    playlistId: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    publishedAt: java.lang.String = null,
    resourceId: ResourceId = null,
    thumbnails: ThumbnailDetails = null,
    title: java.lang.String = null
  ): PlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle)
    if (description != null) __obj.updateDynamic("description")(description)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlaylistItemSnippet]
  }
}

