package typings
package emojiDashMartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/emoji-index/emoji-index", JSImport.Namespace)
@js.native
object distDashEsUtilsEmojiDashIndexEmojiDashIndexMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    var emojis: org.scalablytyped.runtime.StringDictionary[
        emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
      ] = js.native
    /** Mapping of string to keyof emojis */
    var emoticons: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    def search(query: java.lang.String): emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData | scala.Null = js.native
    @JSName("search")
    def search_(query: emojiDashMartLib.emojiDashMartLibStrings.Empty): scala.Null = js.native
  }
  
}

