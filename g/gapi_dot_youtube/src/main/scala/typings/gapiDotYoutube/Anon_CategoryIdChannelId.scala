package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryIdChannelId extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: String
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
    */
  var channelId: String
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: String
  /**
    * The videos description.
    */
  var description: String
  /**
    * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * A list of keyword tags associated with the video. Tags may contain spaces. This field is only visible to the videos uploader.
    */
  var tags: js.Array[String]
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The videos title.
    */
  var title: String
}

object Anon_CategoryIdChannelId {
  @scala.inline
  def apply(
    categoryId: String,
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    tags: js.Array[String],
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Anon_CategoryIdChannelId = {
    val __obj = js.Dynamic.literal(categoryId = categoryId.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CategoryIdChannelId]
  }
}

