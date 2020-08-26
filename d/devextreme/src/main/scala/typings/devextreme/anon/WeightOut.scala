package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightOut extends js.Object {
  var label: js.UndefOr[String] = js.native
  var weightIn: js.UndefOr[Double] = js.native
  var weightOut: js.UndefOr[Double] = js.native
}

object WeightOut {
  @scala.inline
  def apply(): WeightOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightOut]
  }
  @scala.inline
  implicit class WeightOutOps[Self <: WeightOut] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setWeightIn(value: Double): Self = this.set("weightIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightIn: Self = this.set("weightIn", js.undefined)
    @scala.inline
    def setWeightOut(value: Double): Self = this.set("weightOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightOut: Self = this.set("weightOut", js.undefined)
  }
  
}

