package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleBreak extends js.Object {
  /** @name ScaleBreak.endValue */
  var endValue: js.UndefOr[Double | Date | String] = js.native
  /** @name ScaleBreak.startValue */
  var startValue: js.UndefOr[Double | Date | String] = js.native
}

object ScaleBreak {
  @scala.inline
  def apply(): ScaleBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleBreak]
  }
  @scala.inline
  implicit class ScaleBreakOps[Self <: ScaleBreak] (val x: Self) extends AnyVal {
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
    def setEndValue(value: Double | Date | String): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    @scala.inline
    def setStartValue(value: Double | Date | String): Self = this.set("startValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartValue: Self = this.set("startValue", js.undefined)
  }
  
}

