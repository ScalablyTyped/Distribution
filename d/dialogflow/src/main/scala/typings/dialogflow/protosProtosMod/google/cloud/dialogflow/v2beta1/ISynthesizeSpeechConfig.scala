package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

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
    effectsProfileId: js.Array[String] = null,
    pitch: Int | Double = null,
    speakingRate: Int | Double = null,
    voice: IVoiceSelectionParams = null,
    volumeGainDb: Int | Double = null
  ): ISynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (speakingRate != null) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    if (volumeGainDb != null) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISynthesizeSpeechConfig]
  }
}

