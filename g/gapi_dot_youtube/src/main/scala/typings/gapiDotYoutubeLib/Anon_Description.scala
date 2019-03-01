package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /**
    * The channels description.
    */
  var description: java.lang.String
  /**
    * The date and time that the channel was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * A map of thumbnail images associated with the channel. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The channels title.
    */
  var title: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String,
    publishedAt: java.lang.String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: java.lang.String
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("publishedAt")(publishedAt)
    __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Description]
  }
}

