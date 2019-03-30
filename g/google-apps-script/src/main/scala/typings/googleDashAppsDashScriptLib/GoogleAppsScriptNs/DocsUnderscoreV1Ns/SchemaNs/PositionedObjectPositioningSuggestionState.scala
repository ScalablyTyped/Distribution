package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObjectPositioningSuggestionState extends js.Object {
  var layoutSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var leftOffsetSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var topOffsetSuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object PositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(
    layoutSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    leftOffsetSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    topOffsetSuggested: js.UndefOr[scala.Boolean] = js.undefined
  ): PositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(layoutSuggested)) __obj.updateDynamic("layoutSuggested")(layoutSuggested)
    if (!js.isUndefined(leftOffsetSuggested)) __obj.updateDynamic("leftOffsetSuggested")(leftOffsetSuggested)
    if (!js.isUndefined(topOffsetSuggested)) __obj.updateDynamic("topOffsetSuggested")(topOffsetSuggested)
    __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
  }
}

