package typings.dialogflow.mod.google.cloud.dialogflow.v2

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
  def apply(
    boost: js.UndefOr[Null | Double] = js.undefined,
    phrases: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): ISpeechContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (!js.isUndefined(phrases)) __obj.updateDynamic("phrases")(phrases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeechContext]
  }
}

