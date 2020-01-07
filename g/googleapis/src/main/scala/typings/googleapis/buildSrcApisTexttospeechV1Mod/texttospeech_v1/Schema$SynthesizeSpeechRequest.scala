package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `SynthesizeSpeech` method.
  */
@js.native
trait Schema$SynthesizeSpeechRequest extends js.Object {
  /**
    * Required. The configuration of the synthesized audio.
    */
  var audioConfig: js.UndefOr[Schema$AudioConfig] = js.native
  /**
    * Required. The Synthesizer requires either plain text or SSML as input.
    */
  var input: js.UndefOr[Schema$SynthesisInput] = js.native
  /**
    * Required. The desired voice of the synthesized audio.
    */
  var voice: js.UndefOr[Schema$VoiceSelectionParams] = js.native
}

object Schema$SynthesizeSpeechRequest {
  @scala.inline
  def apply(
    audioConfig: Schema$AudioConfig = null,
    input: Schema$SynthesisInput = null,
    voice: Schema$VoiceSelectionParams = null
  ): Schema$SynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (voice != null) __obj.updateDynamic("voice")(voice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SynthesizeSpeechRequest]
  }
}

