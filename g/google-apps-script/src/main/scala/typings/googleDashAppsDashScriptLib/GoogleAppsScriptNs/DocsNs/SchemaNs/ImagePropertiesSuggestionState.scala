package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropertiesSuggestionState extends js.Object {
  var angleSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var brightnessSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var contentUriSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var contrastSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.undefined
  var sourceUriSuggested: js.UndefOr[scala.Boolean] = js.undefined
  var transparencySuggested: js.UndefOr[scala.Boolean] = js.undefined
}

object ImagePropertiesSuggestionState {
  @scala.inline
  def apply(
    angleSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    brightnessSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    contentUriSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    contrastSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    cropPropertiesSuggestionState: CropPropertiesSuggestionState = null,
    sourceUriSuggested: js.UndefOr[scala.Boolean] = js.undefined,
    transparencySuggested: js.UndefOr[scala.Boolean] = js.undefined
  ): ImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angleSuggested)) __obj.updateDynamic("angleSuggested")(angleSuggested)
    if (!js.isUndefined(brightnessSuggested)) __obj.updateDynamic("brightnessSuggested")(brightnessSuggested)
    if (!js.isUndefined(contentUriSuggested)) __obj.updateDynamic("contentUriSuggested")(contentUriSuggested)
    if (!js.isUndefined(contrastSuggested)) __obj.updateDynamic("contrastSuggested")(contrastSuggested)
    if (cropPropertiesSuggestionState != null) __obj.updateDynamic("cropPropertiesSuggestionState")(cropPropertiesSuggestionState)
    if (!js.isUndefined(sourceUriSuggested)) __obj.updateDynamic("sourceUriSuggested")(sourceUriSuggested)
    if (!js.isUndefined(transparencySuggested)) __obj.updateDynamic("transparencySuggested")(transparencySuggested)
    __obj.asInstanceOf[ImagePropertiesSuggestionState]
  }
}

