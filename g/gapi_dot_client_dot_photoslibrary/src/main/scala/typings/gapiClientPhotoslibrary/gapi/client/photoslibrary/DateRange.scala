package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRange extends js.Object {
  /**
    * The end date (included as part of the range). It must be specified in the
    * same format as the start date.
    */
  var endDate: js.UndefOr[Date] = js.native
  /**
    * The start date (included as part of the range) in one of the formats
    * described.
    */
  var startDate: js.UndefOr[Date] = js.native
}

object DateRange {
  @scala.inline
  def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  @scala.inline
  implicit class DateRangeOps[Self <: DateRange] (val x: Self) extends AnyVal {
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
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}

