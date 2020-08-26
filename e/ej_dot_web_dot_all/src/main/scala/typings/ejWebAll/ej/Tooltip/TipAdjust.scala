package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TipAdjust extends js.Object {
  /** Sets horizontal gap between Tooltip and target element.
    * @Default {0}
    */
  var xValue: js.UndefOr[Double] = js.native
  /** Sets vertical gap between Tooltip and target element.
    * @Default {0}
    */
  var yValue: js.UndefOr[Double] = js.native
}

object TipAdjust {
  @scala.inline
  def apply(): TipAdjust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TipAdjust]
  }
  @scala.inline
  implicit class TipAdjustOps[Self <: TipAdjust] (val x: Self) extends AnyVal {
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
    def setXValue(value: Double): Self = this.set("xValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXValue: Self = this.set("xValue", js.undefined)
    @scala.inline
    def setYValue(value: Double): Self = this.set("yValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYValue: Self = this.set("yValue", js.undefined)
  }
  
}

