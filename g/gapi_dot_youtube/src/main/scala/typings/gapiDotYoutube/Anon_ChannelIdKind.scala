package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdKind extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel, if the recommended resource is a channel. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
  /**
    * The ID that YouTube uses to uniquely identify the video, if the recommended resource is a video. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: String
}

object Anon_ChannelIdKind {
  @scala.inline
  def apply(channelId: String, kind: String, videoId: String): Anon_ChannelIdKind = {
    val __obj = js.Dynamic.literal(channelId = channelId, kind = kind, videoId = videoId)
  
    __obj.asInstanceOf[Anon_ChannelIdKind]
  }
}

