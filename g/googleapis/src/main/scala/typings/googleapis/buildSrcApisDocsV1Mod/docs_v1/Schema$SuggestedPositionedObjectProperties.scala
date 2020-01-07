package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to PositionedObjectProperties.
  */
@js.native
trait Schema$SuggestedPositionedObjectProperties extends js.Object {
  /**
    * A PositionedObjectProperties that only includes the changes made in this
    * suggestion. This can be used along with the
    * positioned_object_properties_suggestion_state to see which fields have
    * changed and their new values.
    */
  var positionedObjectProperties: js.UndefOr[Schema$PositionedObjectProperties] = js.native
  /**
    * A mask that indicates which of the fields on the base
    * PositionedObjectProperties have been changed in this suggestion.
    */
  var positionedObjectPropertiesSuggestionState: js.UndefOr[Schema$PositionedObjectPropertiesSuggestionState] = js.native
}

object Schema$SuggestedPositionedObjectProperties {
  @scala.inline
  def apply(
    positionedObjectProperties: Schema$PositionedObjectProperties = null,
    positionedObjectPropertiesSuggestionState: Schema$PositionedObjectPropertiesSuggestionState = null
  ): Schema$SuggestedPositionedObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (positionedObjectProperties != null) __obj.updateDynamic("positionedObjectProperties")(positionedObjectProperties.asInstanceOf[js.Any])
    if (positionedObjectPropertiesSuggestionState != null) __obj.updateDynamic("positionedObjectPropertiesSuggestionState")(positionedObjectPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedPositionedObjectProperties]
  }
}

