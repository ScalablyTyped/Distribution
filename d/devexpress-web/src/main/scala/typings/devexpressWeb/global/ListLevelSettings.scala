package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define individual bulleted or numbered list levels.
  */
@JSGlobal("ListLevelSettings")
@js.native
class ListLevelSettings ()
  extends StObject
     with typings.devexpressWeb.ListLevelSettings {
  
  /**
    * Gets or sets the paragraph text alignment within numbered list levels.
    */
  /* CompleteClass */
  var alignment: typings.devexpressWeb.ListLevelNumberAlignment = js.native
  
  /**
    * Gets or sets the pattern used to format the list level for display purposes.
    */
  /* CompleteClass */
  var displayFormatString: String = js.native
  
  /**
    * Gets or sets a value specifying the indent of the first line of the current list level's paragraph.
    */
  /* CompleteClass */
  var firstLineIndent: Double = js.native
  
  /**
    * Gets or sets a value specifying whether and how the first line of the current list level's paragraph is indented.
    */
  /* CompleteClass */
  var firstLineIndentType: typings.devexpressWeb.ParagraphFirstLineIndent = js.native
  
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is bold.
    */
  /* CompleteClass */
  var fontBold: Boolean = js.native
  
  /**
    * Gets or sets the font color of the current list level's paragraph.
    */
  /* CompleteClass */
  var fontColor: String = js.native
  
  /**
    * Gets or sets whether the font formatting of the current list level's paragraph is italic.
    */
  /* CompleteClass */
  var fontItalic: Boolean = js.native
  
  /**
    * Gets or sets the font name of the current list level's paragraph.
    */
  /* CompleteClass */
  var fontName: String = js.native
  
  /**
    * Gets or sets the font size of the current list level's paragraph.
    */
  /* CompleteClass */
  var fontSize: Double = js.native
  
  /**
    * Gets or sets the numbering format used for the current list level's paragraph.
    */
  /* CompleteClass */
  var format: typings.devexpressWeb.ListLevelFormat = js.native
  
  /**
    * Gets or sets the left indent for text within the current list level's paragraph.
    */
  /* CompleteClass */
  var leftIndent: Double = js.native
  
  /**
    * Gets or sets the character inserted after the number for a numbered list item.
    */
  /* CompleteClass */
  var separator: String = js.native
  
  /**
    * Gets the list level item's start position in the document.
    */
  /* CompleteClass */
  var start: Double = js.native
}
