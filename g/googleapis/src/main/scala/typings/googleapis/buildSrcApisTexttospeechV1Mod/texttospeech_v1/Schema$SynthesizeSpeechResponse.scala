package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned to the client by the `SynthesizeSpeech` method.
  */
@js.native
trait Schema$SynthesizeSpeechResponse extends js.Object {
  /**
    * The audio data bytes encoded as specified in the request, including the
    * header (For LINEAR16 audio, we include the WAV header). Note: as with all
    * bytes fields, protobuffers use a pure binary representation, whereas JSON
    * representations use base64.
    */
  var audioContent: js.UndefOr[String] = js.native
}

object Schema$SynthesizeSpeechResponse {
  @scala.inline
  def apply(audioContent: String = null): Schema$SynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    if (audioContent != null) __obj.updateDynamic("audioContent")(audioContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SynthesizeSpeechResponse]
  }
}

