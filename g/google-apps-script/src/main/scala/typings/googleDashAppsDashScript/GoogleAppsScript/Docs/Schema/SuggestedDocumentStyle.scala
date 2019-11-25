package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedDocumentStyle extends js.Object {
  var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
  var documentStyleSuggestionState: js.UndefOr[DocumentStyleSuggestionState] = js.undefined
}

object SuggestedDocumentStyle {
  @scala.inline
  def apply(
    documentStyle: DocumentStyle = null,
    documentStyleSuggestionState: DocumentStyleSuggestionState = null
  ): SuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    if (documentStyle != null) __obj.updateDynamic("documentStyle")(documentStyle.asInstanceOf[js.Any])
    if (documentStyleSuggestionState != null) __obj.updateDynamic("documentStyleSuggestionState")(documentStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedDocumentStyle]
  }
}

