package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedTableRowStyle extends js.Object {
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.undefined
  var tableRowStyleSuggestionState: js.UndefOr[TableRowStyleSuggestionState] = js.undefined
}

object SuggestedTableRowStyle {
  @scala.inline
  def apply(
    tableRowStyle: TableRowStyle = null,
    tableRowStyleSuggestionState: TableRowStyleSuggestionState = null
  ): SuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    if (tableRowStyleSuggestionState != null) __obj.updateDynamic("tableRowStyleSuggestionState")(tableRowStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedTableRowStyle]
  }
}

