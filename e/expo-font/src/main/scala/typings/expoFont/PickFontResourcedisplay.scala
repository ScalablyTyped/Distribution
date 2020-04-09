package typings.expoFont

import typings.expoFont.fontTypesMod.FontDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
trait PickFontResourcedisplay extends js.Object {
  var display: js.UndefOr[FontDisplay] = js.undefined
}

object PickFontResourcedisplay {
  @scala.inline
  def apply(display: FontDisplay = null): PickFontResourcedisplay = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFontResourcedisplay]
  }
}

