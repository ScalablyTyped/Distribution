package typings
package emojiDashMartLib.distDashEsComponentsEmojiNimbleDashEmojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NimbleEmojiProps
  extends emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiProps {
  var data: emojiDashMartLib.distDashEsUtilsDataMod.Data
}

object NimbleEmojiProps {
  @scala.inline
  def apply(
    data: emojiDashMartLib.distDashEsUtilsDataMod.Data,
    emoji: java.lang.String | emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData,
    size: scala.Double,
    backgroundImageFn: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.BackgroundImageFn = null,
    fallback: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, NimbleEmojiProps) => reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    forceSize: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onLeave: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onOver: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    set: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiSet = null,
    sheetColumns: scala.Int | scala.Double = null,
    sheetRows: scala.Int | scala.Double = null,
    sheetSize: emojiDashMartLib.distDashEsUtilsSharedDashPropsMod.EmojiSheetSize = null,
    skin: emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined
  ): NimbleEmojiProps = {
    val __obj = js.Dynamic.literal(data = data, emoji = emoji.asInstanceOf[js.Any], size = size)
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(backgroundImageFn)
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2(fallback))
    if (!js.isUndefined(forceSize)) __obj.updateDynamic("forceSize")(forceSize)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction2(onLeave))
    if (onOver != null) __obj.updateDynamic("onOver")(js.Any.fromFunction2(onOver))
    if (set != null) __obj.updateDynamic("set")(set)
    if (sheetColumns != null) __obj.updateDynamic("sheetColumns")(sheetColumns.asInstanceOf[js.Any])
    if (sheetRows != null) __obj.updateDynamic("sheetRows")(sheetRows.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[NimbleEmojiProps]
  }
}

