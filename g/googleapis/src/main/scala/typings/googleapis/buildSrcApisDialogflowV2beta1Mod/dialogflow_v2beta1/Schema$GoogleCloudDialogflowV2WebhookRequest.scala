package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for a webhook call.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2WebhookRequest extends js.Object {
  /**
    * Optional. The contents of the original request that was passed to
    * `[Streaming]DetectIntent` call.
    */
  var originalDetectIntentRequest: js.UndefOr[Schema$GoogleCloudDialogflowV2OriginalDetectIntentRequest] = js.native
  /**
    * The result of the conversational query or event processing. Contains the
    * same value as `[Streaming]DetectIntentResponse.query_result`.
    */
  var queryResult: js.UndefOr[Schema$GoogleCloudDialogflowV2QueryResult] = js.native
  /**
    * The unique identifier of the response. Contains the same value as
    * `[Streaming]DetectIntentResponse.response_id`.
    */
  var responseId: js.UndefOr[String] = js.native
  /**
    * The unique identifier of detectIntent request session. Can be used to
    * identify end-user inside webhook implementation. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
    * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment
    * ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session ID&gt;`.
    */
  var session: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2WebhookRequest {
  @scala.inline
  def apply(
    originalDetectIntentRequest: Schema$GoogleCloudDialogflowV2OriginalDetectIntentRequest = null,
    queryResult: Schema$GoogleCloudDialogflowV2QueryResult = null,
    responseId: String = null,
    session: String = null
  ): Schema$GoogleCloudDialogflowV2WebhookRequest = {
    val __obj = js.Dynamic.literal()
    if (originalDetectIntentRequest != null) __obj.updateDynamic("originalDetectIntentRequest")(originalDetectIntentRequest.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2WebhookRequest]
  }
}

