package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProjectDetails extends js.Object {
  /** A list of project tags associated with the video during the upload. */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object VideoProjectDetails {
  @scala.inline
  def apply(tags: js.Array[java.lang.String] = null): VideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[VideoProjectDetails]
  }
}

