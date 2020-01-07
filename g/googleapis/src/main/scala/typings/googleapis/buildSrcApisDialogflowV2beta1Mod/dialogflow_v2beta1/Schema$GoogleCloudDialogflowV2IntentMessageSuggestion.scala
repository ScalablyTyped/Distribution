package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suggestion chip message that the user can tap to quickly post a reply
  * to the conversation.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageSuggestion extends js.Object {
  /**
    * Required. The text shown the in the suggestion chip.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageSuggestion {
  @scala.inline
  def apply(title: String = null): Schema$GoogleCloudDialogflowV2IntentMessageSuggestion = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageSuggestion]
  }
}

