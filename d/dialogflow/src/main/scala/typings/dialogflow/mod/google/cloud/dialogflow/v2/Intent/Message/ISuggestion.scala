package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

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
  def apply(title: js.UndefOr[Null | String] = js.undefined): ISuggestion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestion]
  }
}

