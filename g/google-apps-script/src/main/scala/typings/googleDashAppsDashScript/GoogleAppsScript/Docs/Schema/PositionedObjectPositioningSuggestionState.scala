package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedObjectPositioningSuggestionState extends js.Object {
  var layoutSuggested: js.UndefOr[Boolean] = js.undefined
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  var topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
}

object PositionedObjectPositioningSuggestionState {
  @scala.inline
  def apply(
    layoutSuggested: js.UndefOr[Boolean] = js.undefined,
    leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined,
    topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  ): PositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(layoutSuggested)) __obj.updateDynamic("layoutSuggested")(layoutSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffsetSuggested)) __obj.updateDynamic("leftOffsetSuggested")(leftOffsetSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffsetSuggested)) __obj.updateDynamic("topOffsetSuggested")(topOffsetSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
  }
}

