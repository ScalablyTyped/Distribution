package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel associated with the activity.
    */
  var channelId: String
  /**
    * Channel title for the channel responsible for this activity
    */
  var channelTitle: String
  /**
    * The description of the resource primarily associated with the activity.
    */
  var description: String
  /**
    * The group ID associated with the activity.
    */
  var groupId: String
  /**
    * The date and time that the activity occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * A map of thumbnail images associated with the resource that is primarily associated with the activity.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The title of the resource primarily associated with the activity.
    */
  var title: String
  /**
    * The type of activity that the resource describes.
    */
  var `type`: String
}

object Anon_ChannelIdChannelTitle {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    groupId: String,
    publishedAt: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String,
    `type`: String
  ): Anon_ChannelIdChannelTitle = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChannelIdChannelTitle]
  }
}

