package typings.formatjsIntlUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@formatjs/intl-utils.@formatjs/intl-utils/src/diff.Thresholds> */
@js.native
trait PartialThresholds extends js.Object {
  var day: js.UndefOr[Double] = js.native
  var hour: js.UndefOr[Double] = js.native
  var minute: js.UndefOr[Double] = js.native
  var second: js.UndefOr[Double] = js.native
}

object PartialThresholds {
  @scala.inline
  def apply(): PartialThresholds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThresholds]
  }
  @scala.inline
  implicit class PartialThresholdsOps[Self <: PartialThresholds] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
  }
  
}

