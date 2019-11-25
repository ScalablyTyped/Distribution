package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdDescription extends js.Object {
  var channelId: String
  var description: String
  var thumbnails: GoogleApiYouTubeThumbnailResource
  var title: String
}

object Anon_ChannelIdDescription {
  @scala.inline
  def apply(
    channelId: String,
    description: String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: String
  ): Anon_ChannelIdDescription = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdDescription]
  }
}

