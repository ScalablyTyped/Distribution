package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.rpc.IStatus
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
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio)
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig)
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult)
    if (recognitionResult != null) __obj.updateDynamic("recognitionResult")(recognitionResult)
    if (responseId != null) __obj.updateDynamic("responseId")(responseId)
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus)
    __obj.asInstanceOf[IStreamingDetectIntentResponse]
  }
}

