package typings.gapiDotClientDotSpeech.gapiNs.clientNs.speechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionAlternative extends js.Object {
  /**
    * &#42;Output-only&#42; The confidence estimate between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. This field is typically provided only for the top hypothesis, and
    * only for `is_final=true` results. Clients should not rely on the
    * `confidence` field as it is not guaranteed to be accurate or consistent.
    * The default of 0.0 is a sentinel value indicating `confidence` was not set.
    */
  var confidence: js.UndefOr[Double] = js.undefined
  /** &#42;Output-only&#42; Transcript text representing the words that the user spoke. */
  var transcript: js.UndefOr[String] = js.undefined
  /** &#42;Output-only&#42; A list of word-specific information for each recognized word. */
  var words: js.UndefOr[js.Array[WordInfo]] = js.undefined
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(confidence: Int | Double = null, transcript: String = null, words: js.Array[WordInfo] = null): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (transcript != null) __obj.updateDynamic("transcript")(transcript)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
}

