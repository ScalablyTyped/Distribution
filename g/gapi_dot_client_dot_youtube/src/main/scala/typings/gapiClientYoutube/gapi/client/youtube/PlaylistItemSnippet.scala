package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the user that added the item to the playlist. */
  var channelId: js.UndefOr[String] = js.undefined
  /** Channel title for the channel that the playlist item belongs to. */
  var channelTitle: js.UndefOr[String] = js.undefined
  /** The item's description. */
  var description: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the playlist that the playlist item is in. */
  var playlistId: js.UndefOr[String] = js.undefined
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a
    * position of 1, and so forth.
    */
  var position: js.UndefOr[Double] = js.undefined
  /** The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  /** The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is
    * an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The item's title. */
  var title: js.UndefOr[String] = js.undefined
}

object PlaylistItemSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    playlistId: String = null,
    position: Int | Double = null,
    publishedAt: String = null,
    resourceId: ResourceId = null,
    thumbnails: ThumbnailDetails = null,
    title: String = null
  ): PlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItemSnippet]
  }
}

