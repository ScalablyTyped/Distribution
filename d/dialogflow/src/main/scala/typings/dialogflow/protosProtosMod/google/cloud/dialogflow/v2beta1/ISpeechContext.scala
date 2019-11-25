package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SpeechContext. */
trait ISpeechContext extends js.Object {
  /** SpeechContext boost */
  var boost: js.UndefOr[Double | Null] = js.undefined
  /** SpeechContext phrases */
  var phrases: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object ISpeechContext {
  @scala.inline
  def apply(boost: Int | Double = null, phrases: js.Array[String] = null): ISpeechContext = {
    val __obj = js.Dynamic.literal()
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (phrases != null) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeechContext]
  }
}

