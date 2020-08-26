package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
@js.native
trait ListLevelSettings extends js.Object {
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
  @scala.inline
  implicit class ListLevelSettingsOps[Self <: ListLevelSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: ListLevelNumberAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayFormatString(value: String): Self = this.set("displayFormatString", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLineIndent(value: Double): Self = this.set("firstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstLineIndentType(value: ParagraphFirstLineIndent): Self = this.set("firstLineIndentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontBold(value: Boolean): Self = this.set("fontBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontItalic(value: Boolean): Self = this.set("fontItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: ListLevelFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftIndent(value: Double): Self = this.set("leftIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

