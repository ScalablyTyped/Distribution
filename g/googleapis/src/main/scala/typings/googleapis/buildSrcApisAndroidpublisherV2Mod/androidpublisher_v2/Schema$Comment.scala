package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Comment extends js.Object {
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[Schema$DeveloperComment] = js.native
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[Schema$UserComment] = js.native
}

object Schema$Comment {
  @scala.inline
  def apply(developerComment: Schema$DeveloperComment = null, userComment: Schema$UserComment = null): Schema$Comment = {
    val __obj = js.Dynamic.literal()
    if (developerComment != null) __obj.updateDynamic("developerComment")(developerComment.asInstanceOf[js.Any])
    if (userComment != null) __obj.updateDynamic("userComment")(userComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Comment]
  }
}

