package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the
    * resourceId.kind value is youtube#channel.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /** The type of the API resource. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the
    * resourceId.kind value is youtube#playlist.
    */
  var playlistId: js.UndefOr[String] = js.undefined
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind
    * value is youtube#video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}

object ResourceId {
  @scala.inline
  def apply(channelId: String = null, kind: String = null, playlistId: String = null, videoId: String = null): ResourceId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ResourceId]
  }
}

