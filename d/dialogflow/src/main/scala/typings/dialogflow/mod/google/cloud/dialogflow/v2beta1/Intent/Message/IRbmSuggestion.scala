package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestion. */
trait IRbmSuggestion extends js.Object {
  /** RbmSuggestion action */
  var action: js.UndefOr[IRbmSuggestedAction | Null] = js.undefined
  /** RbmSuggestion reply */
  var reply: js.UndefOr[IRbmSuggestedReply | Null] = js.undefined
}

object IRbmSuggestion {
  @scala.inline
  def apply(
    action: js.UndefOr[Null | IRbmSuggestedAction] = js.undefined,
    reply: js.UndefOr[Null | IRbmSuggestedReply] = js.undefined
  ): IRbmSuggestion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(reply)) __obj.updateDynamic("reply")(reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestion]
  }
}

