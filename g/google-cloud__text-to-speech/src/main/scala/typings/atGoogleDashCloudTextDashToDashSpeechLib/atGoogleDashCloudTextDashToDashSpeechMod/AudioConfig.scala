package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioConfig extends js.Object {
  var audioEncoding: AudioEncoding
  var effectsProfileId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pitch: js.UndefOr[scala.Double] = js.undefined
  var sampleRateHertz: js.UndefOr[scala.Double] = js.undefined
  var speakingRate: js.UndefOr[scala.Double] = js.undefined
  var volumeGainDb: js.UndefOr[scala.Double] = js.undefined
}

object AudioConfig {
  @scala.inline
  def apply(
    audioEncoding: AudioEncoding,
    effectsProfileId: js.Array[java.lang.String] = null,
    pitch: scala.Int | scala.Double = null,
    sampleRateHertz: scala.Int | scala.Double = null,
    speakingRate: scala.Int | scala.Double = null,
    volumeGainDb: scala.Int | scala.Double = null
  ): AudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding)
    if (effectsProfileId != null) __obj.updateDynamic("effectsProfileId")(effectsProfileId)
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (speakingRate != null) __obj.updateDynamic("speakingRate")(speakingRate.asInstanceOf[js.Any])
    if (volumeGainDb != null) __obj.updateDynamic("volumeGainDb")(volumeGainDb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
}

