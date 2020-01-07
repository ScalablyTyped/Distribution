package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of suggestions.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions extends js.Object {
  /**
    * Required. The list of suggested replies.
    */
  var suggestions: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  @scala.inline
  def apply(suggestions: js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestion] = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
}

