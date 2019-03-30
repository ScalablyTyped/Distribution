package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object BackgroundSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[scala.Boolean] = js.undefined): BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested)
    __obj.asInstanceOf[BackgroundSuggestionState]
  }
}

