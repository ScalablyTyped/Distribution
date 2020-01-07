package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An item in the list.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageListSelectItem extends js.Object {
  /**
    * Optional. The main text describing the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. The image to display.
    */
  var image: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageImage] = js.native
  /**
    * Required. Additional information about this option.
    */
  var info: js.UndefOr[Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.native
  /**
    * Required. The title of the list item.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageListSelectItem {
  @scala.inline
  def apply(
    description: String = null,
    image: Schema$GoogleCloudDialogflowV2IntentMessageImage = null,
    info: Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo = null,
    title: String = null
  ): Schema$GoogleCloudDialogflowV2IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageListSelectItem]
  }
}

