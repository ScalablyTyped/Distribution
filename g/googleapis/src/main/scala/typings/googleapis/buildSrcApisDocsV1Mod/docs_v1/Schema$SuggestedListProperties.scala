package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to ListProperties.
  */
@js.native
trait Schema$SuggestedListProperties extends js.Object {
  /**
    * A ListProperties that only includes the changes made in this suggestion.
    * This can be used along with the list_properties_suggestion_state to see
    * which fields have changed and their new values.
    */
  var listProperties: js.UndefOr[Schema$ListProperties] = js.native
  /**
    * A mask that indicates which of the fields on the base ListProperties have
    * been changed in this suggestion.
    */
  var listPropertiesSuggestionState: js.UndefOr[Schema$ListPropertiesSuggestionState] = js.native
}

object Schema$SuggestedListProperties {
  @scala.inline
  def apply(
    listProperties: Schema$ListProperties = null,
    listPropertiesSuggestionState: Schema$ListPropertiesSuggestionState = null
  ): Schema$SuggestedListProperties = {
    val __obj = js.Dynamic.literal()
    if (listProperties != null) __obj.updateDynamic("listProperties")(listProperties.asInstanceOf[js.Any])
    if (listPropertiesSuggestionState != null) __obj.updateDynamic("listPropertiesSuggestionState")(listPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedListProperties]
  }
}

