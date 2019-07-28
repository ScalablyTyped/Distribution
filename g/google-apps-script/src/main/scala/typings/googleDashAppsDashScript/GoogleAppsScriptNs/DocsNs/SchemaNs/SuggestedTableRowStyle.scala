package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle)
    if (tableRowStyleSuggestionState != null) __obj.updateDynamic("tableRowStyleSuggestionState")(tableRowStyleSuggestionState)
    __obj.asInstanceOf[SuggestedTableRowStyle]
  }
}

