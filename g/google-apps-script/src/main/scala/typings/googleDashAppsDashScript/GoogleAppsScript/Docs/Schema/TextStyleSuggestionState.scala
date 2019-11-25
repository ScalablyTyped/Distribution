package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleSuggestionState extends js.Object {
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
  var baselineOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  var boldSuggested: js.UndefOr[Boolean] = js.undefined
  var fontSizeSuggested: js.UndefOr[Boolean] = js.undefined
  var foregroundColorSuggested: js.UndefOr[Boolean] = js.undefined
  var italicSuggested: js.UndefOr[Boolean] = js.undefined
  var linkSuggested: js.UndefOr[Boolean] = js.undefined
  var smallCapsSuggested: js.UndefOr[Boolean] = js.undefined
  var strikethroughSuggested: js.UndefOr[Boolean] = js.undefined
  var underlineSuggested: js.UndefOr[Boolean] = js.undefined
  var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.undefined
}

object TextStyleSuggestionState {
  @scala.inline
  def apply(
    backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined,
    baselineOffsetSuggested: js.UndefOr[Boolean] = js.undefined,
    boldSuggested: js.UndefOr[Boolean] = js.undefined,
    fontSizeSuggested: js.UndefOr[Boolean] = js.undefined,
    foregroundColorSuggested: js.UndefOr[Boolean] = js.undefined,
    italicSuggested: js.UndefOr[Boolean] = js.undefined,
    linkSuggested: js.UndefOr[Boolean] = js.undefined,
    smallCapsSuggested: js.UndefOr[Boolean] = js.undefined,
    strikethroughSuggested: js.UndefOr[Boolean] = js.undefined,
    underlineSuggested: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamilySuggested: js.UndefOr[Boolean] = js.undefined
  ): TextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(baselineOffsetSuggested)) __obj.updateDynamic("baselineOffsetSuggested")(baselineOffsetSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(boldSuggested)) __obj.updateDynamic("boldSuggested")(boldSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSizeSuggested)) __obj.updateDynamic("fontSizeSuggested")(fontSizeSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(foregroundColorSuggested)) __obj.updateDynamic("foregroundColorSuggested")(foregroundColorSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(italicSuggested)) __obj.updateDynamic("italicSuggested")(italicSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(linkSuggested)) __obj.updateDynamic("linkSuggested")(linkSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(smallCapsSuggested)) __obj.updateDynamic("smallCapsSuggested")(smallCapsSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethroughSuggested)) __obj.updateDynamic("strikethroughSuggested")(strikethroughSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineSuggested)) __obj.updateDynamic("underlineSuggested")(underlineSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(weightedFontFamilySuggested)) __obj.updateDynamic("weightedFontFamilySuggested")(weightedFontFamilySuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleSuggestionState]
  }
}

