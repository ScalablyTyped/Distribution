package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned from the DetectIntent method.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2DetectIntentResponse extends js.Object {
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
    * The config used by the speech synthesizer to generate the output audio.
    */
  var outputAudioConfig: js.UndefOr[Schema$GoogleCloudDialogflowV2OutputAudioConfig] = js.native
  /**
    * The selected results of the conversational query or event processing. See
    * `alternative_query_results` for additional potential results.
    */
  var queryResult: js.UndefOr[Schema$GoogleCloudDialogflowV2QueryResult] = js.native
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

object Schema$GoogleCloudDialogflowV2DetectIntentResponse {
  @scala.inline
  def apply(
    outputAudio: String = null,
    outputAudioConfig: Schema$GoogleCloudDialogflowV2OutputAudioConfig = null,
    queryResult: Schema$GoogleCloudDialogflowV2QueryResult = null,
    responseId: String = null,
    webhookStatus: Schema$GoogleRpcStatus = null
  ): Schema$GoogleCloudDialogflowV2DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2DetectIntentResponse]
  }
}

