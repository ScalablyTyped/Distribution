package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a ParagraphStyle.
  */
@js.native
trait Schema$SuggestedParagraphStyle extends js.Object {
  /**
    * A ParagraphStyle that only includes the changes made in this suggestion.
    * This can be used along with the paragraph_suggestion_state to see which
    * fields have changed and their new values.
    */
  var paragraphStyle: js.UndefOr[Schema$ParagraphStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base ParagraphStyle have
    * been changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[Schema$ParagraphStyleSuggestionState] = js.native
}

object Schema$SuggestedParagraphStyle {
  @scala.inline
  def apply(
    paragraphStyle: Schema$ParagraphStyle = null,
    paragraphStyleSuggestionState: Schema$ParagraphStyleSuggestionState = null
  ): Schema$SuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedParagraphStyle]
  }
}

