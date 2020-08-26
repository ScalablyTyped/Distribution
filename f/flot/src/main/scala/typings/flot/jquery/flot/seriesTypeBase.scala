package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait seriesTypeBase extends js.Object {
  var fill: js.UndefOr[js.Any] = js.native
                //boolean or number
  var fillColor: js.UndefOr[js.Any] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object seriesTypeBase {
  @scala.inline
  def apply(): seriesTypeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[seriesTypeBase]
  }
  @scala.inline
  implicit class seriesTypeBaseOps[Self <: seriesTypeBase] (val x: Self) extends AnyVal {
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
    def setFill(value: js.Any): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillColor(value: js.Any): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

