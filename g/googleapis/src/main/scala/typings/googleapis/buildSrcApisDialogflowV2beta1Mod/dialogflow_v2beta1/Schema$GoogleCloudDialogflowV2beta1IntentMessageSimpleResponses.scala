package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

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
trait Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends js.Object {
  /**
    * Required. The list of simple responses.
    */
  var simpleResponses: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  @scala.inline
  def apply(simpleResponses: js.Array[Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse] = null): Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
}

