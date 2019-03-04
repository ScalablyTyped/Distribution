package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdDescription extends js.Object {
  var channelId: java.lang.String
  var description: java.lang.String
  var thumbnails: GoogleApiYouTubeThumbnailResource
  var title: java.lang.String
}

object Anon_ChannelIdDescription {
  @scala.inline
  def apply(
    channelId: java.lang.String,
    description: java.lang.String,
    thumbnails: GoogleApiYouTubeThumbnailResource,
    title: java.lang.String
  ): Anon_ChannelIdDescription = {
    val __obj = js.Dynamic.literal(channelId = channelId, description = description, thumbnails = thumbnails, title = title)
  
    __obj.asInstanceOf[Anon_ChannelIdDescription]
  }
}

