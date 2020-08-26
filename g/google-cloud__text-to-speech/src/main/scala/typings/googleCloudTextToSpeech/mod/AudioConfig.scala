package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioConfig extends js.Object {
  var audioEncoding: AudioEncoding = js.native
  var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
  var pitch: js.UndefOr[Double] = js.native
  var sampleRateHertz: js.UndefOr[Double] = js.native
  var speakingRate: js.UndefOr[Double] = js.native
  var volumeGainDb: js.UndefOr[Double] = js.native
}

object AudioConfig {
  @scala.inline
  def apply(audioEncoding: AudioEncoding): AudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConfig]
  }
  @scala.inline
  implicit class AudioConfigOps[Self <: AudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioEncoding(value: AudioEncoding): Self = this.set("audioEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectsProfileIdVarargs(value: String*): Self = this.set("effectsProfileId", js.Array(value :_*))
    @scala.inline
    def setEffectsProfileId(value: js.Array[String]): Self = this.set("effectsProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectsProfileId: Self = this.set("effectsProfileId", js.undefined)
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
    @scala.inline
    def setSpeakingRate(value: Double): Self = this.set("speakingRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakingRate: Self = this.set("speakingRate", js.undefined)
    @scala.inline
    def setVolumeGainDb(value: Double): Self = this.set("volumeGainDb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeGainDb: Self = this.set("volumeGainDb", js.undefined)
  }
  
}

