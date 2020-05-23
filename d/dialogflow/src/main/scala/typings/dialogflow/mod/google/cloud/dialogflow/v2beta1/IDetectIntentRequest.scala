package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DetectIntentRequest. */
trait IDetectIntentRequest extends js.Object {
  /** DetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  /** DetectIntentRequest outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** DetectIntentRequest queryInput */
  var queryInput: js.UndefOr[IQueryInput | Null] = js.undefined
  /** DetectIntentRequest queryParams */
  var queryParams: js.UndefOr[IQueryParameters | Null] = js.undefined
  /** DetectIntentRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
}

object IDetectIntentRequest {
  @scala.inline
  def apply(
    inputAudio: js.UndefOr[Null | Uint8Array | String] = js.undefined,
    outputAudioConfig: js.UndefOr[Null | IOutputAudioConfig] = js.undefined,
    queryInput: js.UndefOr[Null | IQueryInput] = js.undefined,
    queryParams: js.UndefOr[Null | IQueryParameters] = js.undefined,
    session: js.UndefOr[Null | String] = js.undefined
  ): IDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inputAudio)) __obj.updateDynamic("inputAudio")(inputAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAudioConfig)) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(queryInput)) __obj.updateDynamic("queryInput")(queryInput.asInstanceOf[js.Any])
    if (!js.isUndefined(queryParams)) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetectIntentRequest]
  }
}

