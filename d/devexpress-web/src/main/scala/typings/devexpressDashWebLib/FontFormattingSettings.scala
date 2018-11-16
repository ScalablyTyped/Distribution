package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings to define the font formatting.
 */

trait FontFormattingSettings extends js.Object {
  /**
       * Gets or sets a value indicating whether all characters are capital letters.
       * Value: true, if all characters are capitalized; otherwise, false.
       */
  var allCaps: scala.Boolean
  /**
       * Gets or sets the character background color.
       * Value: A string value specifying the background color.
       */
  var backColor: java.lang.String
  /**
       * Gets or sets whether the character formatting is bold.
       * Value: true, if characters are bold; otherwise, false.
       */
  var bold: scala.Boolean
  /**
       * Gets or sets the character(s) font name.
       * Value: A string value specifying the font name.
       */
  var fontName: java.lang.String
  /**
       * Gets or sets the foreground color of characters.
       * Value: A string value specifying the foreground color.
       */
  var foreColor: java.lang.String
  /**
       * Gets or sets a value indicating whether a character(s) is hidden.
       * Value: true, if characters are hidden; otherwise, false.
       */
  var hidden: scala.Boolean
  /**
       * Gets or sets a value indicating whether a character(s) is italicized.
       * Value: true, if characters are italicized; otherwise, false.
       */
  var italic: scala.Boolean
  /**
       * Gets or sets a value specifying character script formatting.
       * Value: One of the <see cref="CharacterFormattingScript" /> values.
       */
  var script: js.Any
  /**
       * Gets or sets the character(s) font size (in points).
       * Value: An integer value specifying the font size.
       */
  var size: scala.Double
  /**
       * Gets or sets a value specifying whether the strikeout formatting is applied to a character(s).
       * Value: true, if the strikeout formatting is applied; otherwise, false.
       */
  var strikeout: scala.Boolean
  /**
       * Gets or sets the type of underline applied to the character(s).
       * Value: true, if characters are underlined; otherwise, false.
       */
  var underline: scala.Boolean
  /**
       * Gets or sets the color of the underline for the specified characters.
       * Value: A string value specifying the underline color.
       */
  var underlineColor: java.lang.String
  /**
       * Gets or sets whether only word characters are underlined.
       * Value: true to underline only characters in words; false to underline all characters.
       */
  var underlineWordsOnly: scala.Boolean
}

