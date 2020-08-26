package typings.emojiMart.sharedPropsMod

import typings.emojiMart.emojiMartStrings.auto
import typings.emojiMart.emojiMartStrings.dark
import typings.emojiMart.emojiMartStrings.light
import typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
  var color: js.UndefOr[String] = js.native
  /** NOTE: custom emoji are copied into a singleton object on every new mount */
  var custom: js.UndefOr[js.Array[CustomEmoji]] = js.native
  var defaultSkin: js.UndefOr[EmojiSkin] = js.native
  var emoji: js.UndefOr[String] = js.native
  var emojiSize: js.UndefOr[Double] = js.native
  var emojiTooltip: js.UndefOr[Boolean] = js.native
  var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.native
  var enableFrequentEmojiSort: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[js.Array[CategoryName]] = js.native
  var i18n: js.UndefOr[PartialI18n] = js.native
  var icons: js.UndefOr[CustomIcons] = js.native
  var include: js.UndefOr[js.Array[CategoryName]] = js.native
  var native: js.UndefOr[Boolean] = js.native
  var notFound: js.UndefOr[js.Function0[Component[js.Object, js.Object, _]]] = js.native
  var notFoundEmoji: js.UndefOr[String] = js.native
  /** NOTE: default is not preventable */
  var onClick: js.UndefOr[
    js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.native
  var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.native
  var perLine: js.UndefOr[Double] = js.native
  var recent: js.UndefOr[js.Array[String]] = js.native
  var set: js.UndefOr[EmojiSet] = js.native
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
  var showPreview: js.UndefOr[Boolean] = js.native
  var showSkinTones: js.UndefOr[Boolean] = js.native
  var skin: js.UndefOr[EmojiSkin] = js.native
  var skinEmoji: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var theme: js.UndefOr[auto | light | dark] = js.native
  var title: js.UndefOr[String] = js.native
  var useButton: js.UndefOr[Boolean] = js.native
}

object PickerProps {
  @scala.inline
  def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  @scala.inline
  implicit class PickerPropsOps[Self <: PickerProps] (val x: Self) extends AnyVal {
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = this.set("backgroundImageFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBackgroundImageFn: Self = this.set("backgroundImageFn", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCustomVarargs(value: CustomEmoji*): Self = this.set("custom", js.Array(value :_*))
    @scala.inline
    def setCustom(value: js.Array[CustomEmoji]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDefaultSkin(value: EmojiSkin): Self = this.set("defaultSkin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSkin: Self = this.set("defaultSkin", js.undefined)
    @scala.inline
    def setEmoji(value: String): Self = this.set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmoji: Self = this.set("emoji", js.undefined)
    @scala.inline
    def setEmojiSize(value: Double): Self = this.set("emojiSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmojiSize: Self = this.set("emojiSize", js.undefined)
    @scala.inline
    def setEmojiTooltip(value: Boolean): Self = this.set("emojiTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmojiTooltip: Self = this.set("emojiTooltip", js.undefined)
    @scala.inline
    def setEmojisToShowFilter(value: /* emoji */ EmojiData => Boolean): Self = this.set("emojisToShowFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEmojisToShowFilter: Self = this.set("emojisToShowFilter", js.undefined)
    @scala.inline
    def setEnableFrequentEmojiSort(value: Boolean): Self = this.set("enableFrequentEmojiSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableFrequentEmojiSort: Self = this.set("enableFrequentEmojiSort", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: CategoryName*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[CategoryName]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setI18n(value: PartialI18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    @scala.inline
    def setIcons(value: CustomIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: CategoryName*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[CategoryName]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setNotFound(value: () => Component[js.Object, js.Object, _]): Self = this.set("notFound", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
    @scala.inline
    def setNotFoundEmoji(value: String): Self = this.set("notFoundEmoji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotFoundEmoji: Self = this.set("notFoundEmoji", js.undefined)
    @scala.inline
    def setOnClick(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnSelect(value: /* emoji */ EmojiData => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSkinChange(value: /* skin */ EmojiSkin => Unit): Self = this.set("onSkinChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSkinChange: Self = this.set("onSkinChange", js.undefined)
    @scala.inline
    def setPerLine(value: Double): Self = this.set("perLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerLine: Self = this.set("perLine", js.undefined)
    @scala.inline
    def setRecentVarargs(value: String*): Self = this.set("recent", js.Array(value :_*))
    @scala.inline
    def setRecent(value: js.Array[String]): Self = this.set("recent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecent: Self = this.set("recent", js.undefined)
    @scala.inline
    def setSet(value: EmojiSet): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSheetSize(value: EmojiSheetSize): Self = this.set("sheetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetSize: Self = this.set("sheetSize", js.undefined)
    @scala.inline
    def setShowPreview(value: Boolean): Self = this.set("showPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPreview: Self = this.set("showPreview", js.undefined)
    @scala.inline
    def setShowSkinTones(value: Boolean): Self = this.set("showSkinTones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSkinTones: Self = this.set("showSkinTones", js.undefined)
    @scala.inline
    def setSkin(value: EmojiSkin): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setSkinEmoji(value: String): Self = this.set("skinEmoji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkinEmoji: Self = this.set("skinEmoji", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTheme(value: auto | light | dark): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUseButton(value: Boolean): Self = this.set("useButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseButton: Self = this.set("useButton", js.undefined)
  }
  
}

