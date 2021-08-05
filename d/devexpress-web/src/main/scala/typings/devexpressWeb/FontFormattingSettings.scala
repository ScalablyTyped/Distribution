package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define the font formatting.
  */
trait FontFormattingSettings extends StObject {
  
  /**
    * Gets or sets a value indicating whether all characters are capital letters.
    */
  var allCaps: Boolean
  
  /**
    * Gets or sets the character background color.
    */
  var backColor: String
  
  /**
    * Gets or sets whether the character formatting is bold.
    */
  var bold: Boolean
  
  /**
    * Gets or sets the character(s) font name.
    */
  var fontName: String
  
  /**
    * Gets or sets the foreground color of characters.
    */
  var foreColor: String
  
  /**
    * Gets or sets a value indicating whether a character(s) is hidden.
    */
  var hidden: Boolean
  
  /**
    * Gets or sets a value indicating whether a character(s) is italicized.
    */
  var italic: Boolean
  
  /**
    * Gets or sets a value specifying character script formatting.
    */
  var script: CharacterFormattingScript
  
  /**
    * Gets or sets the character(s) font size (in points).
    */
  var size: Double
  
  /**
    * Gets or sets a value specifying whether the strikeout formatting is applied to a character(s).
    */
  var strikeout: Boolean
  
  /**
    * Gets or sets the type of underline applied to the character(s).
    */
  var underline: Boolean
  
  /**
    * Gets or sets the color of the underline for the specified characters.
    */
  var underlineColor: String
  
  /**
    * Gets or sets whether only word characters are underlined.
    */
  var underlineWordsOnly: Boolean
}
object FontFormattingSettings {
  
  inline def apply(
    allCaps: Boolean,
    backColor: String,
    bold: Boolean,
    fontName: String,
    foreColor: String,
    hidden: Boolean,
    italic: Boolean,
    script: CharacterFormattingScript,
    size: Double,
    strikeout: Boolean,
    underline: Boolean,
    underlineColor: String,
    underlineWordsOnly: Boolean
  ): FontFormattingSettings = {
    val __obj = js.Dynamic.literal(allCaps = allCaps.asInstanceOf[js.Any], backColor = backColor.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], foreColor = foreColor.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strikeout = strikeout.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], underlineColor = underlineColor.asInstanceOf[js.Any], underlineWordsOnly = underlineWordsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFormattingSettings]
  }
  
  extension [Self <: FontFormattingSettings](x: Self) {
    
    inline def setAllCaps(value: Boolean): Self = StObject.set(x, "allCaps", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: String): Self = StObject.set(x, "foreColor", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setScript(value: CharacterFormattingScript): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStrikeout(value: Boolean): Self = StObject.set(x, "strikeout", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColor(value: String): Self = StObject.set(x, "underlineColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlineWordsOnly(value: Boolean): Self = StObject.set(x, "underlineWordsOnly", value.asInstanceOf[js.Any])
  }
}
