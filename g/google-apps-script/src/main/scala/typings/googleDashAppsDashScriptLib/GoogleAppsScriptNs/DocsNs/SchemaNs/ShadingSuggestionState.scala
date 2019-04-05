package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadingSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object ShadingSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[scala.Boolean] = js.undefined): ShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested)
    __obj.asInstanceOf[ShadingSuggestionState]
  }
}

