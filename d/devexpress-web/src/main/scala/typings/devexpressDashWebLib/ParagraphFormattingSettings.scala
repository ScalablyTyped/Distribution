package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings to define the paragraph formatting.
 */

trait ParagraphFormattingSettings extends js.Object {
  /**
       * Gets or sets the paragraph alignment.
       * Value: One of the <see cref="ParagraphAlignment" /> values.
       */
  var alignment: js.Any
  /**
       * Gets or sets the paragraph background color.
       * Value: A string value specifying the background color.
       */
  var backColor: java.lang.String
  /**
       * Gets or sets whether to suppress addition of additional space (contextual spacing) between paragraphs of the same style.
       * Value: true to remove extra spacing between paragraphs, false to add extra space.
       */
  var contextualSpacing: scala.Boolean
  /**
       * Gets or sets a value specifying the indent of the first line of a paragraph (in twips).
       * Value: An integer value specifying the indent of the first line.
       */
  var firstLineIndent: scala.Double
  /**
       * Gets or sets a value specifying whether and how the first line of a paragraph is indented.
       * Value: One of the <see cref="ParagraphFirstLineIndent" /> values.
       */
  var firstLineIndentType: js.Any
  /**
       * Gets or sets whether to prevent all page breaks that interrupt a paragraph.
       * Value: true, to keep paragraph lines together; otherwise, false.
       */
  var keepLinesTogether: scala.Boolean
  /**
       * Gets or sets the left indent for text within a paragraph (in twips).
       * Value: An integer value specifying the left indent.
       */
  var leftIndent: scala.Double
  /**
       * Gets or sets a line spacing value (in twips).
       * Value: An integer value specifying the line spacing.
       */
  var lineSpacing: scala.Double
  /**
       * Gets or sets a value which determines the spacing between lines in a paragraph.
       * Value: One of the <see cref="ParagraphLineSpacingType" /> values.
       */
  var lineSpacingType: js.Any
  /**
       * Gets or sets the outline level of a paragraph.
       * Value: An integer specifying the level number.
       */
  var outlineLevel: scala.Double
  /**
       * Gets or sets whether a page break is inserted automatically before a specified paragraph(s).
       * Value: true, if a page break is inserted automatically before a paragraph(s); otherwise, false.
       */
  var pageBreakBefore: scala.Boolean
  /**
       * Gets or sets the right indent value for the specified paragraph (in twips).
       * Value: An integer value specifying the right indent.
       */
  var rightIndent: scala.Double
  /**
       * Gets or sets the spacing after each selected paragraph (in twips).
       * Value: An integer value specifying the spacing after the paragraph.
       */
  var spacingAfter: scala.Double
  /**
       * Gets or sets the spacing before each selected paragraph (in twips).
       * Value: An integer value specifying the spacing before the paragraph.
       */
  var spacingBefore: scala.Double
}

