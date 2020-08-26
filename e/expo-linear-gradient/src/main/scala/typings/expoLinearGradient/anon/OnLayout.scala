package typings.expoLinearGradient.anon

import typings.expoLinearGradient.nativeLinearGradientWebMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLayout extends js.Object {
  var colors: js.Array[Double] = js.native
  var endPoint: js.UndefOr[Point | Null] = js.native
  var locations: js.UndefOr[js.Array[Double] | Null] = js.native
  var onLayout: js.UndefOr[js.Function] = js.native
  var startPoint: js.UndefOr[Point | Null] = js.native
}

object OnLayout {
  @scala.inline
  def apply(colors: js.Array[Double]): OnLayout = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLayout]
  }
  @scala.inline
  implicit class OnLayoutOps[Self <: OnLayout] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: Double*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Double]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPoint(value: Point): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndPoint: Self = this.set("endPoint", js.undefined)
    @scala.inline
    def setEndPointNull: Self = this.set("endPoint", null)
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    @scala.inline
    def setOnLayout(value: js.Function): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setStartPoint(value: Point): Self = this.set("startPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPoint: Self = this.set("startPoint", js.undefined)
    @scala.inline
    def setStartPointNull: Self = this.set("startPoint", null)
  }
  
}

