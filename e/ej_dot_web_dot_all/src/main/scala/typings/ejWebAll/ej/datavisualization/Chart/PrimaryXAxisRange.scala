package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryXAxisRange extends js.Object {
  /** Interval of the axis range.
    * @Default {null}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Maximum value of the axis range.
    * @Default {null}
    */
  var max: js.UndefOr[Double] = js.native
  /** Minimum value of the axis range.
    * @Default {null}
    */
  var min: js.UndefOr[Double] = js.native
}

object PrimaryXAxisRange {
  @scala.inline
  def apply(): PrimaryXAxisRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryXAxisRange]
  }
  @scala.inline
  implicit class PrimaryXAxisRangeOps[Self <: PrimaryXAxisRange] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

