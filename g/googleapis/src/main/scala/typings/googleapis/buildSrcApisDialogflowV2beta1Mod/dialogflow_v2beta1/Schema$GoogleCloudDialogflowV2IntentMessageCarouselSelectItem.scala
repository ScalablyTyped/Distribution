package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item in the carousel.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem extends js.Object {
  /**
    * Optional. The body text of the card.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * Required. Additional info about the option item.
    */
  var info: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.native
  /**
    * Required. Title of the carousel item.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem {
  @scala.inline
  def apply(
    description: String = null,
    image: Schema$GoogleCloudDialogflowV2IntentMessageImage = null,
    info: Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo = null,
    title: String = null
  ): Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]
  }
}

