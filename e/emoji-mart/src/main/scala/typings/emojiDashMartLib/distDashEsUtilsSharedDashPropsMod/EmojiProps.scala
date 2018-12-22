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
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onLeave: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onOver: js.UndefOr[
    js.Function2[
      /* emoji */ emojiDashMartLib.distDashEsUtilsEmojiDashIndexNimbleDashEmojiDashIndexMod.EmojiData, 
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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

