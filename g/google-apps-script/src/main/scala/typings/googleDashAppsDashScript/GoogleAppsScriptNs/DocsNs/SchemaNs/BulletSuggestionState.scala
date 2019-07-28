package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulletSuggestionState extends js.Object {
  var listIdSuggested: js.UndefOr[Boolean] = js.undefined
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.undefined
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}

object BulletSuggestionState {
  @scala.inline
  def apply(
    listIdSuggested: js.UndefOr[Boolean] = js.undefined,
    nestingLevelSuggested: js.UndefOr[Boolean] = js.undefined,
    textStyleSuggestionState: TextStyleSuggestionState = null
  ): BulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(listIdSuggested)) __obj.updateDynamic("listIdSuggested")(listIdSuggested)
    if (!js.isUndefined(nestingLevelSuggested)) __obj.updateDynamic("nestingLevelSuggested")(nestingLevelSuggested)
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState)
    __obj.asInstanceOf[BulletSuggestionState]
  }
}

