package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Intents.BatchDeleteIntents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest extends js.Object {
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1Intent]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest {
  @scala.inline
  def apply(intents: js.Array[Schema$GoogleCloudDialogflowV2beta1Intent] = null): Schema$GoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest]
  }
}

