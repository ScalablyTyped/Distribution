package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingDetectIntentRequest. */
trait IStreamingDetectIntentRequest extends js.Object {
  /** StreamingDetectIntentRequest inputAudio */
  var inputAudio: js.UndefOr[Uint8Array | Null] = js.undefined
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
    inputAudio: Uint8Array = null,
    outputAudioConfig: IOutputAudioConfig = null,
    queryInput: IQueryInput = null,
    queryParams: IQueryParameters = null,
    session: String = null,
    singleUtterance: js.UndefOr[Boolean] = js.undefined
  ): IStreamingDetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (inputAudio != null) __obj.updateDynamic("inputAudio")(inputAudio)
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig)
    if (queryInput != null) __obj.updateDynamic("queryInput")(queryInput)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance)
    __obj.asInstanceOf[IStreamingDetectIntentRequest]
  }
}

