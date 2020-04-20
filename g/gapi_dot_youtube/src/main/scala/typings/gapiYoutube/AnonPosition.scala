package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
    */
  var channelId: String
  /**
    * The channel title of the channel that the playlist item belongs to.
    */
  var channelTitle: String
  /**
    * The items description.
    */
  var description: String
  /**
    * The ID that YouTube uses to uniquely identify the playlist that the playlist item is in.
    */
  var playlistId: String
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
    */
  var position: Double
  /**
    * The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item.
    */
  var resourceId: AnonKind
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The items title.
    */
  var title: String
}

object AnonPosition {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    playlistId: String,
    position: Double,
    publishedAt: String,
    resourceId: AnonKind,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], playlistId = playlistId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

