package typings.gapiDotClientDotSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordInfo extends js.Object {
  /**
    * &#42;Output-only&#42; Time offset relative to the beginning of the audio,
    * and corresponding to the end of the spoken word.
    * This field is only set if `enable_word_time_offsets=true` and only
    * in the top hypothesis.
    * This is an experimental feature and the accuracy of the time offset can
    * vary.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * &#42;Output-only&#42; Time offset relative to the beginning of the audio,
    * and corresponding to the start of the spoken word.
    * This field is only set if `enable_word_time_offsets=true` and only
    * in the top hypothesis.
    * This is an experimental feature and the accuracy of the time offset can
    * vary.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** &#42;Output-only&#42; The word corresponding to this set of information. */
  var word: js.UndefOr[String] = js.undefined
}

object WordInfo {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null, word: String = null): WordInfo = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[WordInfo]
  }
}

