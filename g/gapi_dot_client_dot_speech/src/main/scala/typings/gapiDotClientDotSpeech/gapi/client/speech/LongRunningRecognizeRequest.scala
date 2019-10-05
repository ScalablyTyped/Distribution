package typings.gapiDotClientDotSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongRunningRecognizeRequest extends js.Object {
  /** &#42;Required&#42; The audio data to be recognized. */
  var audio: js.UndefOr[RecognitionAudio] = js.undefined
  /**
    * &#42;Required&#42; Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[RecognitionConfig] = js.undefined
}

object LongRunningRecognizeRequest {
  @scala.inline
  def apply(audio: RecognitionAudio = null, config: RecognitionConfig = null): LongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[LongRunningRecognizeRequest]
  }
}

