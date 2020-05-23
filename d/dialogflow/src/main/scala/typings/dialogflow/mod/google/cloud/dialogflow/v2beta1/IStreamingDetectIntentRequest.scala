package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentRequest. */
trait IStreamingDetectIntentRequest extends js.Object {
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  /** StreamingDetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** StreamingDetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.undefined
  /** StreamingDetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.undefined
  /** StreamingDetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  /** StreamingDetectIntentRequest singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
}

object IStreamingDetectIntentRequest {
  @scala.inline
  def apply(
    inputAudio: js.UndefOr[Null | Uint8Array | String] = js.undefined,
    outputAudioConfig: js.UndefOr[Null | IOutputAudioConfig] = js.undefined,
    queryInput: js.UndefOr[Null | IQueryInput] = js.undefined,
    queryParams: js.UndefOr[Null | IQueryParameters] = js.undefined,
    session: js.UndefOr[Null | String] = js.undefined,
    singleUtterance: js.UndefOr[Null | Boolean] = js.undefined
  ): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inputAudio)) __obj.updateDynamic("inputAudio")(inputAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAudioConfig)) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(queryInput)) __obj.updateDynamic("queryInput")(queryInput.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParams)) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
}

