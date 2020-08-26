package typings.flatpickr.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangeLimit[D] extends js.Object {
  var from: D = js.native
  var to: D = js.native
}

object DateRangeLimit {
  @scala.inline
  def apply[D](from: D, to: D): DateRangeLimit[D] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangeLimit[D]]
  }
  @scala.inline
  implicit class DateRangeLimitOps[Self <: DateRangeLimit[_], D] (val x: Self with DateRangeLimit[D]) extends AnyVal {
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
    def setFrom(value: D): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: D): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

