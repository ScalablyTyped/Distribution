package typings.fabric.anon

import typings.fabric.fabricImplMod.IGradientOptionsColorStops
import typings.fabric.fabricImplMod.IGradientOptionsCoords
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStops extends js.Object {
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.native
  var coords: js.UndefOr[IGradientOptionsCoords] = js.native
  var gradientUnits: js.UndefOr[js.Any] = js.native
  var offsetX: js.UndefOr[js.Any] = js.native
  var offsetY: js.UndefOr[js.Any] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ColorStops {
  @scala.inline
  def apply(): ColorStops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStops]
  }
  @scala.inline
  implicit class ColorStopsOps[Self <: ColorStops] (val x: Self) extends AnyVal {
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
    def setColorStopsVarargs(value: Color*): Self = this.set("colorStops", js.Array(value :_*))
    @scala.inline
    def setColorStops(value: IGradientOptionsColorStops): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStops: Self = this.set("colorStops", js.undefined)
    @scala.inline
    def setCoords(value: IGradientOptionsCoords): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setGradientUnits(value: js.Any): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    @scala.inline
    def setOffsetX(value: js.Any): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: js.Any): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

