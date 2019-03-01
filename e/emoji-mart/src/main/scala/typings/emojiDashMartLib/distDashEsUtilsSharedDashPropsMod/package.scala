package typings
package emojiDashMartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDashEsUtilsSharedDashPropsMod {
  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, java.lang.String]
  type PartialI18n = stdLib.Partial[
    (stdLib.Pick[
      I18n, 
      emojiDashMartLib.emojiDashMartLibStrings.search | emojiDashMartLib.emojiDashMartLibStrings.notfound
    ]) with emojiDashMartLib.Anon_Categories
  ]
}
