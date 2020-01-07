package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The text response message.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageText extends js.Object {
  /**
    * Optional. The collection of the agent&#39;s responses.
    */
  var text: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageText {
  @scala.inline
  def apply(text: js.Array[String] = null): Schema$GoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageText]
  }
}

