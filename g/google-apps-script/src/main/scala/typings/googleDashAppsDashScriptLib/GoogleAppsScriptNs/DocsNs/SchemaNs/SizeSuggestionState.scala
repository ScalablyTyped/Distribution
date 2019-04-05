package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSuggestionState extends js.Object {
  var heightSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var widthSuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object SizeSuggestionState {
  @scala.inline
  def apply(
    heightSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    widthSuggested: js.UndefOr[scala.Boolean] = js.undefined
  ): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heightSuggested)) __obj.updateDynamic("heightSuggested")(heightSuggested)
    if (!js.isUndefined(widthSuggested)) __obj.updateDynamic("widthSuggested")(widthSuggested)
    __obj.asInstanceOf[SizeSuggestionState]
  }
}

