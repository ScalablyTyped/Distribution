package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DocsNs.SchemaNs

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
    if (!js.isUndefined(bulletAlignmentSuggested)) __obj.updateDynamic("bulletAlignmentSuggested")(bulletAlignmentSuggested)
    if (!js.isUndefined(glyphFormatSuggested)) __obj.updateDynamic("glyphFormatSuggested")(glyphFormatSuggested)
    if (!js.isUndefined(glyphSymbolSuggested)) __obj.updateDynamic("glyphSymbolSuggested")(glyphSymbolSuggested)
    if (!js.isUndefined(glyphTypeSuggested)) __obj.updateDynamic("glyphTypeSuggested")(glyphTypeSuggested)
    if (!js.isUndefined(indentFirstLineSuggested)) __obj.updateDynamic("indentFirstLineSuggested")(indentFirstLineSuggested)
    if (!js.isUndefined(indentStartSuggested)) __obj.updateDynamic("indentStartSuggested")(indentStartSuggested)
    if (!js.isUndefined(startNumberSuggested)) __obj.updateDynamic("startNumberSuggested")(startNumberSuggested)
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState)
    __obj.asInstanceOf[NestingLevelSuggestionState]
  }
}

