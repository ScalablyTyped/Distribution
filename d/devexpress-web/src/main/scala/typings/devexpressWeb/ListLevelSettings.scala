package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
trait ListLevelSettings extends js.Object {
  /**
    * Gets or sets the paragraph text alignment within numbered list levels.
    */
  var alignment: ListLevelNumberAlignment
  /**
    * Gets or sets the pattern used to format the list level for display purposes.
    */
  var displayFormatString: String
  /**
    * Gets or sets a value specifying the indent of the first line of the current list level's paragraph.
    */
  var firstLineIndent: Double
  /**
    * Gets or sets a value specifying whether and how the first line of the current list level's paragraph is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is bold.
    */
  var fontBold: Boolean
  /**
    * Gets or sets the font color of the current list level's paragraph.
    */
  var fontColor: String
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is italic.
    */
  var fontItalic: Boolean
  /**
    * Gets or sets the font name of the current list level's paragraph.
    */
  var fontName: String
  /**
    * Gets or sets the font size of the current list level's paragraph.
    */
  var fontSize: Double
  /**
    * Gets or sets the numbering format used for the current list level's paragraph.
    */
  var format: ListLevelFormat
  /**
    * Gets or sets the left indent for text within the current list level's paragraph.
    */
  var leftIndent: Double
  /**
    * Gets or sets the character inserted after the number for a numbered list item.
    */
  var separator: String
  /**
    * Gets the list level item's start position in the document.
    */
  var start: Double
}

object ListLevelSettings {
  @scala.inline
  def apply(
    alignment: ListLevelNumberAlignment,
    displayFormatString: String,
    firstLineIndent: Double,
    firstLineIndentType: ParagraphFirstLineIndent,
    fontBold: Boolean,
    fontColor: String,
    fontItalic: Boolean,
    fontName: String,
    fontSize: Double,
    format: ListLevelFormat,
    leftIndent: Double,
    separator: String,
    start: Double
  ): ListLevelSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], displayFormatString = displayFormatString.asInstanceOf[js.Any], firstLineIndent = firstLineIndent.asInstanceOf[js.Any], firstLineIndentType = firstLineIndentType.asInstanceOf[js.Any], fontBold = fontBold.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontItalic = fontItalic.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], leftIndent = leftIndent.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevelSettings]
  }
}

