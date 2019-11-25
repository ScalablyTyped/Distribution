package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
    */
  var channelId: String
  /**
    * The title of the channel that published the resource that the search result identifies.
    */
  var channelTitle: String
  /**
    * A description of the search result.
    */
  var description: String
  /**
    * The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The title of the search result.
    */
  var title: String
}

object Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails]
  }
}

