package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFormat extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var liveSearch: js.UndefOr[Boolean] = js.native
  var timezoneOffset: js.UndefOr[Double] = js.native
  var weekOffset: js.UndefOr[Double] = js.native
}

object DateFormat {
  @scala.inline
  def apply(): DateFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormat]
  }
  @scala.inline
  implicit class DateFormatOps[Self <: DateFormat] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setLiveSearch(value: Boolean): Self = this.set("liveSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveSearch: Self = this.set("liveSearch", js.undefined)
    @scala.inline
    def setTimezoneOffset(value: Double): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezoneOffset: Self = this.set("timezoneOffset", js.undefined)
    @scala.inline
    def setWeekOffset(value: Double): Self = this.set("weekOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekOffset: Self = this.set("weekOffset", js.undefined)
  }
  
}

