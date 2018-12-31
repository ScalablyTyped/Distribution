package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KindVideoIdChannelId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel associated with a comment. This property is only present if the resourceId.kind is youtube#channel.
    */
  var channelId: java.lang.String
  /**
    * The type of the API resource.
    */
  var kind: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the video associated with a comment. This property is only present if the resourceId.kind is youtube#video.
    */
  var videoId: java.lang.String
}

