package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Kind extends js.Object {
  /**
    * The kind, or type, of the referred resource.
    */
  var kind: java.lang.String
  /**
    * If the snippet.resourceId.kind propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify the video in the playlist.
    */
  var videoId: java.lang.String
}

object Anon_Kind {
  @scala.inline
  def apply(kind: java.lang.String, videoId: java.lang.String): Anon_Kind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Anon_Kind]
  }
}

