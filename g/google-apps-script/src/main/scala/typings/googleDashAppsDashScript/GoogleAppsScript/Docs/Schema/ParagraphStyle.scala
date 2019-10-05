package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var avoidWidowAndOrphan: js.UndefOr[Boolean] = js.undefined
  var borderBetween: js.UndefOr[ParagraphBorder] = js.undefined
  var borderBottom: js.UndefOr[ParagraphBorder] = js.undefined
  var borderLeft: js.UndefOr[ParagraphBorder] = js.undefined
  var borderRight: js.UndefOr[ParagraphBorder] = js.undefined
  var borderTop: js.UndefOr[ParagraphBorder] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var headingId: js.UndefOr[String] = js.undefined
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  var indentStart: js.UndefOr[Dimension] = js.undefined
  var keepLinesTogether: js.UndefOr[Boolean] = js.undefined
  var keepWithNext: js.UndefOr[Boolean] = js.undefined
  var lineSpacing: js.UndefOr[Double] = js.undefined
  var namedStyleType: js.UndefOr[String] = js.undefined
  var shading: js.UndefOr[Shading] = js.undefined
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  var spacingMode: js.UndefOr[String] = js.undefined
  var tabStops: js.UndefOr[js.Array[TabStop]] = js.undefined
}

object ParagraphStyle {
  @scala.inline
  def apply(
    alignment: String = null,
    avoidWidowAndOrphan: js.UndefOr[Boolean] = js.undefined,
    borderBetween: ParagraphBorder = null,
    borderBottom: ParagraphBorder = null,
    borderLeft: ParagraphBorder = null,
    borderRight: ParagraphBorder = null,
    borderTop: ParagraphBorder = null,
    direction: String = null,
    headingId: String = null,
    indentEnd: Dimension = null,
    indentFirstLine: Dimension = null,
    indentStart: Dimension = null,
    keepLinesTogether: js.UndefOr[Boolean] = js.undefined,
    keepWithNext: js.UndefOr[Boolean] = js.undefined,
    lineSpacing: Int | Double = null,
    namedStyleType: String = null,
    shading: Shading = null,
    spaceAbove: Dimension = null,
    spaceBelow: Dimension = null,
    spacingMode: String = null,
    tabStops: js.Array[TabStop] = null
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(avoidWidowAndOrphan)) __obj.updateDynamic("avoidWidowAndOrphan")(avoidWidowAndOrphan)
    if (borderBetween != null) __obj.updateDynamic("borderBetween")(borderBetween)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (headingId != null) __obj.updateDynamic("headingId")(headingId)
    if (indentEnd != null) __obj.updateDynamic("indentEnd")(indentEnd)
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine)
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart)
    if (!js.isUndefined(keepLinesTogether)) __obj.updateDynamic("keepLinesTogether")(keepLinesTogether)
    if (!js.isUndefined(keepWithNext)) __obj.updateDynamic("keepWithNext")(keepWithNext)
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType)
    if (shading != null) __obj.updateDynamic("shading")(shading)
    if (spaceAbove != null) __obj.updateDynamic("spaceAbove")(spaceAbove)
    if (spaceBelow != null) __obj.updateDynamic("spaceBelow")(spaceBelow)
    if (spacingMode != null) __obj.updateDynamic("spacingMode")(spacingMode)
    if (tabStops != null) __obj.updateDynamic("tabStops")(tabStops)
    __obj.asInstanceOf[ParagraphStyle]
  }
}

