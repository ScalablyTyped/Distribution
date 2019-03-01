package typings
package emojiDashMartLib.distDashEsComponentsCategoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var emojiProps: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiProps
  var emojis: js.UndefOr[
    js.Array[
      java.lang.String | emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
    ]
  ] = js.undefined
  var hasStickyPosition: js.UndefOr[scala.Boolean] = js.undefined
  var i18n: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.I18n
  var id: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName
  var name: java.lang.String
  var native: scala.Boolean
  var perLine: scala.Double
  var recent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    emojiProps: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiProps,
    i18n: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.I18n,
    id: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName,
    name: java.lang.String,
    native: scala.Boolean,
    perLine: scala.Double,
    emojis: js.Array[
      java.lang.String | emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
    ] = null,
    hasStickyPosition: js.UndefOr[scala.Boolean] = js.undefined,
    recent: js.Array[java.lang.String] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emojiProps")(emojiProps)
    __obj.updateDynamic("i18n")(i18n)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("native")(native)
    __obj.updateDynamic("perLine")(perLine)
    if (emojis != null) __obj.updateDynamic("emojis")(emojis)
    if (!js.isUndefined(hasStickyPosition)) __obj.updateDynamic("hasStickyPosition")(hasStickyPosition)
    if (recent != null) __obj.updateDynamic("recent")(recent)
    __obj.asInstanceOf[Props]
  }
}

