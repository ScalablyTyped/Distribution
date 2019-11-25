package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DetectIntentRequest. */
trait IDetectIntentRequest extends js.Object {
  /** DetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | Null] = js.undefined
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
    inputAudio: Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryInput: IQueryInput = null,
    queryParams: IQueryParameters = null,
    session: String = null
  ): IDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (inputAudio != null) __obj.updateDynamic("inputAudio")(inputAudio.asInstanceOf[js.Any])
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (queryInput != null) __obj.updateDynamic("queryInput")(queryInput.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetectIntentRequest]
  }
}

