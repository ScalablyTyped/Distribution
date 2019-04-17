package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectIntentRequest extends js.Object {
  var inputAudio: js.UndefOr[java.lang.String] = js.undefined
  var outputAudioConfig: js.UndefOr[OutputAudioConfig] = js.undefined
  var queryInput: QueryInput
  var queryParams: js.UndefOr[QueryParams] = js.undefined
  var session: java.lang.String
}

object DetectIntentRequest {
  @scala.inline
  def apply(
    queryInput: QueryInput,
    session: java.lang.String,
    inputAudio: java.lang.String = null,
    outputAudioConfig: OutputAudioConfig = null,
    queryParams: QueryParams = null
  ): DetectIntentRequest = {
    val __obj = js.Dynamic.literal(queryInput = queryInput, session = session)
    if (inputAudio != null) __obj.updateDynamic("inputAudio")(inputAudio)
    if (outputAudioConfig != null) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[DetectIntentRequest]
  }
}

