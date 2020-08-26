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

@js.native
trait EmojiProps extends js.Object {
  /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
  var emoji: String | EmojiData = js.native
  var fallback: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* props */ this.type, Component[js.Object, js.Object, _]]
  ] = js.native
  var forceSize: js.UndefOr[Boolean] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var native: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  var onLeave: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  var onOver: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  /** defaults to 'apple' */
  var set: js.UndefOr[EmojiSet] = js.native
  /** defaults to 52 */
  var sheetColumns: js.UndefOr[Double] = js.native
  /** defaults to 52 */
  var sheetRows: js.UndefOr[Double] = js.native
  /** defaults to 64 */
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
  var size: Double = js.native
  /** defaults to 1 */
  var skin: js.UndefOr[EmojiSkin] = js.native
  var tooltip: js.UndefOr[Boolean] = js.native
}

object EmojiProps {
  @scala.inline
  def apply(emoji: String | EmojiData, size: Double): EmojiProps = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiProps]
  }
  @scala.inline
  implicit class EmojiPropsOps[Self <: EmojiProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmoji(value: String | EmojiData): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = this.set("backgroundImageFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBackgroundImageFn: Self = this.set("backgroundImageFn", js.undefined)
    @scala.inline
    def setFallback(value: (/* emoji */ EmojiData, EmojiProps) => Component[js.Object, js.Object, _]): Self = this.set("fallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setForceSize(value: Boolean): Self = this.set("forceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSize: Self = this.set("forceSize", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setOnClick(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnLeave(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    @scala.inline
    def setOnOver(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOver: Self = this.set("onOver", js.undefined)
    @scala.inline
    def setSet(value: EmojiSet): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSheetColumns(value: Double): Self = this.set("sheetColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetColumns: Self = this.set("sheetColumns", js.undefined)
    @scala.inline
    def setSheetRows(value: Double): Self = this.set("sheetRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetRows: Self = this.set("sheetRows", js.undefined)
    @scala.inline
    def setSheetSize(value: EmojiSheetSize): Self = this.set("sheetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetSize: Self = this.set("sheetSize", js.undefined)
    @scala.inline
    def setSkin(value: EmojiSkin): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

