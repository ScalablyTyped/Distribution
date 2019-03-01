package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
trait ListLevelSettings extends js.Object {
  /**
    * Gets or sets the paragraph text alignment within numbered list levels.
    * Value: One of the <see cref="ListLevelNumberAlignment" /> values.
    */
  var alignment: js.Any
  /**
    * Gets or sets the pattern used to format the list level for display purposes.
    * Value: A string value specifying the format pattern.
    */
  var displayFormatString: java.lang.String
  /**
    * Gets or sets a value specifying the indent of the first line of the current list level's paragraph.
    * Value: An integer value specifying the indent.
    */
  var firstLineIndent: scala.Double
  /**
    * Gets or sets a value specifying whether and how the first line of the current list level's paragraph is indented.
    * Value: One of the <see cref="ParagraphFirstLineIndent" /> values.
    */
  var firstLineIndentType: js.Any
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is bold.
    * Value: true, if the font formatting is bold; otherwise, false.
    */
  var fontBold: scala.Boolean
  /**
    * Gets or sets the font color of the current list level's paragraph.
    * Value: A string value specifying the font color.
    */
  var fontColor: java.lang.String
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is italic.
    * Value: true, if the font formatting is italic; otherwise, false.
    */
  var fontItalic: scala.Boolean
  /**
    * Gets or sets the font name of the current list level's paragraph.
    * Value: A string value specifying the font name.
    */
  var fontName: java.lang.String
  /**
    * Gets or sets the font size of the current list level's paragraph.
    * Value: An integer value specifying the font size.
    */
  var fontSize: scala.Double
  /**
    * Gets or sets the numbering format used for the current list level's paragraph.
    * Value: One of the <see cref="ListLevelFormat" /> values.
    */
  var format: js.Any
  /**
    * Gets or sets the left indent for text within the current list level's paragraph.
    * Value: An integer value specifying the left indent.
    */
  var leftIndent: scala.Double
  /**
    * Gets or sets the character inserted after the number for a numbered list item.
    * Value: A string value that is the trailing character for the list level.
    */
  var separator: java.lang.String
  /**
    * Gets the list level item's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
}

object ListLevelSettings {
  @scala.inline
  def apply(
    alignment: js.Any,
    displayFormatString: java.lang.String,
    firstLineIndent: scala.Double,
    firstLineIndentType: js.Any,
    fontBold: scala.Boolean,
    fontColor: java.lang.String,
    fontItalic: scala.Boolean,
    fontName: java.lang.String,
    fontSize: scala.Double,
    format: js.Any,
    leftIndent: scala.Double,
    separator: java.lang.String,
    start: scala.Double
  ): ListLevelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alignment")(alignment)
    __obj.updateDynamic("displayFormatString")(displayFormatString)
    __obj.updateDynamic("firstLineIndent")(firstLineIndent)
    __obj.updateDynamic("firstLineIndentType")(firstLineIndentType)
    __obj.updateDynamic("fontBold")(fontBold)
    __obj.updateDynamic("fontColor")(fontColor)
    __obj.updateDynamic("fontItalic")(fontItalic)
    __obj.updateDynamic("fontName")(fontName)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("leftIndent")(leftIndent)
    __obj.updateDynamic("separator")(separator)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ListLevelSettings]
  }
}

