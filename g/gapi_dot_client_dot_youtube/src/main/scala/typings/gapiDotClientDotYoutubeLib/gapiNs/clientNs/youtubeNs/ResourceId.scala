package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceId extends js.Object {
  /**
               * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a channel. This property is only present if the
               * resourceId.kind value is youtube#channel.
               */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the API resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a playlist. This property is only present if the
               * resourceId.kind value is youtube#playlist.
               */
  var playlistId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The ID that YouTube uses to uniquely identify the referred resource, if that resource is a video. This property is only present if the resourceId.kind
               * value is youtube#video.
               */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

