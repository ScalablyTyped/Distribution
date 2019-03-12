package typings
package emojiDashMartLib.distDashEsComponentsPickerNimbleDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NimblePickerProps
  extends emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.PickerProps {
  var data: emojiDashMartLib.distDashEsUtilsDataMod.Data
}

object NimblePickerProps {
  @scala.inline
  def apply(
    data: emojiDashMartLib.distDashEsUtilsDataMod.Data,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundImageFn: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.BackgroundImageFn = null,
    color: java.lang.String = null,
    custom: js.Array[
      emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.CustomEmoji
    ] = null,
    defaultSkin: emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin = null,
    emoji: java.lang.String = null,
    emojiSize: scala.Int | scala.Double = null,
    emojiTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    emojisToShowFilter: /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData => scala.Boolean = null,
    exclude: js.Array[emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName] = null,
    i18n: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.PartialI18n = null,
    icons: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CustomIcons = null,
    include: js.Array[emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.CategoryName] = null,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    notFound: () => reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    notFoundEmoji: java.lang.String = null,
    onClick: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onSelect: /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData => scala.Unit = null,
    onSkinChange: /* skin */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin => scala.Unit = null,
    perLine: scala.Int | scala.Double = null,
    recent: js.Array[java.lang.String] = null,
    set: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiSet = null,
    sheetSize: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiSheetSize = null,
    showPreview: js.UndefOr[scala.Boolean] = js.undefined,
    showSkinTones: js.UndefOr[scala.Boolean] = js.undefined,
    skin: emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin = null,
    skinEmoji: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: java.lang.String = null
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

