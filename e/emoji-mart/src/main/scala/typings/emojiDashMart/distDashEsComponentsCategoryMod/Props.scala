package typings.emojiDashMart.distDashEsComponentsCategoryMod

import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.CategoryName
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiProps
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var emojiProps: EmojiProps
  var emojis: js.UndefOr[js.Array[String | EmojiData]] = js.undefined
  var hasStickyPosition: js.UndefOr[Boolean] = js.undefined
  var i18n: I18n
  var id: CategoryName
  var name: String
  var native: Boolean
  var perLine: Double
  var recent: js.UndefOr[js.Array[String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double,
    emojis: js.Array[String | EmojiData] = null,
    hasStickyPosition: js.UndefOr[Boolean] = js.undefined,
    recent: js.Array[String] = null
  ): Props = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps, i18n = i18n, id = id, name = name, native = native, perLine = perLine)
    if (emojis != null) __obj.updateDynamic("emojis")(emojis)
    if (!js.isUndefined(hasStickyPosition)) __obj.updateDynamic("hasStickyPosition")(hasStickyPosition)
    if (recent != null) __obj.updateDynamic("recent")(recent)
    __obj.asInstanceOf[Props]
  }
}

