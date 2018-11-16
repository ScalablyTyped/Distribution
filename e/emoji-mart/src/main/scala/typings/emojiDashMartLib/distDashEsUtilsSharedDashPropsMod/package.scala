package typings
package emojiDashMartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDashEsUtilsSharedDashPropsMod {
  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, java.lang.String]
  type CategoryName = emojiDashMartLib.emojiDashMartLibStrings.search | emojiDashMartLib.emojiDashMartLibStrings.recent | emojiDashMartLib.emojiDashMartLibStrings.people | emojiDashMartLib.emojiDashMartLibStrings.nature | emojiDashMartLib.emojiDashMartLibStrings.foods | emojiDashMartLib.emojiDashMartLibStrings.activity | emojiDashMartLib.emojiDashMartLibStrings.places | emojiDashMartLib.emojiDashMartLibStrings.objects | emojiDashMartLib.emojiDashMartLibStrings.symbols | emojiDashMartLib.emojiDashMartLibStrings.flags | emojiDashMartLib.emojiDashMartLibStrings.custom
  type EmojiSet = emojiDashMartLib.emojiDashMartLibStrings.apple | emojiDashMartLib.emojiDashMartLibStrings.google | emojiDashMartLib.emojiDashMartLibStrings.twitter | emojiDashMartLib.emojiDashMartLibStrings.emojione | emojiDashMartLib.emojiDashMartLibStrings.messenger | emojiDashMartLib.emojiDashMartLibStrings.facebook
  type EmojiSheetSize = emojiDashMartLib.emojiDashMartLibNumbers.`16` | emojiDashMartLib.emojiDashMartLibNumbers.`20` | emojiDashMartLib.emojiDashMartLibNumbers.`32` | emojiDashMartLib.emojiDashMartLibNumbers.`64`
  type PartialI18n = stdLib.Partial[
    (stdLib.Pick[
      I18n, 
      emojiDashMartLib.emojiDashMartLibStrings.search | emojiDashMartLib.emojiDashMartLibStrings.notfound
    ]) with emojiDashMartLib.Anon_Categories
  ]
}
