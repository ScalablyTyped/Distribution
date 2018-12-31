package typings
package emojiDashMartLib.distDashEsUtilsSharedDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** NOTE: custom emoji are copied into a singleton object on every new mount */
  var custom: js.UndefOr[
    js.Array[
      emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.CustomEmoji
    ]
  ] = js.undefined
  var defaultSkin: js.UndefOr[
    emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
  ] = js.undefined
  var emoji: js.UndefOr[java.lang.String] = js.undefined
  var emojiSize: js.UndefOr[scala.Double] = js.undefined
  var emojiTooltip: js.UndefOr[scala.Boolean] = js.undefined
  var emojisToShowFilter: js.UndefOr[
    js.Function1[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      scala.Boolean
    ]
  ] = js.undefined
  var exclude: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var i18n: js.UndefOr[PartialI18n] = js.undefined
  var icons: js.UndefOr[CustomIcons] = js.undefined
  var include: js.UndefOr[js.Array[CategoryName]] = js.undefined
  var native: js.UndefOr[scala.Boolean] = js.undefined
  var notFound: js.UndefOr[js.Function0[reactLib.reactMod.Component[js.Object, js.Object, _]]] = js.undefined
  var notFoundEmoji: js.UndefOr[java.lang.String] = js.undefined
  /** NOTE: default is not preventable */
  var onClick: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      scala.Unit
    ]
  ] = js.undefined
  var onSkinChange: js.UndefOr[
    js.Function1[
      /* skin */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin, 
      scala.Unit
    ]
  ] = js.undefined
  var perLine: js.UndefOr[scala.Double] = js.undefined
  var recent: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var set: js.UndefOr[EmojiSet] = js.undefined
  var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
  var showPreview: js.UndefOr[scala.Boolean] = js.undefined
  var showSkinTones: js.UndefOr[scala.Boolean] = js.undefined
  var skin: js.UndefOr[
    emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiSkin
  ] = js.undefined
  var skinEmoji: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

