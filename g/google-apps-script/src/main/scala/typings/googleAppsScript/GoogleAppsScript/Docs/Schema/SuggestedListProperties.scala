package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedListProperties extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.undefined
  var listPropertiesSuggestionState: js.UndefOr[ListPropertiesSuggestionState] = js.undefined
}

object SuggestedListProperties {
  @scala.inline
  def apply(
    listProperties: ListProperties = null,
    listPropertiesSuggestionState: ListPropertiesSuggestionState = null
  ): SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties.asInstanceOf[js.Any])
    if (listPropertiesSuggestionState != null) __obj.updateDynamic("listPropertiesSuggestionState")(listPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedListProperties]
  }
}

