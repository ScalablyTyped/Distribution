package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The button object that appears at the bottom of a card.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton extends js.Object {
  /**
    * Required. Action to take when a user taps on the button.
    */
  var openUriAction: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] = js.native
  /**
    * Required. The title of the button.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton {
  @scala.inline
  def apply(
    openUriAction: Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction = null,
    title: String = null
  ): Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    if (openUriAction != null) __obj.updateDynamic("openUriAction")(openUriAction.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]
  }
}

