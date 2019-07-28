package typings.emojiDashMart.distDashEsComponentsPickerNimbleDashPickerMod

import typings.emojiDashMart.distDashEsUtilsDataMod.Data
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.CustomEmoji
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.BackgroundImageFn
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.CategoryName
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.CustomIcons
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSet
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.EmojiSheetSize
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.PartialI18n
import typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod.PickerProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NimblePickerProps extends PickerProps {
  var data: Data
}

object NimblePickerProps {
  @scala.inline
  def apply(
    data: Data,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backgroundImageFn: BackgroundImageFn = null,
    color: String = null,
    custom: js.Array[CustomEmoji] = null,
    defaultSkin: EmojiSkin = null,
    emoji: String = null,
    emojiSize: Int | Double = null,
    emojiTooltip: js.UndefOr[Boolean] = js.undefined,
    emojisToShowFilter: /* emoji */ EmojiData => Boolean = null,
    exclude: js.Array[CategoryName] = null,
    i18n: PartialI18n = null,
    icons: CustomIcons = null,
    include: js.Array[CategoryName] = null,
    native: js.UndefOr[Boolean] = js.undefined,
    notFound: () => Component[js.Object, js.Object, _] = null,
    notFoundEmoji: String = null,
    onClick: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onSelect: /* emoji */ EmojiData => Unit = null,
    onSkinChange: /* skin */ EmojiSkin => Unit = null,
    perLine: Int | Double = null,
    recent: js.Array[String] = null,
    set: EmojiSet = null,
    sheetSize: EmojiSheetSize = null,
    showPreview: js.UndefOr[Boolean] = js.undefined,
    showSkinTones: js.UndefOr[Boolean] = js.undefined,
    skin: EmojiSkin = null,
    skinEmoji: String = null,
    style: CSSProperties = null,
    title: String = null
  ): NimblePickerProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(backgroundImageFn)
    if (color != null) __obj.updateDynamic("color")(color)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (defaultSkin != null) __obj.updateDynamic("defaultSkin")(defaultSkin)
    if (emoji != null) __obj.updateDynamic("emoji")(emoji)
    if (emojiSize != null) __obj.updateDynamic("emojiSize")(emojiSize.asInstanceOf[js.Any])
    if (!js.isUndefined(emojiTooltip)) __obj.updateDynamic("emojiTooltip")(emojiTooltip)
    if (emojisToShowFilter != null) __obj.updateDynamic("emojisToShowFilter")(js.Any.fromFunction1(emojisToShowFilter))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (notFound != null) __obj.updateDynamic("notFound")(js.Any.fromFunction0(notFound))
    if (notFoundEmoji != null) __obj.updateDynamic("notFoundEmoji")(notFoundEmoji)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSkinChange != null) __obj.updateDynamic("onSkinChange")(js.Any.fromFunction1(onSkinChange))
    if (perLine != null) __obj.updateDynamic("perLine")(perLine.asInstanceOf[js.Any])
    if (recent != null) __obj.updateDynamic("recent")(recent)
    if (set != null) __obj.updateDynamic("set")(set)
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize)
    if (!js.isUndefined(showPreview)) __obj.updateDynamic("showPreview")(showPreview)
    if (!js.isUndefined(showSkinTones)) __obj.updateDynamic("showSkinTones")(showSkinTones)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (skinEmoji != null) __obj.updateDynamic("skinEmoji")(skinEmoji)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NimblePickerProps]
  }
}

