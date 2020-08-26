package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechRequest extends js.Object {
  var audioConfig: AudioConfig = js.native
  var input: SynthesisInput = js.native
  var voice: VoiceSelectionParams = js.native
}

object SynthesizeSpeechRequest {
  @scala.inline
  def apply(audioConfig: AudioConfig, input: SynthesisInput, voice: VoiceSelectionParams): SynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal(audioConfig = audioConfig.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], voice = voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechRequest]
  }
  @scala.inline
  implicit class SynthesizeSpeechRequestOps[Self <: SynthesizeSpeechRequest] (val x: Self) extends AnyVal {
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
    def setAudioConfig(value: AudioConfig): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: SynthesisInput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoice(value: VoiceSelectionParams): Self = this.set("voice", value.asInstanceOf[js.Any])
  }
  
}

