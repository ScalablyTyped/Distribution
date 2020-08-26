package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilter extends js.Object {
  /**
    * List of dates that match the media items' creation date. A maximum of
    * 5 dates can be included per request.
    */
  var dates: js.UndefOr[js.Array[Date]] = js.native
  /**
    * List of dates ranges that match the media items' creation date. A
    * maximum of 5 dates ranges can be included per request.
    */
  var ranges: js.UndefOr[js.Array[DateRange]] = js.native
}

object DateFilter {
  @scala.inline
  def apply(): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFilter]
  }
  @scala.inline
  implicit class DateFilterOps[Self <: DateFilter] (val x: Self) extends AnyVal {
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
    def setDatesVarargs(value: Date*): Self = this.set("dates", js.Array(value :_*))
    @scala.inline
    def setDates(value: js.Array[Date]): Self = this.set("dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDates: Self = this.set("dates", js.undefined)
    @scala.inline
    def setRangesVarargs(value: DateRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[DateRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
  
}

