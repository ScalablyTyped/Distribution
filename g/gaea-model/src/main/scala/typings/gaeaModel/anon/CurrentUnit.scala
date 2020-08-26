package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentUnit extends js.Object {
  var currentUnit: String = js.native
  var inputRange: js.UndefOr[js.Array[Double]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var outputRange: js.UndefOr[js.Array[Double]] = js.native
  var slider: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var units: js.Array[Number] = js.native
}

object CurrentUnit {
  @scala.inline
  def apply(currentUnit: String, units: js.Array[Number]): CurrentUnit = {
    val __obj = js.Dynamic.literal(currentUnit = currentUnit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentUnit]
  }
  @scala.inline
  implicit class CurrentUnitOps[Self <: CurrentUnit] (val x: Self) extends AnyVal {
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
    def setCurrentUnit(value: String): Self = this.set("currentUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitsVarargs(value: Number*): Self = this.set("units", js.Array(value :_*))
    @scala.inline
    def setUnits(value: js.Array[Number]): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputRangeVarargs(value: Double*): Self = this.set("inputRange", js.Array(value :_*))
    @scala.inline
    def setInputRange(value: js.Array[Double]): Self = this.set("inputRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputRange: Self = this.set("inputRange", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOutputRangeVarargs(value: Double*): Self = this.set("outputRange", js.Array(value :_*))
    @scala.inline
    def setOutputRange(value: js.Array[Double]): Self = this.set("outputRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputRange: Self = this.set("outputRange", js.undefined)
    @scala.inline
    def setSlider(value: Boolean): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlider: Self = this.set("slider", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

