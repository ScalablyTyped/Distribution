package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyleSuggestionState extends js.Object {
  var alignmentSuggested: js.UndefOr[Boolean] = js.undefined
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.undefined
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.undefined
  var borderBottomSuggested: js.UndefOr[Boolean] = js.undefined
  var borderLeftSuggested: js.UndefOr[Boolean] = js.undefined
  var borderRightSuggested: js.UndefOr[Boolean] = js.undefined
  var borderTopSuggested: js.UndefOr[Boolean] = js.undefined
  var directionSuggested: js.UndefOr[Boolean] = js.undefined
  var headingIdSuggested: js.UndefOr[Boolean] = js.undefined
  var indentEndSuggested: js.UndefOr[Boolean] = js.undefined
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined
  var indentStartSuggested: js.UndefOr[Boolean] = js.undefined
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.undefined
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.undefined
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.undefined
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.undefined
  var shadingSuggestionState: js.UndefOr[ShadingSuggestionState] = js.undefined
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.undefined
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.undefined
  var spacingModeSuggested: js.UndefOr[Boolean] = js.undefined
}

object ParagraphStyleSuggestionState {
  @scala.inline
  def apply(
    alignmentSuggested: js.UndefOr[Boolean] = js.undefined,
    avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.undefined,
    borderBetweenSuggested: js.UndefOr[Boolean] = js.undefined,
    borderBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    borderLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    borderRightSuggested: js.UndefOr[Boolean] = js.undefined,
    borderTopSuggested: js.UndefOr[Boolean] = js.undefined,
    directionSuggested: js.UndefOr[Boolean] = js.undefined,
    headingIdSuggested: js.UndefOr[Boolean] = js.undefined,
    indentEndSuggested: js.UndefOr[Boolean] = js.undefined,
    indentFirstLineSuggested: js.UndefOr[Boolean] = js.undefined,
    indentStartSuggested: js.UndefOr[Boolean] = js.undefined,
    keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.undefined,
    keepWithNextSuggested: js.UndefOr[Boolean] = js.undefined,
    lineSpacingSuggested: js.UndefOr[Boolean] = js.undefined,
    namedStyleTypeSuggested: js.UndefOr[Boolean] = js.undefined,
    shadingSuggestionState: ShadingSuggestionState = null,
    spaceAboveSuggested: js.UndefOr[Boolean] = js.undefined,
    spaceBelowSuggested: js.UndefOr[Boolean] = js.undefined,
    spacingModeSuggested: js.UndefOr[Boolean] = js.undefined
  ): ParagraphStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignmentSuggested)) __obj.updateDynamic("alignmentSuggested")(alignmentSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidWidowAndOrphanSuggested)) __obj.updateDynamic("avoidWidowAndOrphanSuggested")(avoidWidowAndOrphanSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBetweenSuggested)) __obj.updateDynamic("borderBetweenSuggested")(borderBetweenSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderBottomSuggested)) __obj.updateDynamic("borderBottomSuggested")(borderBottomSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftSuggested)) __obj.updateDynamic("borderLeftSuggested")(borderLeftSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightSuggested)) __obj.updateDynamic("borderRightSuggested")(borderRightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopSuggested)) __obj.updateDynamic("borderTopSuggested")(borderTopSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(directionSuggested)) __obj.updateDynamic("directionSuggested")(directionSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(headingIdSuggested)) __obj.updateDynamic("headingIdSuggested")(headingIdSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(indentEndSuggested)) __obj.updateDynamic("indentEndSuggested")(indentEndSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(indentFirstLineSuggested)) __obj.updateDynamic("indentFirstLineSuggested")(indentFirstLineSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(indentStartSuggested)) __obj.updateDynamic("indentStartSuggested")(indentStartSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLinesTogetherSuggested)) __obj.updateDynamic("keepLinesTogetherSuggested")(keepLinesTogetherSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(keepWithNextSuggested)) __obj.updateDynamic("keepWithNextSuggested")(keepWithNextSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSpacingSuggested)) __obj.updateDynamic("lineSpacingSuggested")(lineSpacingSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(namedStyleTypeSuggested)) __obj.updateDynamic("namedStyleTypeSuggested")(namedStyleTypeSuggested.asInstanceOf[js.Any])
    if (shadingSuggestionState != null) __obj.updateDynamic("shadingSuggestionState")(shadingSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceAboveSuggested)) __obj.updateDynamic("spaceAboveSuggested")(spaceAboveSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBelowSuggested)) __obj.updateDynamic("spaceBelowSuggested")(spaceBelowSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingModeSuggested)) __obj.updateDynamic("spacingModeSuggested")(spacingModeSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyleSuggestionState]
  }
}

