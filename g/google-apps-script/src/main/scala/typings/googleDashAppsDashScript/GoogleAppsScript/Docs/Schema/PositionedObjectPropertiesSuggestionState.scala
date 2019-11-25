package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
  var positioningSuggestionState: js.UndefOr[PositionedObjectPositioningSuggestionState] = js.undefined
}

object PositionedObjectPropertiesSuggestionState {
  @scala.inline
  def apply(
    embeddedObjectSuggestionState: EmbeddedObjectSuggestionState = null,
    positioningSuggestionState: PositionedObjectPositioningSuggestionState = null
  ): PositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState.asInstanceOf[js.Any])
    if (positioningSuggestionState != null) __obj.updateDynamic("positioningSuggestionState")(positioningSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionedObjectPropertiesSuggestionState]
  }
}

