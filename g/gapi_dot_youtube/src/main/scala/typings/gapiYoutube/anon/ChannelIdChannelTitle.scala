package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the subscribers channel. The resource_id object identifies the channel that the user subscribed to.
    */
  var channelId: String
  /**
    * The title of the channel that the subscription belongs to.
    */
  var channelTitle: String
  /**
    * The subscriptions details.
    */
  var description: String
  /**
    * The date and time that the subscription was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String
  /**
    * The id object contains information about the channel that the user subscribed to.
    */
  var resourceId: ChannelIdString
  /**
    * A map of thumbnail images associated with the subscription. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
    * The subscriptions title.
    */
  var title: String
}

object ChannelIdChannelTitle {
  @scala.inline
  def apply(
    channelId: String,
    channelTitle: String,
    description: String,
    publishedAt: String,
    resourceId: ChannelIdString,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): ChannelIdChannelTitle = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelTitle = channelTitle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdChannelTitle]
  }
}

