package typings.emojiDashMart

import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typings.emojiDashMart.emojiDashMartStrings.id
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/frequently", JSImport.Namespace)
@js.native
object distDashEsUtilsFrequentlyMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    @JSName("add")
    def add_id(emoji: Pick[EmojiData, id]): Unit = js.native
    def get(perLine: Double): js.Array[String] = js.native
  }
  
}

