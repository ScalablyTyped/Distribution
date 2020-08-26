package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdChannelTitle extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the subscribers channel. The resource_id object identifies the channel that the user subscribed to.
    */
  var channelId: String = js.native
  /**
    * The title of the channel that the subscription belongs to.
    */
  var channelTitle: String = js.native
  /**
    * The subscriptions details.
    */
  var description: String = js.native
  /**
    * The date and time that the subscription was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: String = js.native
  /**
    * The id object contains information about the channel that the user subscribed to.
    */
  var resourceId: ChannelIdString = js.native
  /**
    * A map of thumbnail images associated with the subscription. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  /**
    * The subscriptions title.
    */
  var title: String = js.native
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
  @scala.inline
  implicit class ChannelIdChannelTitleOps[Self <: ChannelIdChannelTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelTitle(value: String): Self = this.set("channelTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ChannelIdString): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

