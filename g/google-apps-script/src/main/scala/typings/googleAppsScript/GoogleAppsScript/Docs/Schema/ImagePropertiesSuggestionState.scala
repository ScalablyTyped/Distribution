package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropertiesSuggestionState extends js.Object {
  var angleSuggested: js.UndefOr[Boolean] = js.undefined
  var brightnessSuggested: js.UndefOr[Boolean] = js.undefined
  var contentUriSuggested: js.UndefOr[Boolean] = js.undefined
  var contrastSuggested: js.UndefOr[Boolean] = js.undefined
  var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.undefined
  var sourceUriSuggested: js.UndefOr[Boolean] = js.undefined
  var transparencySuggested: js.UndefOr[Boolean] = js.undefined
}

object ImagePropertiesSuggestionState {
  @scala.inline
  def apply(
    angleSuggested: js.UndefOr[Boolean] = js.undefined,
    brightnessSuggested: js.UndefOr[Boolean] = js.undefined,
    contentUriSuggested: js.UndefOr[Boolean] = js.undefined,
    contrastSuggested: js.UndefOr[Boolean] = js.undefined,
    cropPropertiesSuggestionState: CropPropertiesSuggestionState = null,
    sourceUriSuggested: js.UndefOr[Boolean] = js.undefined,
    transparencySuggested: js.UndefOr[Boolean] = js.undefined
  ): ImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angleSuggested)) __obj.updateDynamic("angleSuggested")(angleSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(brightnessSuggested)) __obj.updateDynamic("brightnessSuggested")(brightnessSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(contentUriSuggested)) __obj.updateDynamic("contentUriSuggested")(contentUriSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(contrastSuggested)) __obj.updateDynamic("contrastSuggested")(contrastSuggested.asInstanceOf[js.Any])
    if (cropPropertiesSuggestionState != null) __obj.updateDynamic("cropPropertiesSuggestionState")(cropPropertiesSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceUriSuggested)) __obj.updateDynamic("sourceUriSuggested")(sourceUriSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(transparencySuggested)) __obj.updateDynamic("transparencySuggested")(transparencySuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePropertiesSuggestionState]
  }
}

