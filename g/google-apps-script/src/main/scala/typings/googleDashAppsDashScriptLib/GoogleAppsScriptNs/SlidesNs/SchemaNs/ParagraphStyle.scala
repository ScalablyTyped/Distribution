package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  var indentStart: js.UndefOr[Dimension] = js.undefined
  var lineSpacing: js.UndefOr[scala.Double] = js.undefined
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  var spacingMode: js.UndefOr[java.lang.String] = js.undefined
}

object ParagraphStyle {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    direction: java.lang.String = null,
    indentEnd: Dimension = null,
    indentFirstLine: Dimension = null,
    indentStart: Dimension = null,
    lineSpacing: scala.Int | scala.Double = null,
    spaceAbove: Dimension = null,
    spaceBelow: Dimension = null,
    spacingMode: java.lang.String = null
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (indentEnd != null) __obj.updateDynamic("indentEnd")(indentEnd)
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine)
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart)
    if (lineSpacing != null) __obj.updateDynamic("lineSpacing")(lineSpacing.asInstanceOf[js.Any])
    if (spaceAbove != null) __obj.updateDynamic("spaceAbove")(spaceAbove)
    if (spaceBelow != null) __obj.updateDynamic("spaceBelow")(spaceBelow)
    if (spacingMode != null) __obj.updateDynamic("spacingMode")(spacingMode)
    __obj.asInstanceOf[ParagraphStyle]
  }
}

