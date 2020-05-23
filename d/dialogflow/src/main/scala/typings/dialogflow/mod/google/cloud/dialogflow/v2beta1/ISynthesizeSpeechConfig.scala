package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SynthesizeSpeechConfig. */
trait ISynthesizeSpeechConfig extends js.Object {
  /** SynthesizeSpeechConfig effectsProfileId */
  var effectsProfileId: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** SynthesizeSpeechConfig pitch */
  var pitch: js.UndefOr[Double | Null] = js.undefined
  /** SynthesizeSpeechConfig speakingRate */
  var speakingRate: js.UndefOr[Double | Null] = js.undefined
  /** SynthesizeSpeechConfig voice */
  var voice: js.UndefOr[IVoiceSelectionParams | Null] = js.undefined
  /** SynthesizeSpeechConfig volumeGainDb */
  var volumeGainDb: js.UndefOr[Double | Null] = js.undefined
}

object ISynthesizeSpeechConfig {
  @scala.inline
  def apply(
    effectsProfileId: js.UndefOr[Null | js.Array[String]] = js.undefined,
    pitch: js.UndefOr[Null | Double] = js.undefined,
    speakingRate: js.UndefOr[Null | Double] = js.undefined,
    voice: js.UndefOr[Null | IVoiceSelectionParams] = js.undefined,
    volumeGainDb: js.UndefOr[Null | Double] = js.undefined
  ): ISynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(effectsProfileId)) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(speakingRate)) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (!js.isUndefined(voice)) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeGainDb)) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISynthesizeSpeechConfig]
  }
}

