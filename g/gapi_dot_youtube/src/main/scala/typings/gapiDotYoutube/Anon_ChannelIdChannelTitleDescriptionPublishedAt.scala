package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdChannelTitleDescriptionPublishedAt extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel that published the playlist.
    */
  var channelId: String
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: String
  /**
    * The playlists description.
    */
  var description: String
  /**
    * The date and time that the playlist was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.Array[String]
  /**
    * A map of thumbnail images associated with the playlist. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The playlists title.
    */
  var title: String
}

object Anon_ChannelIdChannelTitleDescriptionPublishedAt {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    tags: js.Array[String],
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Anon_ChannelIdChannelTitleDescriptionPublishedAt = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdChannelTitleDescriptionPublishedAt]
  }
}

