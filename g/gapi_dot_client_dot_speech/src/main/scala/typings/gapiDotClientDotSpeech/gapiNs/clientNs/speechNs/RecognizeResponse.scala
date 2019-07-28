package typings.gapiDotClientDotSpeech.gapiNs.clientNs.speechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizeResponse extends js.Object {
  /**
    * &#42;Output-only&#42; Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SpeechRecognitionResult]] = js.undefined
}

object RecognizeResponse {
  @scala.inline
  def apply(results: js.Array[SpeechRecognitionResult] = null): RecognizeResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[RecognizeResponse]
  }
}

