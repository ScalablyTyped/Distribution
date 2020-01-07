package typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait Schema$SpeechRecognitionResult extends js.Object {
  /**
    * Output only. May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`). These alternatives are ordered
    * in terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[Schema$SpeechRecognitionAlternative]] = js.native
  /**
    * For multi-channel audio, this is the channel number corresponding to the
    * recognized result for the audio from that channel. For
    * audio_channel_count = N, its output values can range from &#39;1&#39; to
    * &#39;N&#39;.
    */
  var channelTag: js.UndefOr[Double] = js.native
}

object Schema$SpeechRecognitionResult {
  @scala.inline
  def apply(
    alternatives: js.Array[Schema$SpeechRecognitionAlternative] = null,
    channelTag: Int | Double = null
  ): Schema$SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (channelTag != null) __obj.updateDynamic("channelTag")(channelTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SpeechRecognitionResult]
  }
}

