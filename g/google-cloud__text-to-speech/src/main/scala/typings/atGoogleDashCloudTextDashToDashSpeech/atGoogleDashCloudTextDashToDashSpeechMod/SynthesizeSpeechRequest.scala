package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizeSpeechRequest extends js.Object {
  var audioConfig: AudioConfig
  var input: SynthesisInput
  var voice: VoiceSelectionParams
}

object SynthesizeSpeechRequest {
  @scala.inline
  def apply(audioConfig: AudioConfig, input: SynthesisInput, voice: VoiceSelectionParams): SynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal(audioConfig = audioConfig, input = input, voice = voice)
  
    __obj.asInstanceOf[SynthesizeSpeechRequest]
  }
}

