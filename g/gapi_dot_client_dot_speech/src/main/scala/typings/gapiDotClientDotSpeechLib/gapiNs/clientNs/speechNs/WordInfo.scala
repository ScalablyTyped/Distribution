package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs

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
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * &#42;Output-only&#42; Time offset relative to the beginning of the audio,
    * and corresponding to the start of the spoken word.
    * This field is only set if `enable_word_time_offsets=true` and only
    * in the top hypothesis.
    * This is an experimental feature and the accuracy of the time offset can
    * vary.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** &#42;Output-only&#42; The word corresponding to this set of information. */
  var word: js.UndefOr[java.lang.String] = js.undefined
}

