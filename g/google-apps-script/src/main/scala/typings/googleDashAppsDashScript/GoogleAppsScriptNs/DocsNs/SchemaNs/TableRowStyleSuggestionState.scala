package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowStyleSuggestionState extends js.Object {
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.undefined
}

object TableRowStyleSuggestionState {
  @scala.inline
  def apply(minRowHeightSuggested: js.UndefOr[Boolean] = js.undefined): TableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minRowHeightSuggested)) __obj.updateDynamic("minRowHeightSuggested")(minRowHeightSuggested)
    __obj.asInstanceOf[TableRowStyleSuggestionState]
  }
}

