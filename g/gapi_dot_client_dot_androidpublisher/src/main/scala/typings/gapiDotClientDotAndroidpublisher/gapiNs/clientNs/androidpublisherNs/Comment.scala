package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** A comment from a developer. */
  var developerComment: js.UndefOr[DeveloperComment] = js.undefined
  /** A comment from a user. */
  var userComment: js.UndefOr[UserComment] = js.undefined
}

object Comment {
  @scala.inline
  def apply(developerComment: DeveloperComment = null, userComment: UserComment = null): Comment = {
    val __obj = js.Dynamic.literal()
    if (developerComment != null) __obj.updateDynamic("developerComment")(developerComment)
    if (userComment != null) __obj.updateDynamic("userComment")(userComment)
    __obj.asInstanceOf[Comment]
  }
}

