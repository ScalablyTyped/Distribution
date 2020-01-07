package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a TableRowStyle.
  */
@js.native
trait Schema$SuggestedTableRowStyle extends js.Object {
  /**
    * A TableRowStyle that only includes the changes made in this suggestion.
    * This can be used along with the table_row_style_suggestion_state to see
    * which fields have changed and their new values.
    */
  var tableRowStyle: js.UndefOr[Schema$TableRowStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base TableRowStyle have
    * been changed in this suggestion.
    */
  var tableRowStyleSuggestionState: js.UndefOr[Schema$TableRowStyleSuggestionState] = js.native
}

object Schema$SuggestedTableRowStyle {
  @scala.inline
  def apply(
    tableRowStyle: Schema$TableRowStyle = null,
    tableRowStyleSuggestionState: Schema$TableRowStyleSuggestionState = null
  ): Schema$SuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    if (tableRowStyleSuggestionState != null) __obj.updateDynamic("tableRowStyleSuggestionState")(tableRowStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedTableRowStyle]
  }
}

