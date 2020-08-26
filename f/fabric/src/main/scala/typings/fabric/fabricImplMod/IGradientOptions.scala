package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradientOptions extends js.Object {
  /**
    * Color stops object eg. {0:string; 1:string;
    */
  var colorStops: js.UndefOr[IGradientOptionsColorStops] = js.native
  var coords: js.UndefOr[IGradientOptionsCoords] = js.native
  var gradientTransform: js.UndefOr[js.Any] = js.native
  /**
    * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * Vertical offset for aligning gradients coming from SVG when outside pathgroups
    * @type Number
    */
  var offsetY: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object IGradientOptions {
  @scala.inline
  def apply(): IGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradientOptions]
  }
  @scala.inline
  implicit class IGradientOptionsOps[Self <: IGradientOptions] (val x: Self) extends AnyVal {
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
    def setColorStopsVarargs(value: typings.fabric.anon.Color*): Self = this.set("colorStops", js.Array(value :_*))
    @scala.inline
    def setColorStops(value: IGradientOptionsColorStops): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStops: Self = this.set("colorStops", js.undefined)
    @scala.inline
    def setCoords(value: IGradientOptionsCoords): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setGradientTransform(value: js.Any): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

