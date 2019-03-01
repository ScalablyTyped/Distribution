package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdKind extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel, if the recommended resource is a channel. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: java.lang.String
  /**
    * The type of the API resource.
    */
  var kind: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the video, if the recommended resource is a video. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: java.lang.String
}

object Anon_ChannelIdKind {
  @scala.inline
  def apply(channelId: java.lang.String, kind: java.lang.String, videoId: java.lang.String): Anon_ChannelIdKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channelId")(channelId)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Anon_ChannelIdKind]
  }
}

