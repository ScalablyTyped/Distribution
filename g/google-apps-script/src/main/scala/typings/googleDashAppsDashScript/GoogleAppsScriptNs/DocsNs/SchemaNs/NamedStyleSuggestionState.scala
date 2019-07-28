package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType)
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState)
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState)
    __obj.asInstanceOf[NamedStyleSuggestionState]
  }
}

