package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProjectDetails extends js.Object {
  /** A list of project tags associated with the video during the upload. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object VideoProjectDetails {
  @scala.inline
  def apply(tags: js.Array[String] = null): VideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProjectDetails]
  }
}

