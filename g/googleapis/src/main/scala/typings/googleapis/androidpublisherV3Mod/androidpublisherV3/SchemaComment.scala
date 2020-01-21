package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaComment extends js.Object {
  /**
    * A comment from a developer.
    */
  var developerComment: js.UndefOr[SchemaDeveloperComment] = js.native
  /**
    * A comment from a user.
    */
  var userComment: js.UndefOr[SchemaUserComment] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(developerComment: SchemaDeveloperComment = null, userComment: SchemaUserComment = null): SchemaComment = {
    val __obj = js.Dynamic.literal()
    if (developerComment != null) __obj.updateDynamic("developerComment")(developerComment.asInstanceOf[js.Any])
    if (userComment != null) __obj.updateDynamic("userComment")(userComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaComment]
  }
}

