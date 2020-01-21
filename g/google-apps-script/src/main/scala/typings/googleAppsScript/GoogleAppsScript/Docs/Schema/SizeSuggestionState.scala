package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSuggestionState extends js.Object {
  var heightSuggested: js.UndefOr[Boolean] = js.undefined
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}

object SizeSuggestionState {
  @scala.inline
  def apply(
    heightSuggested: js.UndefOr[Boolean] = js.undefined,
    widthSuggested: js.UndefOr[Boolean] = js.undefined
  ): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heightSuggested)) __obj.updateDynamic("heightSuggested")(heightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSuggested)) __obj.updateDynamic("widthSuggested")(widthSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSuggestionState]
  }
}

