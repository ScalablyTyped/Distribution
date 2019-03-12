package typings
package emojiDashMartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  @JSName("add")
  def add_id(
    emoji: stdLib.Pick[
      emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      emojiDashMartLib.emojiDashMartLibStrings.id
    ]
  ): scala.Unit
  def get(perLine: scala.Double): js.Array[java.lang.String]
}

object Anon_Add {
  @scala.inline
  def apply(
    add_id: stdLib.Pick[
      emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      emojiDashMartLib.emojiDashMartLibStrings.id
    ] => scala.Unit,
    get: scala.Double => js.Array[java.lang.String]
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.updateDynamic("add")(js.Any.fromFunction1(add_id))
    __obj.asInstanceOf[Anon_Add]
  }
}

