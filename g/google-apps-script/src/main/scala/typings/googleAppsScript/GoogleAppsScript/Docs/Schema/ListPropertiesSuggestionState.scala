package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropertiesSuggestionState extends js.Object {
  var nestingLevelsSuggestionStates: js.UndefOr[js.Array[NestingLevelSuggestionState]] = js.undefined
}

object ListPropertiesSuggestionState {
  @scala.inline
  def apply(nestingLevelsSuggestionStates: js.Array[NestingLevelSuggestionState] = null): ListPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (nestingLevelsSuggestionStates != null) __obj.updateDynamic("nestingLevelsSuggestionStates")(nestingLevelsSuggestionStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropertiesSuggestionState]
  }
}

