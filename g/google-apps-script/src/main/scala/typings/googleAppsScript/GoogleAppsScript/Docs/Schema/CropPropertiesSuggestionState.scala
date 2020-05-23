package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropPropertiesSuggestionState extends js.Object {
  var angleSuggested: js.UndefOr[Boolean] = js.undefined
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined
  var offsetRightSuggested: js.UndefOr[Boolean] = js.undefined
  var offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
}

object CropPropertiesSuggestionState {
  @scala.inline
  def apply(
    angleSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetRightSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
  ): CropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angleSuggested)) __obj.updateDynamic("angleSuggested")(angleSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottomSuggested)) __obj.updateDynamic("offsetBottomSuggested")(offsetBottomSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeftSuggested)) __obj.updateDynamic("offsetLeftSuggested")(offsetLeftSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetRightSuggested)) __obj.updateDynamic("offsetRightSuggested")(offsetRightSuggested.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTopSuggested)) __obj.updateDynamic("offsetTopSuggested")(offsetTopSuggested.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropPropertiesSuggestionState]
  }
}

