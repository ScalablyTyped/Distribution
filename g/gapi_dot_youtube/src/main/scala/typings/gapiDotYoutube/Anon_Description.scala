package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /**
    * The channels description.
    */
  var description: String
  /**
    * The date and time that the channel was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The channels title.
    */
  var title: String
}

object Anon_Description {
  @scala.inline
  def apply(
    description: String,
    publishedAt: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(description = description, publishedAt = publishedAt, thumbnails = thumbnails, title = title)
  
    __obj.asInstanceOf[Anon_Description]
  }
}

