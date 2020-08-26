package typings.expoLinearGradient.anon

import typings.expoLinearGradient.linearGradientMod.LinearGradienPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  var colors: js.Array[String] = js.native
  var end: js.UndefOr[LinearGradienPoint | Null] = js.native
  var locations: js.UndefOr[js.Array[Double] | Null] = js.native
  var start: js.UndefOr[LinearGradienPoint | Null] = js.native
}

object Colors {
  @scala.inline
  def apply(colors: js.Array[String]): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: LinearGradienPoint): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndNull: Self = this.set("end", null)
    @scala.inline
    def setLocationsVarargs(value: Double*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Double]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    @scala.inline
    def setStart(value: LinearGradienPoint): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
  
}

