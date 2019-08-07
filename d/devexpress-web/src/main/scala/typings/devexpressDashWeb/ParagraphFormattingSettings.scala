package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains paragraph formatting settings.
  */
@JSGlobal("ParagraphFormattingSettings")
@js.native
class ParagraphFormattingSettings () extends js.Object {
  /**
    * Specifies the paragraph alignment.
    */
  var alignment: ParagraphAlignment = js.native
  /**
    * Specifies the paragraph background color.
    */
  var backColor: String = js.native
  /**
    * Specifies whether to remove an additional space (contextual spacing) between paragraphs of the same style.
    */
  var contextualSpacing: Boolean = js.native
  /**
    * Specifies the indent of the paragraph's first line.
    */
  var firstLineIndent: Double = js.native
  /**
    * Specifies whether and how the paragraph's first line is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent = js.native
  /**
    * Specifies whether all lines in a paragraph should appear on the same page.
    */
  var keepLinesTogether: Boolean = js.native
  /**
    * Specifies the left indent for text in a paragraph.
    */
  var leftIndent: Double = js.native
  /**
    * Specifies a line spacing value.
    */
  var lineSpacing: Double = js.native
  /**
    * Specifies a spacing between lines in the paragraph.
    */
  var lineSpacingType: ParagraphLineSpacingType = js.native
  /**
    * Specifies the paragraph's outline level.
    */
  var outlineLevel: Double = js.native
  /**
    * Specifies whether a page break is inserted before the paragraph.
    */
  var pageBreakBefore: Boolean = js.native
  /**
    * Specifies the paragraph's right indent.
    */
  var rightIndent: Double = js.native
  /**
    * Specifies the spacing after the paragraph.
    */
  var spacingAfter: Double = js.native
  /**
    * Specifies the spacing before the paragraph.
    */
  var spacingBefore: Double = js.native
}

