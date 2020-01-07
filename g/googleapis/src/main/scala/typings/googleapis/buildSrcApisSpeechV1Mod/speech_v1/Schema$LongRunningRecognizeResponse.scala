package typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The only message returned to the client by the `LongRunningRecognize`
  * method. It contains the result as zero or more sequential
  * `SpeechRecognitionResult` messages. It is included in the `result.response`
  * field of the `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait Schema$LongRunningRecognizeResponse extends js.Object {
  /**
    * Output only. Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[Schema$SpeechRecognitionResult]] = js.native
}

object Schema$LongRunningRecognizeResponse {
  @scala.inline
  def apply(results: js.Array[Schema$SpeechRecognitionResult] = null): Schema$LongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LongRunningRecognizeResponse]
  }
}

