package typings.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionResult extends js.Object {
  /**
    * &#42;Output-only&#42; May contain one or more recognition hypotheses (up to the
    * maximum specified in `max_alternatives`).
    * These alternatives are ordered in terms of accuracy, with the top (first)
    * alternative being the most probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SpeechRecognitionAlternative]] = js.native
}

object SpeechRecognitionResult {
  @scala.inline
  def apply(): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  @scala.inline
  implicit class SpeechRecognitionResultOps[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlternativesVarargs(value: SpeechRecognitionAlternative*): Self = this.set("alternatives", js.Array(value :_*))
    @scala.inline
    def setAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
  }
  
}

