package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizeSpeechConfig extends js.Object {
  var effectsProfileId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var speakingRate: js.UndefOr[scala.Double] = js.undefined
  var voice: js.UndefOr[VoiceSelectionParams] = js.undefined
  var volumeGainDb: js.UndefOr[scala.Double] = js.undefined
}

object SynthesizeSpeechConfig {
  @scala.inline
  def apply(
    effectsProfileId: js.Array[java.lang.String] = null,
    pitch: scala.Int | scala.Double = null,
    speakingRate: scala.Int | scala.Double = null,
    voice: VoiceSelectionParams = null,
    volumeGainDb: scala.Int | scala.Double = null
  ): SynthesizeSpeechConfig = {
    val __obj = js.Dynamic.literal()
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (speakingRate != null) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice)
    if (volumeGainDb != null) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechConfig]
  }
}

