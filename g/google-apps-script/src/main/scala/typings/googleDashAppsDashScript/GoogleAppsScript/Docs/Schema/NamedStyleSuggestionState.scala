package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedStyleSuggestionState extends js.Object {
  var namedStyleType: js.UndefOr[String] = js.undefined
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.undefined
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}

object NamedStyleSuggestionState {
  @scala.inline
  def apply(
    namedStyleType: String = null,
    paragraphStyleSuggestionState: ParagraphStyleSuggestionState = null,
    textStyleSuggestionState: TextStyleSuggestionState = null
  ): NamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedStyleSuggestionState]
  }
}

