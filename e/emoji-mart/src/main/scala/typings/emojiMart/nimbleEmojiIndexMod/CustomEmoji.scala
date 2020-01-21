package typings.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEmoji extends EmojiData {
  // colons is overridden by :id:
  var colons: js.UndefOr[String] = js.undefined
  var emoticons: js.UndefOr[js.Array[String]] = js.undefined
  // id is overridden by short_names[0]
  var id: js.UndefOr[String] = js.undefined
  var imageUrl: String
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  /** Must contain at least one name. The first name is used as the unique id. */
  var short_names: js.Array[String]
}

object CustomEmoji {
  @scala.inline
  def apply(
    imageUrl: String,
    name: String,
    short_names: js.Array[String],
    colons: String = null,
    emoticons: js.Array[String] = null,
    id: String = null,
    keywords: js.Array[String] = null
  ): CustomEmoji = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    if (colons != null) __obj.updateDynamic("colons")(colons.asInstanceOf[js.Any])
    if (emoticons != null) __obj.updateDynamic("emoticons")(emoticons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEmoji]
  }
}

