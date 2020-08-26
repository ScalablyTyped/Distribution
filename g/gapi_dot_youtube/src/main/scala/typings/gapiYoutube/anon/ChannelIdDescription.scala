package typings.gapiYoutube.anon

import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdDescription extends js.Object {
  var channelId: String = js.native
  var description: String = js.native
  var thumbnails: GoogleApiYouTubeThumbnailResource = js.native
  var title: String = js.native
}

object ChannelIdDescription {
  @scala.inline
  def apply(
    channelId: String,
    description: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): ChannelIdDescription = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdDescription]
  }
  @scala.inline
  implicit class ChannelIdDescriptionOps[Self <: ChannelIdDescription] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnails(value: GoogleApiYouTubeThumbnailResource): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

