package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggested change to a TextStyle.
  */
@js.native
trait Schema$SuggestedTextStyle extends js.Object {
  /**
    * A TextStyle that only includes the changes made in this suggestion. This
    * can be used along with the text_style_suggestion_state to see which
    * fields have changed and their new values.
    */
  var textStyle: js.UndefOr[Schema$TextStyle] = js.native
  /**
    * A mask that indicates which of the fields on the base TextStyle have been
    * changed in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[Schema$TextStyleSuggestionState] = js.native
}

object Schema$SuggestedTextStyle {
  @scala.inline
  def apply(
    textStyle: Schema$TextStyle = null,
    textStyleSuggestionState: Schema$TextStyleSuggestionState = null
  ): Schema$SuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SuggestedTextStyle]
  }
}

