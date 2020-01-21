package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedPositionedObjectProperties extends js.Object {
  var positionedObjectProperties: js.UndefOr[PositionedObjectProperties] = js.undefined
  var positionedObjectPropertiesSuggestionState: js.UndefOr[PositionedObjectPropertiesSuggestionState] = js.undefined
}

object SuggestedPositionedObjectProperties {
  @scala.inline
  def apply(
    positionedObjectProperties: PositionedObjectProperties = null,
    positionedObjectPropertiesSuggestionState: PositionedObjectPropertiesSuggestionState = null
  ): SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties.asInstanceOf[js.Any])
    if (positionedObjectPropertiesSuggestionState != null) __obj.updateDynamic("positionedObjectPropertiesSuggestionState")(positionedObjectPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedPositionedObjectProperties]
  }
}

