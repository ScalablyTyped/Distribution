package typings.emojiMart.sharedPropsMod

import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojiProps extends js.Object {
  /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var emoji: String | EmojiData
  var fallback: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* props */ this.type, Component[js.Object, js.Object, _]]
  ] = js.undefined
  var forceSize: js.UndefOr[Boolean] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var native: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  var onOver: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.undefined
  /** defaults to 'apple' */
  var set: js.UndefOr[EmojiSet] = js.undefined
  /** defaults to 52 */
  var sheetColumns: js.UndefOr[Double] = js.undefined
  /** defaults to 52 */
  var sheetRows: js.UndefOr[Double] = js.undefined
  /** defaults to 64 */
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var size: Double
  /** defaults to 1 */
  var skin: js.UndefOr[EmojiSkin] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
}

object EmojiProps {
  @scala.inline
  def apply(
    emoji: String | EmojiData,
    size: Double,
    backgroundImageFn: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String = null,
    fallback: (/* emoji */ EmojiData, EmojiProps) => Component[js.Object, js.Object, _] = null,
    forceSize: js.UndefOr[Boolean] = js.undefined,
    html: js.UndefOr[Boolean] = js.undefined,
    native: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onLeave: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    onOver: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit = null,
    set: EmojiSet = null,
    sheetColumns: js.UndefOr[Double] = js.undefined,
    sheetRows: js.UndefOr[Double] = js.undefined,
    sheetSize: EmojiSheetSize = null,
    skin: EmojiSkin = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): EmojiProps = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (backgroundImageFn != null) __obj.updateDynamic("backgroundImageFn")(js.Any.fromFunction2(backgroundImageFn))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction2(fallback))
    if (!js.isUndefined(forceSize)) __obj.updateDynamic("forceSize")(forceSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction2(onLeave))
    if (onOver != null) __obj.updateDynamic("onOver")(js.Any.fromFunction2(onOver))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetColumns)) __obj.updateDynamic("sheetColumns")(sheetColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetRows)) __obj.updateDynamic("sheetRows")(sheetRows.get.asInstanceOf[js.Any])
    if (sheetSize != null) __obj.updateDynamic("sheetSize")(sheetSize.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiProps]
  }
}

