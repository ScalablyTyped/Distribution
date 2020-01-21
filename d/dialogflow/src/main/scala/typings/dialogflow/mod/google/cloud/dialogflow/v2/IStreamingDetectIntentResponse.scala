package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.rpc.IStatus
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentResponse. */
trait IStreamingDetectIntentResponse extends js.Object {
  /** StreamingDetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[Uint8Array | Null] = js.undefined
  /** StreamingDetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** StreamingDetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  /** StreamingDetectIntentResponse recognitionResult */
  var recognitionResult: js.UndefOr[IStreamingRecognitionResult | Null] = js.undefined
  /** StreamingDetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  /** StreamingDetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}

object IStreamingDetectIntentResponse {
  @scala.inline
  def apply(
    outputAudio: Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryResult: IQueryResult = null,
    recognitionResult: IStreamingRecognitionResult = null,
    responseId: String = null,
    webhookStatus: IStatus = null
  ): IStreamingDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (recognitionResult != null) __obj.updateDynamic("recognitionResult")(recognitionResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingDetectIntentResponse]
  }
}

