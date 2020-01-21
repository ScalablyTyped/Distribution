package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Suggestion. */
trait ISuggestion extends js.Object {
  /** Suggestion title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object ISuggestion {
  @scala.inline
  def apply(title: String = null): ISuggestion = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestion]
  }
}

