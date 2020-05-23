package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

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
    if (!js.isUndefined(listIdSuggested)) __obj.updateDynamic("listIdSuggested")(listIdSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevelSuggested)) __obj.updateDynamic("nestingLevelSuggested")(nestingLevelSuggested.get.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletSuggestionState]
  }
}

