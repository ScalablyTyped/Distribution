package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeMaxPoint extends js.Object {
  var rangeMaxPoint: js.UndefOr[Double] = js.native
  var rangeMinPoint: js.UndefOr[Double] = js.native
}

object RangeMaxPoint {
  @scala.inline
  def apply(): RangeMaxPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeMaxPoint]
  }
  @scala.inline
  implicit class RangeMaxPointOps[Self <: RangeMaxPoint] (val x: Self) extends AnyVal {
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
    def setRangeMaxPoint(value: Double): Self = this.set("rangeMaxPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMaxPoint: Self = this.set("rangeMaxPoint", js.undefined)
    @scala.inline
    def setRangeMinPoint(value: Double): Self = this.set("rangeMinPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeMinPoint: Self = this.set("rangeMinPoint", js.undefined)
  }
  
}

