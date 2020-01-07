package typings.googleapis.buildSrcApisAndroidpublisherV2Mod.androidpublisher_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ReviewReplyResult extends js.Object {
  /**
    * The time at which the reply took effect.
    */
  var lastEdited: js.UndefOr[Schema$Timestamp] = js.native
  /**
    * The reply text that was applied.
    */
  var replyText: js.UndefOr[String] = js.native
}

object Schema$ReviewReplyResult {
  @scala.inline
  def apply(lastEdited: Schema$Timestamp = null, replyText: String = null): Schema$ReviewReplyResult = {
    val __obj = js.Dynamic.literal()
    if (lastEdited != null) __obj.updateDynamic("lastEdited")(lastEdited.asInstanceOf[js.Any])
    if (replyText != null) __obj.updateDynamic("replyText")(replyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReviewReplyResult]
  }
}

