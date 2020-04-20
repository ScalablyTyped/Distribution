package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  /**
    * The kind, or type, of the referred resource.
    */
  var kind: String
  /**
    * If the snippet.resourceId.kind propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify the video in the playlist.
    */
  var videoId: String
}

object AnonKind {
  @scala.inline
  def apply(kind: String, videoId: String): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKind]
  }
}

