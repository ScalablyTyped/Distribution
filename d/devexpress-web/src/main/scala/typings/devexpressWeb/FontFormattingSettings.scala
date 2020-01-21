package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define the font formatting.
  */
@JSGlobal("FontFormattingSettings")
@js.native
class FontFormattingSettings () extends js.Object {
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

