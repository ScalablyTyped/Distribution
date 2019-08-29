package typings.emojiDashMart

import org.scalablytyped.runtime.StringDictionary
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiEntry
import typings.emojiDashMart.emojiDashMartStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", JSImport.Namespace)
@js.native
object distDashEsUtilsEmojiDashIndexEmojiDashIndexMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    var emojis: StringDictionary[EmojiEntry] = js.native
    /** Mapping of string to keyof emojis */
    var emoticons: StringDictionary[String] = js.native
    def search(query: String): js.Array[EmojiData] | Null = js.native
    def search(query: Empty): Null = js.native
  }
  
}

