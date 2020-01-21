package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedStylesSuggestionState extends js.Object {
  var stylesSuggestionStates: js.UndefOr[js.Array[NamedStyleSuggestionState]] = js.undefined
}

object NamedStylesSuggestionState {
  @scala.inline
  def apply(stylesSuggestionStates: js.Array[NamedStyleSuggestionState] = null): NamedStylesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (stylesSuggestionStates != null) __obj.updateDynamic("stylesSuggestionStates")(stylesSuggestionStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedStylesSuggestionState]
  }
}

