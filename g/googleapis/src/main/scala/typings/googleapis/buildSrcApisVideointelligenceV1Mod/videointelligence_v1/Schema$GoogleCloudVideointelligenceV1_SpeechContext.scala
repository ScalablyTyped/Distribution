package typings.googleapis.buildSrcApisVideointelligenceV1Mod.videointelligence_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides &quot;hints&quot; to the speech recognizer to favor specific words
  * and phrases in the results.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_SpeechContext extends js.Object {
  /**
    * *Optional* A list of strings containing words and phrases
    * &quot;hints&quot; so that the speech recognition is more likely to
    * recognize them. This can be used to improve the accuracy for specific
    * words and phrases, for example, if specific commands are typically spoken
    * by the user. This can also be used to add additional words to the
    * vocabulary of the recognizer. See [usage
    * limits](https://cloud.google.com/speech/limits#content).
    */
  var phrases: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_SpeechContext {
  @scala.inline
  def apply(phrases: js.Array[String] = null): Schema$GoogleCloudVideointelligenceV1_SpeechContext = {
    val __obj = js.Dynamic.literal()
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_SpeechContext]
  }
}

