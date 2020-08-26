package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OGradientOptions extends js.Object {
  var colorStops: js.UndefOr[StringDictionary[String]] = js.native
  var gradientTransform: js.UndefOr[js.Any] = js.native
  var r1: js.UndefOr[Double] = js.native
  var r2: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var x1: js.UndefOr[Double] = js.native
  var x2: js.UndefOr[Double] = js.native
  var y1: js.UndefOr[Double] = js.native
  var y2: js.UndefOr[Double] = js.native
}

object OGradientOptions {
  @scala.inline
  def apply(): OGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OGradientOptions]
  }
  @scala.inline
  implicit class OGradientOptionsOps[Self <: OGradientOptions] (val x: Self) extends AnyVal {
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
    def setColorStops(value: StringDictionary[String]): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStops: Self = this.set("colorStops", js.undefined)
    @scala.inline
    def setGradientTransform(value: js.Any): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR1: Self = this.set("r1", js.undefined)
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR2: Self = this.set("r2", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
  
}

