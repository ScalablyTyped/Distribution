package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of suggestions.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageSuggestions extends js.Object {
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentMessageSuggestion]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageSuggestions {
  @scala.inline
  def apply(suggestions: js.Array[Schema$GoogleCloudDialogflowV2IntentMessageSuggestion] = null): Schema$GoogleCloudDialogflowV2IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageSuggestions]
  }
}

