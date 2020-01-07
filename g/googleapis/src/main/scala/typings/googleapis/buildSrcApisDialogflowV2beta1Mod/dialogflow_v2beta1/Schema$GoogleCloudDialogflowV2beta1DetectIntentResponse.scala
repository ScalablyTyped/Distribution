package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned from the DetectIntent method.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse extends js.Object {
  /**
    * If Knowledge Connectors are enabled, there could be more than one result
    * returned for a given query or event, and this field will contain all
    * results except for the top one, which is captured in query_result. The
    * alternative results are ordered by decreasing
    * `QueryResult.intent_detection_confidence`. If Knowledge Connectors are
    * disabled, this field will be empty until multiple responses for regular
    * intents are supported, at which point those additional results will be
    * surfaced here.
    */
  var alternativeQueryResults: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1QueryResult]] = js.native
  /**
    * The audio data bytes encoded as specified in the request. Note: The
    * output audio is generated based on the values of default platform text
    * responses found in the `query_result.fulfillment_messages` field. If
    * multiple default text responses exist, they will be concatenated when
    * generating audio. If no default platform text responses exist, the
    * generated audio content will be empty.
    */
  var outputAudio: js.UndefOr[String] = js.native
  /**
    * Instructs the speech synthesizer how to generate the output audio. This
    * field is populated from the agent-level speech synthesizer configuration,
    * if enabled.
    */
  var outputAudioConfig: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1OutputAudioConfig] = js.native
  /**
    * The selected results of the conversational query or event processing. See
    * `alternative_query_results` for additional potential results.
    */
  var queryResult: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1QueryResult] = js.native
  /**
    * The unique identifier of the response. It can be used to locate a
    * response in the training example set or for reporting issues.
    */
  var responseId: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the webhook request.
    */
  var webhookStatus: js.UndefOr[Schema$GoogleRpcStatus] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse {
  @scala.inline
  def apply(
    alternativeQueryResults: js.Array[Schema$GoogleCloudDialogflowV2beta1QueryResult] = null,
    outputAudio: String = null,
    outputAudioConfig: Schema$GoogleCloudDialogflowV2beta1OutputAudioConfig = null,
    queryResult: Schema$GoogleCloudDialogflowV2beta1QueryResult = null,
    responseId: String = null,
    webhookStatus: Schema$GoogleRpcStatus = null
  ): Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (alternativeQueryResults != null) __obj.updateDynamic("alternativeQueryResults")(alternativeQueryResults.asInstanceOf[js.Any])
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  }
}

