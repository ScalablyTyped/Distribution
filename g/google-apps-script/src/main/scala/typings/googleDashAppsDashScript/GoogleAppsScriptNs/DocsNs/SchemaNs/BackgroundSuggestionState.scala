package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
}

object BackgroundSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined): BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested)
    __obj.asInstanceOf[BackgroundSuggestionState]
  }
}

