package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of simple response candidates. This message in
  * `QueryResult.fulfillment_messages` and
  * `WebhookResponse.fulfillment_messages` should contain only one
  * `SimpleResponse`.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses extends js.Object {
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.native
}

object Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  @scala.inline
  def apply(simpleResponses: js.Array[Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponse] = null): Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
}

