package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsUpload extends js.Object {
  /** The ID that YouTube uses to uniquely identify the uploaded video. */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityContentDetailsUpload {
  @scala.inline
  def apply(videoId: java.lang.String = null): ActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ActivityContentDetailsUpload]
  }
}

