package typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEmoji extends EmojiData {
  var colons: String
  /** Reverse mapping to keyof emoticons */
  var emoticons: js.Array[String]
  var id: String
  var name: String
  var native: String
  var skin: EmojiSkin | Null
  var unified: String
}

object BaseEmoji {
  @scala.inline
  def apply(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String,
    skin: EmojiSkin = null
  ): BaseEmoji = {
    val __obj = js.Dynamic.literal(colons = colons, emoticons = emoticons, id = id, name = name, native = native, unified = unified)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    __obj.asInstanceOf[BaseEmoji]
  }
}

