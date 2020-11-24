package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define the font formatting.
  */
@js.native
trait FontFormattingSettings extends js.Object {
  
  /**
    * Gets or sets a value indicating whether all characters are capital letters.
    */
  var allCaps: Boolean = js.native
  
  /**
    * Gets or sets the character background color.
    */
  var backColor: String = js.native
  
  /**
    * Gets or sets whether the character formatting is bold.
    */
  var bold: Boolean = js.native
  
  /**
    * Gets or sets the character(s) font name.
    */
  var fontName: String = js.native
  
  /**
    * Gets or sets the foreground color of characters.
    */
  var foreColor: String = js.native
  
  /**
    * Gets or sets a value indicating whether a character(s) is hidden.
    */
  var hidden: Boolean = js.native
  
  /**
    * Gets or sets a value indicating whether a character(s) is italicized.
    */
  var italic: Boolean = js.native
  
  /**
    * Gets or sets a value specifying character script formatting.
    */
  var script: CharacterFormattingScript = js.native
  
  /**
    * Gets or sets the character(s) font size (in points).
    */
  var size: Double = js.native
  
  /**
    * Gets or sets a value specifying whether the strikeout formatting is applied to a character(s).
    */
  var strikeout: Boolean = js.native
  
  /**
    * Gets or sets the type of underline applied to the character(s).
    */
  var underline: Boolean = js.native
  
  /**
    * Gets or sets the color of the underline for the specified characters.
    */
  var underlineColor: String = js.native
  
  /**
    * Gets or sets whether only word characters are underlined.
    */
  var underlineWordsOnly: Boolean = js.native
}
object FontFormattingSettings {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FontFormattingSettingsOps[Self <: FontFormattingSettings] (val x: Self) extends AnyVal {
    
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
    def setAllCaps(value: Boolean): Self = this.set("allCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: String): Self = this.set("foreColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: CharacterFormattingScript): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeout(value: Boolean): Self = this.set("strikeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineColor(value: String): Self = this.set("underlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineWordsOnly(value: Boolean): Self = this.set("underlineWordsOnly", value.asInstanceOf[js.Any])
  }
}
