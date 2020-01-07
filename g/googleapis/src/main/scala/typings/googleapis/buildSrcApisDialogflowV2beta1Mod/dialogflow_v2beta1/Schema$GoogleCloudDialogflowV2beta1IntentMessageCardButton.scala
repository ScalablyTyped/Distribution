package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional. Contains information about a button.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton extends js.Object {
  /**
    * Optional. The text to send back to the Dialogflow API or a URI to open.
    */
  var postback: js.UndefOr[String] = js.native
  /**
    * Optional. The text to show on the button.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton {
  @scala.inline
  def apply(postback: String = null, text: String = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton]
  }
}

