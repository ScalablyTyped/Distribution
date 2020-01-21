package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
}

object InlineObjectPropertiesSuggestionState {
  @scala.inline
  def apply(embeddedObjectSuggestionState: EmbeddedObjectSuggestionState = null): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
}

