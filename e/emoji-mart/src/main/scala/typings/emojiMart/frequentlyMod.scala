package typings.emojiMart

import typings.emojiMart.emojiMartStrings.id
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/frequently", JSImport.Namespace)
@js.native
object frequentlyMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    @JSName("add")
    def add_id(emoji: Pick[EmojiData, id]): Unit = js.native
    def get(perLine: Double): js.Array[String] = js.native
  }
  
}

