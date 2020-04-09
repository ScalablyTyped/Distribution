package typings.expoFont.fontTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
trait UnloadFontOptions extends js.Object {
  var display: js.UndefOr[FontDisplay] = js.undefined
}

object UnloadFontOptions {
  @scala.inline
  def apply(display: FontDisplay = null): UnloadFontOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnloadFontOptions]
  }
}

