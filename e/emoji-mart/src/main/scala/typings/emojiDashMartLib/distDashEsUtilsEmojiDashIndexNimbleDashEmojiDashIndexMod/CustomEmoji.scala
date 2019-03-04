package typings
package emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEmoji extends EmojiData {
  // colons is overridden by :id:
  var colons: js.UndefOr[java.lang.String] = js.undefined
  var emoticons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // id is overridden by short_names[0]
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: java.lang.String
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  /** Must contain at least one name. The first name is used as the unique id. */
  var short_names: js.Array[java.lang.String]
}

object CustomEmoji {
  @scala.inline
  def apply(
    imageUrl: java.lang.String,
    name: java.lang.String,
    short_names: js.Array[java.lang.String],
    colons: java.lang.String = null,
    emoticons: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    keywords: js.Array[java.lang.String] = null
  ): CustomEmoji = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl, name = name, short_names = short_names)
    if (colons != null) __obj.updateDynamic("colons")(colons)
    if (emoticons != null) __obj.updateDynamic("emoticons")(emoticons)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    __obj.asInstanceOf[CustomEmoji]
  }
}

