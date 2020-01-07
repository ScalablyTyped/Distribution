package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A suggestion state of a NamedStyle message.
  */
@js.native
trait Schema$NamedStyleSuggestionState extends js.Object {
  /**
    * The named style type that this suggestion state corresponds to.  This
    * field is provided as a convenience for matching the
    * NamedStyleSuggestionState with its corresponding NamedStyle.
    */
  var namedStyleType: js.UndefOr[String] = js.native
  /**
    * A mask that indicates which of the fields in paragraph style have been
    * changed in this suggestion.
    */
  var paragraphStyleSuggestionState: js.UndefOr[Schema$ParagraphStyleSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[Schema$TextStyleSuggestionState] = js.native
}

object Schema$NamedStyleSuggestionState {
  @scala.inline
  def apply(
    namedStyleType: String = null,
    paragraphStyleSuggestionState: Schema$ParagraphStyleSuggestionState = null,
    textStyleSuggestionState: Schema$TextStyleSuggestionState = null
  ): Schema$NamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedStyleSuggestionState]
  }
}

