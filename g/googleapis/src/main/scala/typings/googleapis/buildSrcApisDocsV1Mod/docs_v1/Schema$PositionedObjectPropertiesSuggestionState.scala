package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * PositionedObjectProperties have been changed in this suggestion. For any
  * field set to true, there is a new suggested value.
  */
@js.native
trait Schema$PositionedObjectPropertiesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[Schema$EmbeddedObjectSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in positioning have been
    * changed in this suggestion.
    */
  var positioningSuggestionState: js.UndefOr[Schema$PositionedObjectPositioningSuggestionState] = js.native
}

object Schema$PositionedObjectPropertiesSuggestionState {
  @scala.inline
  def apply(
    embeddedObjectSuggestionState: Schema$EmbeddedObjectSuggestionState = null,
    positioningSuggestionState: Schema$PositionedObjectPositioningSuggestionState = null
  ): Schema$PositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState.asInstanceOf[js.Any])
    if (positioningSuggestionState != null) __obj.updateDynamic("positioningSuggestionState")(positioningSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PositionedObjectPropertiesSuggestionState]
  }
}

