package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonthDay extends js.Object {
  /** Day of a month, value in [1, 31] range. Valid range depends on the specified month. */
  var day: js.UndefOr[Double] = js.native
  /** Month of a year. e.g. 1 = JAN, 2 = FEB etc. */
  var month: js.UndefOr[Double] = js.native
}

object MonthDay {
  @scala.inline
  def apply(): MonthDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthDay]
  }
  @scala.inline
  implicit class MonthDayOps[Self <: MonthDay] (val x: Self) extends AnyVal {
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
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
  }
  
}

