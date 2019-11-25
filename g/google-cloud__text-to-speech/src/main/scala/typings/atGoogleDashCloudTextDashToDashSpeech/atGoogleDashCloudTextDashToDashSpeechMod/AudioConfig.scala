package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioConfig extends js.Object {
  var audioEncoding: AudioEncoding
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var sampleRateHertz: js.UndefOr[Double] = js.undefined
  var speakingRate: js.UndefOr[Double] = js.undefined
  var volumeGainDb: js.UndefOr[Double] = js.undefined
}

object AudioConfig {
  @scala.inline
  def apply(
    audioEncoding: AudioEncoding,
    effectsProfileId: js.Array[String] = null,
    pitch: Int | Double = null,
    sampleRateHertz: Int | Double = null,
    speakingRate: Int | Double = null,
    volumeGainDb: Int | Double = null
  ): AudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding.asInstanceOf[js.Any])
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (speakingRate != null) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (volumeGainDb != null) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
}

