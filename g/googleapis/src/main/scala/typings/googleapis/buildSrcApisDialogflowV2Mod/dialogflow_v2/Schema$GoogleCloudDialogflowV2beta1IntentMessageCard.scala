package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card response message.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageCard extends js.Object {
  /**
    * Optional. The collection of card buttons.
    */
  var buttons: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton]] = js.native
  /**
    * Optional. The public URI to an image file for the card.
    */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Optional. The subtitle of the card.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Optional. The title of the card.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageCard {
  @scala.inline
  def apply(
    buttons: js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageCardButton] = null,
    imageUri: String = null,
    subtitle: String = null,
    title: String = null
  ): Schema$GoogleCloudDialogflowV2beta1IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageCard]
  }
}

