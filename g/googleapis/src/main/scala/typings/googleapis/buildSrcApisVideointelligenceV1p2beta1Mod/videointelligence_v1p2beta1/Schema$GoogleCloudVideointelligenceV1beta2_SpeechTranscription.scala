package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A speech recognition result corresponding to a portion of the audio.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1beta2_SpeechTranscription extends js.Object {
  /**
    * May contain one or more recognition hypotheses (up to the maximum
    * specified in `max_alternatives`).  These alternatives are ordered in
    * terms of accuracy, with the top (first) alternative being the most
    * probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[
    js.Array[Schema$GoogleCloudVideointelligenceV1beta2_SpeechRecognitionAlternative]
  ] = js.native
  /**
    * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt)
    * language tag of the language in this result. This language code was
    * detected to have the most likelihood of being spoken in the audio.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1beta2_SpeechTranscription {
  @scala.inline
  def apply(
    alternatives: js.Array[Schema$GoogleCloudVideointelligenceV1beta2_SpeechRecognitionAlternative] = null,
    languageCode: String = null
  ): Schema$GoogleCloudVideointelligenceV1beta2_SpeechTranscription = {
    val __obj = js.Dynamic.literal()
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1beta2_SpeechTranscription]
  }
}

