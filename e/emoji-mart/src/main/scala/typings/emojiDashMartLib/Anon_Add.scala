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
    add_id: js.Function1[
      stdLib.Pick[
        emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
        emojiDashMartLib.emojiDashMartLibStrings.id
      ], 
      scala.Unit
    ],
    get: js.Function1[scala.Double, js.Array[java.lang.String]]
  ): Anon_Add = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add_id)
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[Anon_Add]
  }
}

