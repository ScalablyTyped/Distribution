package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdChannelTitleDescription extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
    */
  var channelId: java.lang.String
  /**
    * The channel title of the channel that the playlist item belongs to.
    */
  var channelTitle: java.lang.String
  /**
    * The items description.
    */
  var description: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the playlist that the playlist item is in.
    */
  var playlistId: java.lang.String
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
    */
  var position: scala.Double
  /**
    * The date and time that the item was added to the playlist. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item.
    */
  var resourceId: Anon_Kind
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The items title.
    */
  var title: java.lang.String
}

object Anon_ChannelIdChannelTitleDescription {
  @scala.inline
  def apply(
    channelId: java.lang.String,
    channelTitle: java.lang.String,
    description: java.lang.String,
    playlistId: java.lang.String,
    position: scala.Double,
    publishedAt: java.lang.String,
    resourceId: Anon_Kind,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: java.lang.String
  ): Anon_ChannelIdChannelTitleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channelId")(channelId)
    __obj.updateDynamic("channelTitle")(channelTitle)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("playlistId")(playlistId)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("publishedAt")(publishedAt)
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ChannelIdChannelTitleDescription]
  }
}

