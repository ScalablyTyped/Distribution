package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * InlineObjectProperties have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait Schema$InlineObjectPropertiesSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in embedded_object have been
    * changed in this suggestion.
    */
  var embeddedObjectSuggestionState: js.UndefOr[Schema$EmbeddedObjectSuggestionState] = js.native
}

object Schema$InlineObjectPropertiesSuggestionState {
  @scala.inline
  def apply(embeddedObjectSuggestionState: Schema$EmbeddedObjectSuggestionState = null): Schema$InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (embeddedObjectSuggestionState != null) __obj.updateDynamic("embeddedObjectSuggestionState")(embeddedObjectSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InlineObjectPropertiesSuggestionState]
  }
}

