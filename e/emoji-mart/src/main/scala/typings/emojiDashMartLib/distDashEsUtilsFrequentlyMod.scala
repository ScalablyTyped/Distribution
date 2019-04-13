package typings
package emojiDashMartLib

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
    def add_id(
      emoji: stdLib.Pick[
          emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
          emojiDashMartLib.emojiDashMartLibStrings.id
        ]
    ): scala.Unit = js.native
    def get(perLine: scala.Double): js.Array[java.lang.String] = js.native
  }
  
}

