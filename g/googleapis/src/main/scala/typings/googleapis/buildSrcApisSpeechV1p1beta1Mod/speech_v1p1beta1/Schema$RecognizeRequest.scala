package typings.googleapis.buildSrcApisSpeechV1p1beta1Mod.speech_v1p1beta1

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
  /**
    * *Optional* The name of the model to use for recognition.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$RecognizeRequest {
  @scala.inline
  def apply(
    audio: Schema$RecognitionAudio = null,
    config: Schema$RecognitionConfig = null,
    name: String = null
  ): Schema$RecognizeRequest = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RecognizeRequest]
  }
}

