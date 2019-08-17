package typings.emojiDashMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distDashEsUtilsSharedDashPropsMod {
  import typings.emojiDashMart.Anon_Categories
  import typings.emojiDashMart.emojiDashMartStrings.notfound
  import typings.emojiDashMart.emojiDashMartStrings.search
  import typings.std.Partial
  import typings.std.Pick

  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, String]
  type PartialI18n = Partial[(Pick[I18n, search | notfound]) with Anon_Categories]
}
