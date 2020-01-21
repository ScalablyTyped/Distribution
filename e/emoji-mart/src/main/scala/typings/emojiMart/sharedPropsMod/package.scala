package typings.emojiMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedPropsMod {
  type BackgroundImageFn = js.Function2[
    /* set */ typings.emojiMart.sharedPropsMod.EmojiSet, 
    /* sheetSize */ typings.emojiMart.sharedPropsMod.EmojiSheetSize, 
    java.lang.String
  ]
  type PartialI18n = typings.std.Partial[
    (typings.std.Pick[
      typings.emojiMart.sharedPropsMod.I18n, 
      typings.emojiMart.emojiMartStrings.search | typings.emojiMart.emojiMartStrings.notfound
    ]) with typings.emojiMart.AnonCategories
  ]
}
