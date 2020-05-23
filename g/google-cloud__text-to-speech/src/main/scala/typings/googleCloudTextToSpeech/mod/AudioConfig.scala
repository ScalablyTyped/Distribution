package typings.googleCloudTextToSpeech.mod

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
    pitch: js.UndefOr[Double] = js.undefined,
    sampleRateHertz: js.UndefOr[Double] = js.undefined,
    speakingRate: js.UndefOr[Double] = js.undefined,
    volumeGainDb: js.UndefOr[Double] = js.undefined
  ): AudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding.asInstanceOf[js.Any])
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speakingRate)) __obj.updateDynamic("speakingRate")(speakingRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeGainDb)) __obj.updateDynamic("volumeGainDb")(volumeGainDb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
}

