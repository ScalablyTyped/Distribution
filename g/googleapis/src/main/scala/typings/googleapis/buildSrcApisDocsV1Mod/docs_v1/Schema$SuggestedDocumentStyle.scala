package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to the DocumentStyle.
  */
@js.native
trait Schema$SuggestedDocumentStyle extends js.Object {
  /**
    * A DocumentStyle that only includes the changes made in this suggestion.
    * This can be used along with the document_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var documentStyle: js.UndefOr[Schema$DocumentStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base DocumentStyle have
    * been changed in this suggestion.
    */
  var documentStyleSuggestionState: js.UndefOr[Schema$DocumentStyleSuggestionState] = js.native
}

object Schema$SuggestedDocumentStyle {
  @scala.inline
  def apply(
    documentStyle: Schema$DocumentStyle = null,
    documentStyleSuggestionState: Schema$DocumentStyleSuggestionState = null
  ): Schema$SuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    if (documentStyle != null) __obj.updateDynamic("documentStyle")(documentStyle.asInstanceOf[js.Any])
    if (documentStyleSuggestionState != null) __obj.updateDynamic("documentStyleSuggestionState")(documentStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedDocumentStyle]
  }
}

