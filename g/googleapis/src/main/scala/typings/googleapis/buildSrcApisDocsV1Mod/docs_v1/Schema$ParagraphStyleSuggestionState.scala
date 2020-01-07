package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base ParagraphStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait Schema$ParagraphStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to alignment.
    */
  var alignmentSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to avoid_widow_and_orphan.
    */
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_between.
    */
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_bottom.
    */
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_left.
    */
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_right.
    */
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to border_top.
    */
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to direction.
    */
  var directionSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to heading_id.
    */
  var headingIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_end.
    */
  var indentEndSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to keep_lines_together.
    */
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to keep_with_next.
    */
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to line_spacing.
    */
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to named_style_type.
    */
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in shading have been changed in
    * this suggestion.
    */
  var shadingSuggestionState: js.UndefOr[Schema$ShadingSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to space_above.
    */
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to space_below.
    */
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to spacing_mode.
    */
  var spacingModeSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$ParagraphStyleSuggestionState {
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
    shadingSuggestionState: Schema$ShadingSuggestionState = null,
    spaceAboveSuggested: js.UndefOr[Boolean] = js.undefined,
    spaceBelowSuggested: js.UndefOr[Boolean] = js.undefined,
    spacingModeSuggested: js.UndefOr[Boolean] = js.undefined
  ): Schema$ParagraphStyleSuggestionState = {
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
    __obj.asInstanceOf[Schema$ParagraphStyleSuggestionState]
  }
}

