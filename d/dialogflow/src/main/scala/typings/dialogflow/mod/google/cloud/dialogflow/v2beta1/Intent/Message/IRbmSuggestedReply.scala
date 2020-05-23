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
  def apply(
    postbackData: js.UndefOr[Null | String] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined
  ): IRbmSuggestedReply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(postbackData)) __obj.updateDynamic("postbackData")(postbackData.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestedReply]
  }
}

