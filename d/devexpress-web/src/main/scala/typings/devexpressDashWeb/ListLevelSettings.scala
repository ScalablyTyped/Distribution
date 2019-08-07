package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
@JSGlobal("ListLevelSettings")
@js.native
class ListLevelSettings () extends js.Object {
  /**
    * Gets or sets the paragraph text alignment within numbered list levels.
    */
  var alignment: ListLevelNumberAlignment = js.native
  /**
    * Gets or sets the pattern used to format the list level for display purposes.
    */
  var displayFormatString: String = js.native
  /**
    * Gets or sets a value specifying the indent of the first line of the current list level's paragraph.
    */
  var firstLineIndent: Double = js.native
  /**
    * Gets or sets a value specifying whether and how the first line of the current list level's paragraph is indented.
    */
  var firstLineIndentType: ParagraphFirstLineIndent = js.native
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is bold.
    */
  var fontBold: Boolean = js.native
  /**
    * Gets or sets the font color of the current list level's paragraph.
    */
  var fontColor: String = js.native
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is italic.
    */
  var fontItalic: Boolean = js.native
  /**
    * Gets or sets the font name of the current list level's paragraph.
    */
  var fontName: String = js.native
  /**
    * Gets or sets the font size of the current list level's paragraph.
    */
  var fontSize: Double = js.native
  /**
    * Gets or sets the numbering format used for the current list level's paragraph.
    */
  var format: ListLevelFormat = js.native
  /**
    * Gets or sets the left indent for text within the current list level's paragraph.
    */
  var leftIndent: Double = js.native
  /**
    * Gets or sets the character inserted after the number for a numbered list item.
    */
  var separator: String = js.native
  /**
    * Gets the list level item's start position in the document.
    */
  var start: Double = js.native
}

