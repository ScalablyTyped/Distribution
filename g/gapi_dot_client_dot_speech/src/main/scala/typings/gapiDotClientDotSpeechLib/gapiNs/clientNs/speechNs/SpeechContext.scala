package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpeechContext extends js.Object {
  /**
               * &#42;Optional&#42; A list of strings containing words and phrases "hints" so that
               * the speech recognition is more likely to recognize them. This can be used
               * to improve the accuracy for specific words and phrases, for example, if
               * specific commands are typically spoken by the user. This can also be used
               * to add additional words to the vocabulary of the recognizer. See
               * [usage limits](https://cloud.google.com/speech/limits#content).
               */
  var phrases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

