package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VideoId extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: java.lang.String
}

object Anon_VideoId {
  @scala.inline
  def apply(videoId: java.lang.String): Anon_VideoId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Anon_VideoId]
  }
}

