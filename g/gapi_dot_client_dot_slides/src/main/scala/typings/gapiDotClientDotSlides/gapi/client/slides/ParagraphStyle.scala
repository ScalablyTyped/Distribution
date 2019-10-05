package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParagraphStyle extends js.Object {
  /** The text alignment for this paragraph. */
  var alignment: js.UndefOr[String] = js.undefined
  /**
    * The text direction of this paragraph. If unset, the value defaults to
    * LEFT_TO_RIGHT since
    * text direction is not inherited.
    */
  var direction: js.UndefOr[String] = js.undefined
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the end of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentEnd: js.UndefOr[Dimension] = js.undefined
  /**
    * The amount of indentation for the start of the first line of the paragraph.
    * If unset, the value is inherited from the parent.
    */
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  /**
    * The amount indentation for the paragraph on the side that corresponds to
    * the start of the text, based on the current text direction. If unset, the
    * value is inherited from the parent.
    */
  var indentStart: js.UndefOr[Dimension] = js.undefined
  /**
    * The amount of space between lines, as a percentage of normal, where normal
    * is represented as 100.0. If unset, the value is inherited from the parent.
    */
  var lineSpacing: js.UndefOr[Double] = js.undefined
  /**
    * The amount of extra space above the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceAbove: js.UndefOr[Dimension] = js.undefined
  /**
    * The amount of extra space above the paragraph. If unset, the value is
    * inherited from the parent.
    */
  var spaceBelow: js.UndefOr[Dimension] = js.undefined
  /** The spacing mode for the paragraph. */
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

