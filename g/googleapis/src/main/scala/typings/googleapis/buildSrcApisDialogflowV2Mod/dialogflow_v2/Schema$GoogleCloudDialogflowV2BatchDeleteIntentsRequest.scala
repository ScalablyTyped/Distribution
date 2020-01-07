package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Intents.BatchDeleteIntents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2BatchDeleteIntentsRequest extends js.Object {
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Intent]] = js.native
}

object Schema$GoogleCloudDialogflowV2BatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[Schema$GoogleCloudDialogflowV2Intent] = null): Schema$GoogleCloudDialogflowV2BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2BatchDeleteIntentsRequest]
  }
}

