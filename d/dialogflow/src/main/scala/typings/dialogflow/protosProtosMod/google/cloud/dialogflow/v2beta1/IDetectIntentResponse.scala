package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.rpc.IStatus
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DetectIntentResponse. */
trait IDetectIntentResponse extends js.Object {
  /** DetectIntentResponse alternativeQueryResults */
  var alternativeQueryResults: js.UndefOr[js.Array[IQueryResult] | Null] = js.undefined
  /** DetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[Uint8Array | Null] = js.undefined
  /** DetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** DetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  /** DetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  /** DetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}

object IDetectIntentResponse {
  @scala.inline
  def apply(
    alternativeQueryResults: js.Array[IQueryResult] = null,
    outputAudio: Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryResult: IQueryResult = null,
    responseId: String = null,
    webhookStatus: IStatus = null
  ): IDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (alternativeQueryResults != null) __obj.updateDynamic("alternativeQueryResults")(alternativeQueryResults.asInstanceOf[js.Any])
    if (outputAudio != null) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryResult != null) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (webhookStatus != null) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetectIntentResponse]
  }
}

