package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kind extends js.Object {
  /**
    * The kind, or type, of the referred resource.
    */
  var kind: String
  /**
    * If the snippet.resourceId.kind propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify the video in the playlist.
    */
  var videoId: String
}

object Kind {
  @scala.inline
  def apply(kind: String, videoId: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
}

