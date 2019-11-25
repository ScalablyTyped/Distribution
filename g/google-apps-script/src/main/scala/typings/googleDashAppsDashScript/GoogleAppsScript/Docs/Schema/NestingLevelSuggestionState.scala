package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevelSuggestionState extends js.Object {
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.undefined
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.undefined
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.undefined
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.undefined
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined
  var indentStartSuggested: js.UndefOr[Boolean] = js.undefined
  var startNumberSuggested: js.UndefOr[Boolean] = js.undefined
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}

object NestingLevelSuggestionState {
  @scala.inline
  def apply(
    bulletAlignmentSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphFormatSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphSymbolSuggested: js.UndefOr[Boolean] = js.undefined,
    glyphTypeSuggested: js.UndefOr[Boolean] = js.undefined,
    indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined,
    indentStartSuggested: js.UndefOr[Boolean] = js.undefined,
    startNumberSuggested: js.UndefOr[Boolean] = js.undefined,
    textStyleSuggestionState: TextStyleSuggestionState = null
  ): NestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bulletAlignmentSuggested)) __obj.updateDynamic("bulletAlignmentSuggested")(bulletAlignmentSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphFormatSuggested)) __obj.updateDynamic("glyphFormatSuggested")(glyphFormatSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphSymbolSuggested)) __obj.updateDynamic("glyphSymbolSuggested")(glyphSymbolSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphTypeSuggested)) __obj.updateDynamic("glyphTypeSuggested")(glyphTypeSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFirstLineSuggested)) __obj.updateDynamic("indentFirstLineSuggested")(indentFirstLineSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(indentStartSuggested)) __obj.updateDynamic("indentStartSuggested")(indentStartSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(startNumberSuggested)) __obj.updateDynamic("startNumberSuggested")(startNumberSuggested.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestingLevelSuggestionState]
  }
}

