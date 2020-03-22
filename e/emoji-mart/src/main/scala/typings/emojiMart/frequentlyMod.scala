package typings.emojiMart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/utils/frequently", JSImport.Namespace)
@js.native
object frequentlyMod extends js.Object {
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  object default extends js.Object {
    def add(emoji: PickEmojiDataid): Unit = js.native
    def get(perLine: Double): js.Array[String] = js.native
  }
  
}

