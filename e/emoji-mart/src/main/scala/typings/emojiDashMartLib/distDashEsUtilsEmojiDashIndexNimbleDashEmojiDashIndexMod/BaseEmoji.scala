package typings
package emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEmoji extends EmojiData {
  var colons: java.lang.String
  /** Reverse mapping to keyof emoticons */
  var emoticons: js.Array[java.lang.String]
  var id: java.lang.String
  var name: java.lang.String
  var native: java.lang.String
  var skin: EmojiSkin | scala.Null
  var unified: java.lang.String
}

object BaseEmoji {
  @scala.inline
  def apply(
    colons: java.lang.String,
    emoticons: js.Array[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    native: java.lang.String,
    unified: java.lang.String,
    skin: EmojiSkin = null
  ): BaseEmoji = {
    val __obj = js.Dynamic.literal(colons = colons, emoticons = emoticons, id = id, name = name, native = native, unified = unified)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    __obj.asInstanceOf[BaseEmoji]
  }
}

