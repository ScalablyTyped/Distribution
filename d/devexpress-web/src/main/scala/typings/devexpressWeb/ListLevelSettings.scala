package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
trait ListLevelSettings extends StObject {
  
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
  
  @scala.inline
  implicit class ListLevelSettingsMutableBuilder[Self <: ListLevelSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: ListLevelNumberAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFormatString(value: String): Self = StObject.set(x, "displayFormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineIndent(value: Double): Self = StObject.set(x, "firstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineIndentType(value: ParagraphFirstLineIndent): Self = StObject.set(x, "firstLineIndentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBold(value: Boolean): Self = StObject.set(x, "fontBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontItalic(value: Boolean): Self = StObject.set(x, "fontItalic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ListLevelFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIndent(value: Double): Self = StObject.set(x, "leftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
