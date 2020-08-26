package typings.devextreme.anon

import typings.devextreme.devextremeStrings.gradient
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.source
import typings.devextreme.devextremeStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMode extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var color: js.UndefOr[String] = js.native
  var colorMode: js.UndefOr[none | source | target | gradient] = js.native
  var hoverStyle: js.UndefOr[ColorHatching] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object ColorMode {
  @scala.inline
  def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  @scala.inline
  implicit class ColorModeOps[Self <: ColorMode] (val x: Self) extends AnyVal {
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
    def setBorder(value: ColorVisible): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorMode(value: none | source | target | gradient): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMode: Self = this.set("colorMode", js.undefined)
    @scala.inline
    def setHoverStyle(value: ColorHatching): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

