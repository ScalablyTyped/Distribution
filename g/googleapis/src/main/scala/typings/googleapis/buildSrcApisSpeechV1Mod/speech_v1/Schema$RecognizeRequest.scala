package typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `Recognize` method.
  */
@js.native
trait Schema$RecognizeRequest extends js.Object {
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[Schema$RecognitionAudio] = js.native
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[Schema$RecognitionConfig] = js.native
}

object Schema$RecognizeRequest {
  @scala.inline
  def apply(audio: Schema$RecognitionAudio = null, config: Schema$RecognitionConfig = null): Schema$RecognizeRequest = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RecognizeRequest]
  }
}

