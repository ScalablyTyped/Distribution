package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource id is a generic reference that points to another YouTube
  * resource.
  */
@js.native
trait Schema$ResourceId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a channel. This property is only present if the
    * resourceId.kind value is youtube#channel.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The type of the API resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a playlist. This property is only present if the
    * resourceId.kind value is youtube#playlist.
    */
  var playlistId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the referred resource, if
    * that resource is a video. This property is only present if the
    * resourceId.kind value is youtube#video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object Schema$ResourceId {
  @scala.inline
  def apply(channelId: String = null, kind: String = null, playlistId: String = null, videoId: String = null): Schema$ResourceId = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceId]
  }
}

