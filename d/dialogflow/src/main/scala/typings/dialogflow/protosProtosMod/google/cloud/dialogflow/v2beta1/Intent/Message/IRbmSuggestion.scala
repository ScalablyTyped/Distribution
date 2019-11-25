package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

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
  def apply(action: IRbmSuggestedAction = null, reply: IRbmSuggestedReply = null): IRbmSuggestion = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmSuggestion]
  }
}

