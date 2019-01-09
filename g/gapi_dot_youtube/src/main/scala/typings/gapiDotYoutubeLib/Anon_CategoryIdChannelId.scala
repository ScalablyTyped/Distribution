package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryIdChannelId extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
    */
  var channelId: java.lang.String
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: java.lang.String
  /**
    * The videos description.
    */
  var description: java.lang.String
  /**
    * The date and time that the video was uploaded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * A list of keyword tags associated with the video. Tags may contain spaces. This field is only visible to the videos uploader.
    */
  var tags: js.Array[java.lang.String]
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The videos title.
    */
  var title: java.lang.String
}

