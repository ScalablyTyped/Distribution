package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  var indentStart: js.UndefOr[Dimension] = js.undefined
  var lineSpacing: js.UndefOr[Double] = js.undefined
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  var spacingMode: js.UndefOr[String] = js.undefined
}

object ParagraphStyle {
  @scala.inline
  def apply(
    alignment: String = null,
    direction: String = null,
    indentEnd: Dimension = null,
    indentFirstLine: Dimension = null,
    indentStart: Dimension = null,
    lineSpacing: Int | Double = null,
    spaceAbove: Dimension = null,
    spaceBelow: Dimension = null,
    spacingMode: String = null
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (indentEnd != null) __obj.updateDynamic("indentEnd")(indentEnd.asInstanceOf[js.Any])
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine.asInstanceOf[js.Any])
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart.asInstanceOf[js.Any])
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (spaceAbove != null) __obj.updateDynamic("spaceAbove")(spaceAbove.asInstanceOf[js.Any])
    if (spaceBelow != null) __obj.updateDynamic("spaceBelow")(spaceBelow.asInstanceOf[js.Any])
    if (spacingMode != null) __obj.updateDynamic("spacingMode")(spacingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphStyle]
  }
}

