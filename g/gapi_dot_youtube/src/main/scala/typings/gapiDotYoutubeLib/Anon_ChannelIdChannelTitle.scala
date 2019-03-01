package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel associated with the activity.
    */
  var channelId: java.lang.String
  /**
    * Channel title for the channel responsible for this activity
    */
  var channelTitle: java.lang.String
  /**
    * The description of the resource primarily associated with the activity.
    */
  var description: java.lang.String
  /**
    * The group ID associated with the activity.
    */
  var groupId: java.lang.String
  /**
    * The date and time that the activity occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: java.lang.String
  /**
    * A map of thumbnail images associated with the resource that is primarily associated with the activity.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The title of the resource primarily associated with the activity.
    */
  var title: java.lang.String
  /**
    * The type of activity that the resource describes.
    */
  var `type`: java.lang.String
}

object Anon_ChannelIdChannelTitle {
  @scala.inline
  def apply(
    channelId: java.lang.String,
    channelTitle: java.lang.String,
    description: java.lang.String,
    groupId: java.lang.String,
    publishedAt: java.lang.String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: java.lang.String,
    `type`: java.lang.String
  ): Anon_ChannelIdChannelTitle = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("channelId")(channelId)
    __obj.updateDynamic("channelTitle")(channelTitle)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("groupId")(groupId)
    __obj.updateDynamic("publishedAt")(publishedAt)
    __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ChannelIdChannelTitle]
  }
}

