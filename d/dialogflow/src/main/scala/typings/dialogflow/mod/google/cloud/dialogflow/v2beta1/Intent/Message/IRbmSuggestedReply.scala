package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedReply. */
trait IRbmSuggestedReply extends js.Object {
  /** RbmSuggestedReply postbackData */
  var postbackData: js.UndefOr[String | Null] = js.undefined
  /** RbmSuggestedReply text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object IRbmSuggestedReply {
  @scala.inline
  def apply(postbackData: String = null, text: String = null): IRbmSuggestedReply = {
    val __obj = js.Dynamic.literal()
    if (postbackData != null) __obj.updateDynamic("postbackData")(postbackData.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedReply]
  }
}

