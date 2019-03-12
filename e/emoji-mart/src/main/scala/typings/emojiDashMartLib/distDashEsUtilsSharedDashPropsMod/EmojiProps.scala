package typings
package emojiDashMartLib.distDashEsUtilsSharedDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojiProps extends js.Object {
  /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var emoji: java.lang.String | emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData
  var fallback: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* props */ this.type, 
      reactLib.reactMod.Component[js.Object, js.Object, _]
    ]
  ] = js.undefined
  var forceSize: js.UndefOr[scala.Boolean] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onOver: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /** defaults to 'apple' */
  var set: js.UndefOr[EmojiSet] = js.undefined
  /** defaults to 52 */
  var sheetColumns: js.UndefOr[scala.Double] = js.undefined
  /** defaults to 52 */
  var sheetRows: js.UndefOr[scala.Double] = js.undefined
  /** defaults to 64 */
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var size: scala.Double
  /** defaults to 1 */
  var skin: js.UndefOr[
    emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
  ] = js.undefined
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
}

object EmojiProps {
  @scala.inline
  def apply(
    emoji: java.lang.String | emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData,
    size: scala.Double,
    backgroundImageFn: BackgroundImageFn = null,
    fallback: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, EmojiProps) => reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    forceSize: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    native: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onLeave: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    onOver: (/* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, /* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent]) => scala.Unit = null,
    set: EmojiSet = null,
    sheetColumns: scala.Int | scala.Double = null,
    sheetRows: scala.Int | scala.Double = null,
    sheetSize: EmojiSheetSize = null,
    skin: emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined
  ): EmojiProps = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size)
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
    __obj.asInstanceOf[EmojiProps]
  }
}

