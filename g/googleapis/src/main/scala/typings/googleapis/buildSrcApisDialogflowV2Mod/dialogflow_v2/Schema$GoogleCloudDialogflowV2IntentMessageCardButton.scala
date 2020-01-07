package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional. Contains information about a button.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageCardButton extends js.Object {
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String] = js.native
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageCardButton {
  @scala.inline
  def apply(postback: String = null, text: String = null): Schema$GoogleCloudDialogflowV2IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageCardButton]
  }
}

