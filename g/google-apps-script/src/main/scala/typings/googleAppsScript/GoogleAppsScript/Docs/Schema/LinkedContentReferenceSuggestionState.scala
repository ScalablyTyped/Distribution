package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedContentReferenceSuggestionState extends js.Object {
  var sheetsChartReferenceSuggestionState: js.UndefOr[SheetsChartReferenceSuggestionState] = js.undefined
}

object LinkedContentReferenceSuggestionState {
  @scala.inline
  def apply(sheetsChartReferenceSuggestionState: SheetsChartReferenceSuggestionState = null): LinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReferenceSuggestionState != null) __obj.updateDynamic("sheetsChartReferenceSuggestionState")(sheetsChartReferenceSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedContentReferenceSuggestionState]
  }
}

