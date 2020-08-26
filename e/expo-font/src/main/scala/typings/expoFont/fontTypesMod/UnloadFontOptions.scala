package typings.expoFont.fontTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<expo-font.expo-font/build/Font.types.FontResource, 'display'> */
@js.native
trait UnloadFontOptions extends js.Object {
  var display: js.UndefOr[FontDisplay] = js.native
}

object UnloadFontOptions {
  @scala.inline
  def apply(): UnloadFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnloadFontOptions]
  }
  @scala.inline
  implicit class UnloadFontOptionsOps[Self <: UnloadFontOptions] (val x: Self) extends AnyVal {
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
    def setDisplay(value: FontDisplay): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

