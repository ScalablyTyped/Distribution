package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedTextStyle extends js.Object {
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}

object SuggestedTextStyle {
  @scala.inline
  def apply(textStyle: TextStyle = null, textStyleSuggestionState: TextStyleSuggestionState = null): SuggestedTextStyle = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState)
    __obj.asInstanceOf[SuggestedTextStyle]
  }
}

