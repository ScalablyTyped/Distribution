package typings.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji
  - typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji
*/
trait EmojiData extends js.Object

object EmojiData {
  @scala.inline
  def BaseEmoji(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String,
    skin: EmojiSkin = null
  ): EmojiData = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiData]
  }
  @scala.inline
  def CustomEmoji(
    imageUrl: String,
    name: String,
    short_names: js.Array[String],
    colons: String = null,
    emoticons: js.Array[String] = null,
    id: String = null,
    keywords: js.Array[String] = null
  ): EmojiData = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    if (colons != null) __obj.updateDynamic("colons")(colons.asInstanceOf[js.Any])
    if (emoticons != null) __obj.updateDynamic("emoticons")(emoticons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiData]
  }
}

