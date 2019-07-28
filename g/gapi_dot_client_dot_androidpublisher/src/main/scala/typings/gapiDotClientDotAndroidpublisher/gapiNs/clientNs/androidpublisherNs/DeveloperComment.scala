package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperComment extends js.Object {
  /** The last time at which this comment was updated. */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /** The content of the comment, i.e. reply body. */
  var text: js.UndefOr[String] = js.undefined
}

object DeveloperComment {
  @scala.inline
  def apply(lastModified: Timestamp = null, text: String = null): DeveloperComment = {
    val __obj = js.Dynamic.literal()
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DeveloperComment]
  }
}

