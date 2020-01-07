package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message is a wrapper around a collection of intents.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentBatch extends js.Object {
  /**
    * A collection of intents.
    */
  var intents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2Intent]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentBatch {
  @scala.inline
  def apply(intents: js.Array[Schema$GoogleCloudDialogflowV2Intent] = null): Schema$GoogleCloudDialogflowV2IntentBatch = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentBatch]
  }
}

