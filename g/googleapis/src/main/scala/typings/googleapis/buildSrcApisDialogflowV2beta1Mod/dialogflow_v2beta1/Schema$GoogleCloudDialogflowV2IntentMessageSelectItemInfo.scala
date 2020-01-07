package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional info about the select item for when it is triggered in a dialog.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo extends js.Object {
  /**
    * Required. A unique key that will be sent back to the agent if this
    * response is given.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Optional. A list of synonyms that can also be used to trigger this item
    * in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo {
  @scala.inline
  def apply(key: String = null, synonyms: js.Array[String] = null): Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageSelectItemInfo]
  }
}

