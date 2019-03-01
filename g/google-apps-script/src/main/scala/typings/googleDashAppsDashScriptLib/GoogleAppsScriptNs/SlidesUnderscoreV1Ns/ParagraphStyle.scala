package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Styles that apply to a whole paragraph.
//
// If this text is contained in a shape with a parent placeholder, then these
// paragraph styles may be inherited from the parent. Which paragraph styles
// are inherited depend on the nesting level of lists:
//
// * A paragraph not in a list will inherit its paragraph style from the
//   paragraph at the 0 nesting level of the list inside the parent placeholder.
// * A paragraph in a list will inherit its paragraph style from the paragraph
//   at its corresponding nesting level of the list inside the parent
//   placeholder.
//
// Inherited paragraph styles are represented as unset fields in this message.
trait ParagraphStyle extends js.Object {
  // The text alignment for this paragraph.
  var alignment: ParagraphStyleAlignment
  // The text direction of this paragraph. If unset, the value defaults to
  // LEFT_TO_RIGHT] since text direction is not inherited.
  var direction: ParagraphStyleTextDirection
  // The amount indentation for the paragraph on the side that corresponds to
  // the end of the text, based on the current text direction. If unset, the
  // value is inherited from the parent.
  var indent_end: Dimension
  // The amount of indentation for the start of the first line of the paragraph.
  // If unset, the value is inherited from the parent.
  var indent_first_line: Dimension
  // The amount indentation for the paragraph on the side that corresponds to
  // the start of the text, based on the current text direction. If unset, the
  // value is inherited from the parent.
  var indent_start: Dimension
  // The amount of space between lines, as a percentage of normal, where normal
  // is represented as 100.0. If unset, the value is inherited from the parent.
  var line_spacing: scala.Double
  // The amount of extra space above the paragraph. If unset, the value is
  // inherited from the parent.
  var space_above: Dimension
  // The amount of extra space below the paragraph. If unset, the value is
  // inherited from the parent.
  var space_below: Dimension
  // The spacing mode for the paragraph.
  var spacing_mode: ParagraphStyleSpacingMode
}

object ParagraphStyle {
  @scala.inline
  def apply(
    alignment: ParagraphStyleAlignment,
    direction: ParagraphStyleTextDirection,
    indent_end: Dimension,
    indent_first_line: Dimension,
    indent_start: Dimension,
    line_spacing: scala.Double,
    space_above: Dimension,
    space_below: Dimension,
    spacing_mode: ParagraphStyleSpacingMode
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alignment")(alignment)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("indent_end")(indent_end)
    __obj.updateDynamic("indent_first_line")(indent_first_line)
    __obj.updateDynamic("indent_start")(indent_start)
    __obj.updateDynamic("line_spacing")(line_spacing)
    __obj.updateDynamic("space_above")(space_above)
    __obj.updateDynamic("space_below")(space_below)
    __obj.updateDynamic("spacing_mode")(spacing_mode)
    __obj.asInstanceOf[ParagraphStyle]
  }
}

