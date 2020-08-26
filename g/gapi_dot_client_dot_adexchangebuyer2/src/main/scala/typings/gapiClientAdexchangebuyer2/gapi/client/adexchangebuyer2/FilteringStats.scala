package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteringStats extends js.Object {
  /**
    * The day during which the data was collected.
    * The data is collected from 00:00:00 to 23:59:59 PT.
    * During switches from PST to PDT and back, the day may
    * contain 23 or 25 hours of data instead of the usual 24.
    */
  var date: js.UndefOr[Date] = js.native
  /** The set of filtering reasons for this date. */
  var reasons: js.UndefOr[js.Array[Reason]] = js.native
}

object FilteringStats {
  @scala.inline
  def apply(): FilteringStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringStats]
  }
  @scala.inline
  implicit class FilteringStatsOps[Self <: FilteringStats] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setReasonsVarargs(value: Reason*): Self = this.set("reasons", js.Array(value :_*))
    @scala.inline
    def setReasons(value: js.Array[Reason]): Self = this.set("reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasons: Self = this.set("reasons", js.undefined)
  }
  
}

