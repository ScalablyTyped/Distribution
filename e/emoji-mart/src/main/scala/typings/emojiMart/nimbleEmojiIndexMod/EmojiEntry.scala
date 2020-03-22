package typings.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.emojiMart.nimbleEmojiIndexMod.EmojiData
  - typings.emojiMart.variantinEmojiSkinEmojiDa
*/
trait EmojiEntry extends js.Object

object EmojiEntry {
  @scala.inline
  def variantinEmojiSkinEmojiDa(`1`: EmojiData, `2`: EmojiData, `3`: EmojiData, `4`: EmojiData, `5`: EmojiData, `6`: EmojiData): EmojiEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
  }
  @scala.inline
  def BaseEmoji(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String,
    skin: EmojiSkin = null
  ): EmojiEntry = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
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
  ): EmojiEntry = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    if (colons != null) __obj.updateDynamic("colons")(colons.asInstanceOf[js.Any])
    if (emoticons != null) __obj.updateDynamic("emoticons")(emoticons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntry]
  }
}

