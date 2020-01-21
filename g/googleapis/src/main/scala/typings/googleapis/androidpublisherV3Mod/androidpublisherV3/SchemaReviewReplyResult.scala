package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReviewReplyResult extends js.Object {
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[SchemaTimestamp] = js.native
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.native
}

object SchemaReviewReplyResult {
  @scala.inline
  def apply(lastEdited: SchemaTimestamp = null, replyText: String = null): SchemaReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    if (lastEdited != null) __obj.updateDynamic("lastEdited")(lastEdited.asInstanceOf[js.Any])
    if (replyText != null) __obj.updateDynamic("replyText")(replyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReviewReplyResult]
  }
}

