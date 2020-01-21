package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Suggestions. */
trait ISuggestions extends js.Object {
  /** Suggestions suggestions */
  var suggestions: js.UndefOr[js.Array[ISuggestion] | Null] = js.undefined
}

object ISuggestions {
  @scala.inline
  def apply(suggestions: js.Array[ISuggestion] = null): ISuggestions = {
    val __obj = js.Dynamic.literal()
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestions]
  }
}

