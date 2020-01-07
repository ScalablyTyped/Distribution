package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The card for presenting a carousel of options to select from.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect extends js.Object {
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect {
  @scala.inline
  def apply(items: js.Array[Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelectItem] = null): Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
}

