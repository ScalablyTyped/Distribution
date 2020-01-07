package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.BatchUpdateIntents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2BatchUpdateIntentsResponse extends js.Object {
  /**
    * The collection of updated or created intents.
    */
  var intents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Intent]] = js.native
}

object Schema$GoogleCloudDialogflowV2BatchUpdateIntentsResponse {
  @scala.inline
  def apply(intents: js.Array[Schema$GoogleCloudDialogflowV2Intent] = null): Schema$GoogleCloudDialogflowV2BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2BatchUpdateIntentsResponse]
  }
}

