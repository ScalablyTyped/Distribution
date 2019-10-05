package typings.emojiDashMart.distDashEsUtilsSharedDashPropsMod

import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.CustomEmoji
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
import typings.emojiDashMart.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  /** NOTE: custom emoji are copied into a singleton object on every new mount */
  var custom: js.UndefOr[js.Array[CustomEmoji]] = js.undefined
  var defaultSkin: js.UndefOr[EmojiSkin] = js.undefined
  var emoji: js.UndefOr[String] = js.undefined
  var emojiSize: js.UndefOr[Double] = js.undefined
  var emojiTooltip: js.UndefOr[Boolean] = js.undefined
  var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.undefined
  var exclude: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var i18n: js.UndefOr[PartialI18n] = js.undefined
  var icons: js.UndefOr[CustomIcons] = js.undefined
  var include: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var notFound: js.UndefOr[js.Function0[Component[js.Object, js.Object, _]]] = js.undefined
  var notFoundEmoji: js.UndefOr[String] = js.undefined
  /** NOTE: default is not preventable */
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.undefined
  var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.undefined
  var perLine: js.UndefOr[Double] = js.undefined
  var recent: js.UndefOr[js.Array[String]] = js.undefined
  var set: js.UndefOr[EmojiSet] = js.undefined
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var showPreview: js.UndefOr[Boolean] = js.undefined
  var showSkinTones: js.UndefOr[Boolean] = js.undefined
  var skin: js.UndefOr[EmojiSkin] = js.undefined
  var skinEmoji: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
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
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
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
    __obj.asInstanceOf[PickerProps]
  }
}

